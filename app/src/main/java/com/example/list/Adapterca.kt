package com.example.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapterca(context:Context , Categories:List<Note>) : BaseAdapter()  {
    val cat=Categories
    val con = context
    override fun getCount(): Int {
        return cat.count()
    }

    override fun getItem(p0: Int): Any {
        return cat[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val categoryview:View
        categoryview = LayoutInflater.from(con).inflate(R.layout.listview_item , null )
        val categorytext : TextView = categoryview.findViewById(R.id.textView)
        val categorytext2 :TextView = categoryview.findViewById(R.id.textView2)
        val catp = cat[p0]
        categorytext.text = catp.title
        categorytext2.text = catp.desc

        return categoryview
    }

}