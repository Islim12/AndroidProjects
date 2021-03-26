package org.islimakkaya.samples.application.passingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPageA.setOnClickListener {
            val intent = Intent(this@MainActivity, PageAActivity::class.java)
            startActivity(intent)
        }

        buttonPageX.setOnClickListener {
            val intent = Intent(this@MainActivity, PageXActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val cikisIntent = Intent(Intent.ACTION_MAIN)
        cikisIntent.addCategory(Intent.CATEGORY_HOME)
        cikisIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(cikisIntent)
    }

}