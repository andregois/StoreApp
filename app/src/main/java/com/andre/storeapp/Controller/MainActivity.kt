package com.andre.storeapp.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.andre.storeapp.Adapters.CategoryAdapter
import com.andre.storeapp.Adapters.CategoryRecycleAdapter
import com.andre.storeapp.R
import com.andre.storeapp.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var  adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this, DataService.categories)

        lv_category.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        lv_category.layoutManager = layoutManager
        lv_category.setHasFixedSize(true)

    }
}
