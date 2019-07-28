package com.example.calculator

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Half.toFloat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.annotations.Nullable

class MainActivity : AppCompatActivity() {

    private lateinit var et1: EditText
    private lateinit var et2: EditText

    private lateinit var tv1: TextView
    private lateinit var tv2: TextView

    private lateinit var bt1: Button
    private lateinit var bt2: Button
    private lateinit var bt3: Button
    private lateinit var bt4: Button
    private lateinit var bt5: Button

    var res: Float = 0f

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.num_a)
        et2 = findViewById(R.id.num_b)

        tv1 = findViewById(R.id.showres)
        tv2 = findViewById(R.id.answer)

        bt1 = findViewById(R.id.btn_add)
        bt2 = findViewById(R.id.btn_sub)
        bt3 = findViewById(R.id.btn_div)
        bt4 = findViewById(R.id.btn_mul)
        bt5 = findViewById(R.id.btn_clr)

        btn_add.setOnClickListener {
            tv1.setText("Add")
            val num1: String = et1.getText().toString()
            val num2: String = et2.getText().toString()
            if (num1 == "" || num2 == "") {
                tv1.setText("Error")
                tv2.setText("Enter Number")
            } else {
                res = num1.toFloat() + num2.toFloat()
                tv2.setText(res.toString())
            }
        }
        btn_sub.setOnClickListener {
            tv1.setText("Subtract")
            val num1: String = et1.getText().toString()
            val num2: String = et2.getText().toString()
            if (num1 == "" || num2 == "") {
                tv1.setText("Error")
                tv2.setText("Enter Number")
            } else {
                res = num1.toFloat() - num2.toFloat()
                tv2.setText(res.toString())
            }
        }
        btn_mul.setOnClickListener {
            tv1.setText("Multiply")
            val num1: String = et1.getText().toString()
            val num2: String = et2.getText().toString()
            if (num1 == "" || num2 == "") {
                tv1.setText("Error")
                tv2.setText("Enter Number")
            } else {
                res = num1.toFloat() * num2.toFloat()
                tv2.setText(res.toString())
            }
        }
        btn_div.setOnClickListener {
            tv1.setText("Divide")
            val num1: String = et1.getText().toString()
            val num2: String = et2.getText().toString()
            if (num1 == "" || num2 == "") {
                tv1.setText("Error")
                tv2.setText("Enter Number")
            } else {
                if (num2 == "0") {
                    tv2.setText("can't divide by zero")
                } else {
                    res = num1.toFloat() / num2.toFloat()
                    tv2.setText(res.toString())
                }
            }
        }
        btn_clr.setOnClickListener {
            et1.setText("")
            et2.setText("")
            tv1.setText("Answer")
            tv2.setText("")
        }
        btn_mod.setOnClickListener {
            tv1.setText("Modulo")
            val num1: String = et1.getText().toString()
            val num2: String = et2.getText().toString()
            if (num1 == "" || num2 == "") {
                tv1.setText("Error")
                tv2.setText("Enter Number")
            } else {
                res = num1.toFloat() % num2.toFloat()
                tv2.setText(res.toString())
            }
        }
    }
}