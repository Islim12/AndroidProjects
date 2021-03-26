package org.islimakkaya.samples.application.passingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PageYActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_y)
    }

    override fun onBackPressed() {
        val intent = Intent(this@PageYActivity, MainActivity::class.java)
        startActivity(intent)
    }
}