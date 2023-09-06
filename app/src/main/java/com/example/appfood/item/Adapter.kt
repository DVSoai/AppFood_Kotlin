package com.example.appfood.item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appfood.R

class Adapter(private val dsFood: ArrayList<Item>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    val list: ArrayList<Item> = ArrayList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val image: ImageView
        val textView: TextView
        val checkbox : CheckBox

        init {
            textView = view.findViewById(R.id.tvName)
            image = view.findViewById(R.id.imgfood)
            checkbox = view.findViewById(R.id.isCheck)
        }
    }
    // Taọ chế độ  xem mới
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item, viewGroup, false)

        return ViewHolder(view)
    }

    // Thay thế nội dung chế độ xem (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Lấy phần tử từ tập dữ liệu của bạn ở vị trí này và thay thế
        // nội dung của view với phần tử đó
        viewHolder.textView.text = dsFood[position].name
        viewHolder.image.setImageResource(dsFood[position].image)
        viewHolder.checkbox.setOnCheckedChangeListener{_, isCheck ->
            if(isCheck) {
                list.add(dsFood[position])
            }
        }
    }

    // Trả về kích thước của tập dữ liệu của bạn (invoked by the layout manager)
    override fun getItemCount(): Int {
        return dsFood.size
    }
}