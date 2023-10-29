package com.example.listview_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.listview_20231029.databinding.ActivityMainBinding
import com.example.listview_20231029.datas.StudnetData

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    val mStudentList = ArrayList<StudnetData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        화면이 켜질때, 학생 목록을 ArrayList에 수기로 추가(임시 방안임.)

        mStudentList.add( StudnetData("조영재",1999,"010-1234-5678"))
        mStudentList.add( StudnetData("박진우",1999,"010-7777-7777"))
        mStudentList.add( StudnetData("우승진",1999,"010-5877-8585"))
        mStudentList.add( StudnetData("임홍인",1999,"010-1010-2350"))


    }
}