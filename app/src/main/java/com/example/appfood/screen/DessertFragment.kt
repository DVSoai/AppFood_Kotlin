package com.example.appfood.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appfood.R
import com.example.appfood.item.Adapter
import com.example.appfood.model.ViewModel


class DessertFragment : Fragment() {
    private lateinit var adapter: Adapter
    private  lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_dessert, container, false)

        val rcvList = view.findViewById<RecyclerView>(R.id.rcvList)
        rcvList.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val btnNext = view.findViewById<Button>(R.id.btnNext)
        val btnBack = view.findViewById<Button>(R.id.btnBack)
        viewModel = ViewModelProvider(requireContext() as ViewModelStoreOwner).get(ViewModel::class.java)

        viewModel.createDessert().observe(requireContext() as LifecycleOwner,{
            adapter = Adapter(it)
            rcvList.adapter = adapter
        })


        btnNext.setOnClickListener {
            view.findNavController().navigate(R.id.action_dessertFragment_to_beverageFragment)
            for(i in adapter.list)
                viewModel.getData().value?.add(i)


        }

        btnBack.setOnClickListener {
            view.findNavController().popBackStack()
        }

        return view
    }



}