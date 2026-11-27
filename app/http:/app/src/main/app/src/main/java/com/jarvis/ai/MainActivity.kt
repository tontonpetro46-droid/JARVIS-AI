package com.jarvis.ai

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(3, 8, 20))
            setPadding(30, 30, 30, 30)
        }

        val title = TextView(this).apply {
            text = "J.A.R.V.I.S"
            textSize = 34f
            setTextColor(Color.rgb(40, 160, 255))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "SYSTÈME D'INTELLIGENCE ARTIFICIELLE"
            textSize = 13f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "\nSYSTÈME EN ATTENTE\n\nDites : JARVIS"
            textSize = 18f
            setTextColor(Color.rgb(60, 180, 255))
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)

        setContentView(layout)
    }
}
