package com.example.appfood.item

import com.example.appfood.R

object Food {
    fun getMainCourse() : ArrayList<Item> {
        val courseList = ArrayList<Item>()

        val course1 = Item (
            R.drawable.com, "Cơm" , false
        )
        val course2 = Item (
            R.drawable.com, "Cơmm" , false
        )
        val course3 = Item (
            R.drawable.com, "Cơmmm" , false
        )
        courseList.add(course1)
        courseList.add(course2)
        courseList.add(course3)

        return courseList
    }


    fun  getSideDish() : ArrayList<Item> {
        val dishList = ArrayList<Item>()

        val dish1 = Item (
            R.drawable.phu, "Thịt" , false
        )
        val dish2 = Item (
            R.drawable.phu, "Thịtt" , false
        )
        val dish3 = Item (
            R.drawable.phu, "Thịttt" , false
        )
        dishList.add(dish1)
        dishList.add(dish2)
        dishList.add(dish3)

        return dishList
    }

    fun  getDessert() : ArrayList<Item> {
        val dessertList = ArrayList<Item>()

        val dessert1 = Item (
            R.drawable.trangmieng, "Kem" , false
        )
        val dessert2 = Item (
            R.drawable.trangmieng, "Kemm" , false
        )
        val dessert3 = Item (
            R.drawable.trangmieng, "Kemmm" , false
        )
        dessertList.add(dessert1)
        dessertList.add(dessert2)
        dessertList.add(dessert3)

        return dessertList
    }

    fun  getBeverage() : ArrayList<Item> {
        val beverageList = ArrayList<Item>()

        val beverage1 = Item (
            R.drawable.nuoc, "Nước" , false
        )
        val beverage2 = Item (
            R.drawable.nuoc, "Nướcc" , false
        )
        val beverage3 = Item (
            R.drawable.nuoc, "Nướccc" , false
        )
        beverageList.add(beverage1)
        beverageList.add(beverage2)
        beverageList.add(beverage3)

        return beverageList
    }
}