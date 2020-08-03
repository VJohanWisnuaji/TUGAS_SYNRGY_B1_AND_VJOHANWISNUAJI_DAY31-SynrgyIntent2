package com.studytrial.synrgyintent2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(FragmentPart())
        btn_activity.setOnClickListener {
            var fragment = supportFragmentManager.findFragmentById(fl_container.id) as FragmentPart
            fragment.toastFragment()
        }
    }

    fun toastActivity() {
        Toast.makeText(this, "Dijalankan dari Activity", Toast.LENGTH_SHORT).show()
    }

    private fun loadFragment(fragmentPart: FragmentPart) {
        supportFragmentManager.beginTransaction()
                .replace(fl_container.id, fragmentPart)
                .commit()
    }
}