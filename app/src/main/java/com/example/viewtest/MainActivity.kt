package com.example.viewtest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customView = CustomView(this)
        frameLayout.addView((customView))
    }
}

class CustomView(context : Context) : View(context){
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.BLUE
        paint.textSize = 100f
        canvas?.drawText("할룽",50f,100f,paint)

        val paintCircle = Paint()
        paintCircle.color = Color.CYAN
        paintCircle.style = Paint.Style.FILL
        paintCircle.alpha = 50


        canvas?.drawCircle(160f, 300f,500f, paintCircle)

    }
}