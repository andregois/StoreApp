package com.andre.storeapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.andre.storeapp.Adapters.CategoryAdapter
import com.andre.storeapp.Model.Category
import com.andre.storeapp.R
import com.andre.storeapp.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    lateinit var  adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        lv_category.adapter = adapter
    }
}
