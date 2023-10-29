package com.example.listview_20231029.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview_20231029.R
import com.example.listview_20231029.datas.StudnetData

// 어탭터를 만들었으면 상속 부터 받자.

// 어떤 타입의 데이터를 받아올것인지 <> 로 설정해야함.
class StudnetAdapter(
    // ArrayAdapter는 기본 생성자를 지원 안함 , 파라미터 값을 넣어서 받아야함.
    // 어댑터 클래스가 생성자에게 부모(studentData)에게서 받아오게

    // ListView 커스텀 작업도 여기서 한다.
    mContext : Context,
    resID : Int,
    mList : ArrayList<StudnetData>
) : ArrayAdapter<StudnetData>(mContext,resID,mList) {
    // 커스텀으로 만든 xml을 -> 코틀린에서 끌어와주는 객체 작성
    val inf = LayoutInflater.from(mContext)


    // 완성한 inf를 이용해서 xml을 가져오는 함수 작성
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
                                                   // 레이아웃 ,  부가정보
            tempRow = inf.inflate(R.layout.student_list_item , null)
        }

        val row = tempRow!!

        return row
    }
}