package com.newzone.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import com.newzone.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
    }
    /*intent는 데이터를 담는 클래스임*/

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu,menu)

        //MenuItem 객체를 얻고 그 안에 포함된 ActionView 객체 획득
        val menuitem = menu?.findItem(R.id.action_search)
        val searchView = menuitem?.actionView as SearchView
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                TODO("Not yet implemented")
                //검색어 변경 이벤트
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
                //키보드의 검색 버튼을 클릭한 순간의 이벤트
                Log.d("NewZone","search text: $query")
                return true
            }

        })

        val menuItem1: MenuItem? = menu?.add(0,0,0,"홈")
        val menuItem2: MenuItem? = menu?.add(0,1,0,"기차타기")
        val menuItem3: MenuItem? = menu?.add(0,2,0,"계획짜기")
        val menuItem4: MenuItem? = menu?.add(0,3,0,"물어보기")
        val menuItem5: MenuItem? = menu?.add(0,4,0,"이벤트")

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {

        0 -> {
            Log.d("NewZone","홈 클릭!")
            true
        }
        1 -> {
            Log.d("NewZone","기차타기 클릭!")
            true
        }
        2 -> {
            Log.d("NewZone","계획짜기 클릭!")
            true
        }
        3 -> {
            Log.d("NewZone","물어보기 클릭!")
            true
        }
        4 -> {
            Log.d("NewZone","이벤트 클릭!")
            true
        }

        else -> super.onOptionsItemSelected(item)
    }
}