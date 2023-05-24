package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var listofnote = ArrayList<Note>()
    private lateinit var iding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        iding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(iding.root)

        listofnote.add(Note(1,"ookgokgogk","gg0o0t05t0t"))
        listofnote.add(Note(2,"ookgokgogk","gg0o0t05t0t"))
        listofnote.add(Note(3,"ookgokgogk","gg0o0t05t0t"))
        listofnote.add(Note(4,"ookgokgogk","gg0o0t05t0t"))
        var adapter = Adapterca(this,listofnote)
        iding.listview.adapter = adapter

    }
}