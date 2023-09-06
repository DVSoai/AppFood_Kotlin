package com.example.appfood.model


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appfood.item.Food
import com.example.appfood.item.Item

class ViewModel: ViewModel() {
    private val data : MutableLiveData<ArrayList<Item>> = MutableLiveData()
    private val livedata : MutableLiveData<ArrayList<Item>> = MutableLiveData()



    fun createCourse(): MutableLiveData<ArrayList<Item>> {


        data.postValue(Food.getMainCourse())

        return data

    }

    fun createSideDish() : MutableLiveData<ArrayList<Item>>  {

        data.postValue(Food.getSideDish())
        return data

    }

    fun createDessert() : MutableLiveData<ArrayList<Item>> {

        data.postValue(Food.getDessert())
        return data

    }
    fun createBeverage() : MutableLiveData<ArrayList<Item>> {

        data.postValue(Food.getBeverage())
        return data

    }


    fun addData(list: ArrayList<Item>)
    {
        livedata.postValue(list)
    }


    fun getData(): MutableLiveData<ArrayList<Item>>
    {
        return livedata
    }




}