package com.andre.storeapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.andre.storeapp.R
import com.andre.storeapp.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        System.err.println(categoryType)
    }
}
