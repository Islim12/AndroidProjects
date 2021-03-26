package org.islimakkaya.samples.application.passingactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page_b.*
import kotlinx.android.synthetic.main.activity_page_x.*

class PageBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_b)

        buttonPage.setOnClickListener {
            val intent = Intent(this@PageBActivity, PageYActivity::class.java)
            startActivity(intent)
        }
    }
}