package com.andre.storeapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.andre.storeapp.Model.Category
import com.andre.storeapp.R

/**
 * Created by andre on 18/04/2018.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.iv_category)
        val categoryName: TextView = categoryView.findViewById(R.id.tv_category)

        val category = categories[position]

        categoryName.text = category.title

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }


}