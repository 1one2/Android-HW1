package com.example.homework.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.homework.R
import com.example.homework.fragments.FourthFragment
import com.example.homework.fragments.SecondFragment
import com.example.homework.fragments.ThirdFragment

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var fs = SecondFragment()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
    fun to3rdFragment(view: View) {
        var fs = FourthFragment()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }
    fun backTo1stFragment(view: View) {
        var fs = SecondFragment()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }
    fun closeApp(view: View) {
        this.finish()
    }
    fun to2ndFragment(view: View) {
        var fs = ThirdFragment()
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.FL,fs)
            commit()
        }
    }

}