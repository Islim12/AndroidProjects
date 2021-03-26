package org.islimakkaya.samples.application.passingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_a.*

class PageAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_a)

        buttonPageB.setOnClickListener {
            val intent = Intent(this@PageAActivity, PageBActivity::class.java)
            startActivity(intent)
        }
    }
}