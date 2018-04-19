package com.andre.storeapp.Service

import com.andre.storeapp.Model.Category
import com.andre.storeapp.Model.Product

/**
 * Created by andre on 18/04/2018.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$12", "hat02"),
            Product("Devslopes Hat White", "$13", "hat03"),
            Product("Devslopes Hat Snapback", "$14", "hat04")

    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$23", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$24", "hoodie03"),
            Product("Devslopes Black Hoodie", "$25", "hoodie04")
    )

    val shirrts = listOf(
            Product("Devslopes Shirt Black", "$28", "shirt01"),
            Product("Devslopes Badge Light Gray", "$22", "shirt02"),
            Product("Devslopes Shirt Red", "$23", "shirt03"),
            Product("Devslopes Hustle", "$23", "shirt04"),
            Product("Devslopes Studios", "$24", "shirt05")
    )

}