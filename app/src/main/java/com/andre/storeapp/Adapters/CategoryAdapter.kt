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
class CategoryAdapter(private val context: Context,
                      private val categories: List<Category>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.iv_category)
            holder.categoryName = categoryView.findViewById(R.id.tv_category)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryName?.text = category.title
        holder.categoryImage?.setImageResource(resourceId)
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

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}