package com.example.listview_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.listview_20231029.adapters.StudnetAdapter
import com.example.listview_20231029.databinding.ActivityMainBinding
import com.example.listview_20231029.datas.StudnetData

class MainActivity : AppCompatActivity() {
    // 어탭터 세팅
    lateinit var mStdAdapter: StudnetAdapter

    lateinit var binding: ActivityMainBinding

    // Arraylist 쓰기 위한 세팅
    val mStudentList = ArrayList<StudnetData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 어댑터 바인딩 작업                여기      ,        어디 xml인지         , 어디 Arraylist
        mStdAdapter = StudnetAdapter(this , R.layout.student_list_item , mStudentList)
        
        // 어탭터 세팅
        binding.studnentListView.adapter = mStdAdapter

//        화면이 켜질때, 학생 목록을 ArrayList에 수기로 추가(임시 방안임.)

        // Arraylist 내용 추가 , 생성자 규칙에 따라서
        mStudentList.add(StudnetData("조영재", 1999, "010-1234-5678"))
        mStudentList.add(StudnetData("박진우", 1999, "010-7777-7777"))
        mStudentList.add(StudnetData("우승진", 1999, "010-5877-8585"))
        mStudentList.add(StudnetData("임홍인", 1999, "010-1010-2350"))
        mStudentList.add(StudnetData("테스트", 2000))


    }
}