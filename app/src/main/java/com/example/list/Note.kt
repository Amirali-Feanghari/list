package com.example.list

import android.widget.TextView

class Note{
    var id : Int ?= null
    var title : String ?= null
    var desc : String ?= null
    constructor(Id:Int , Title:String,Desc:String){
        id=Id
        title=Title
        desc=Desc
    }
}