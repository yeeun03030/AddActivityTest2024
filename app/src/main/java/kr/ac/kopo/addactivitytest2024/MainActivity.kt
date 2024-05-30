package kr.ac.kopo.addactivitytest2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnChange = findViewById<Button>(R.id.btnChange)
        var rg = findViewById<RadioGroup>(R.id.rg)

        var intent = Intent(applicationContext, SecondActivity::class.java)
        rg.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                R.id.radioSecond -> intent = Intent(applicationContext, SecondActivity::class.java)
                R.id.radioThird -> intent = Intent(applicationContext, ThirdActivity::class.java)
            }

        }
        btnChange.setOnClickListener {
            startActivity(intent)
        }

    }
}