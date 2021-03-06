package com.example.tablelayout

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tag = "TABLE APP"

        addbtn.setOnClickListener {
            if(version.text.isEmpty() || name.text.isEmpty()){
                Toast.makeText(applicationContext, "Please insert version or name", Toast.LENGTH_LONG)
            } else {
                val tableRow = TableRow(applicationContext)
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                tableRow.layoutParams = layoutParams

                val columnOne = TextView(this)
                columnOne.text = version.text.toString()
                columnOne.setPadding(10)
                columnOne.setBackgroundColor(Color.parseColor("#FF5733"))

                val columnTwo = TextView(this)
                columnTwo.text = name.text.toString()
                columnTwo.setPadding(10)
                columnTwo.setBackgroundColor(Color.parseColor("#FF5733"))

                tableRow.addView(columnOne)
                tableRow.addView(columnTwo)
                tableRow.setPadding(0,0,0,10)

                table.addView(tableRow)
                version.text.clear()
                name.text.clear()

                Toast.makeText(applicationContext, "Added new row", Toast.LENGTH_LONG).show()
            }
        }
    }

}