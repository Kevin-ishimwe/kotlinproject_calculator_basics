package com.example.empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.security.PublicKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //text view initilization
        val text = findViewById<TextView>(R.id.operation)
        val text_secondary= findViewById<TextView>(R.id.textView)
        var text_keeper = ""
        var opA: Int = 0
        var opB: Int

        //getting buttnons
        val btn0 = findViewById<Button>(R.id.button_num0)
        val btn1 = findViewById<Button>(R.id.button_num1)
        val btn2 = findViewById<Button>(R.id.button_num2)
        val btn3 = findViewById<Button>(R.id.button_num3)
        val btn4 = findViewById<Button>(R.id.button_num4)
        val btn5 = findViewById<Button>(R.id.button_num5)
        val btn6 = findViewById<Button>(R.id.button_num6)
        val btn7 = findViewById<Button>(R.id.button_num7)
        val btn8 = findViewById<Button>(R.id.button_num8)
        val btn9 = findViewById<Button>(R.id.button_num9)
        //geting operands
        val btn_add = findViewById<Button>(R.id.button_num_add)
        val btn_sub = findViewById<Button>(R.id.button_num_sub)
        val btn_calculate = findViewById<Button>(R.id.calculate)
        val answer = findViewById<TextView>(R.id.answer)
        //click listeners numbers
        btn0.setOnClickListener {
            text_keeper = text.text.toString() + btn0.text.toString()
            text.text = text_keeper.toString()

        }
        btn1.setOnClickListener {
            text_keeper = text.text.toString() + btn1.text.toString()
            text.text = text_keeper.toString()

        }
        btn2.setOnClickListener {
            text_keeper = text.text.toString() + btn2.text.toString()
            text.text = text_keeper.toString()

        }
        btn3.setOnClickListener {
            text_keeper = text.text.toString() + btn3.text.toString()
            text.text = text_keeper.toString()

        }
        btn4.setOnClickListener {
            text_keeper = text.text.toString() + btn4.text.toString()
            text.text = text_keeper.toString()

        }
        btn5.setOnClickListener {
            text_keeper = text.text.toString() + btn5.text.toString()
            text.text = text_keeper.toString()

        }
        btn6.setOnClickListener {
            text_keeper = text.text.toString() + btn6.text.toString()
            text.text = text_keeper.toString()

        }
        btn7.setOnClickListener {
            text_keeper = text.text.toString() + btn7.text.toString()
            text.text = text_keeper.toString()

        }
        btn8.setOnClickListener {
            text_keeper = text.text.toString() + btn8.text.toString()
            text.text = text_keeper.toString()

        }
        btn9.setOnClickListener {
            text_keeper = text.text.toString() + btn9.text.toString()
            text.text = text_keeper.toString()

        }
        //operATIONS
        btn_add.setOnClickListener {
            if (text.text.toString() != "") {
                opA = text.text.toString().toInt()
                text_keeper = text.text.toString() + btn_add.text.toString()
                text_secondary.text = text_keeper.toString()
                text.text = ""
            }
            else{
            Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
        }
        }
        btn_sub.setOnClickListener {
            if (text.text.toString() != "") {
                opA = text.text.toString().toInt()
                text_keeper = text.text.toString() + btn_sub.text.toString()
                text_secondary.text = text_keeper.toString()
                text.text = ""
            }
            else{
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            }

        }
        btn_calculate.setOnClickListener {

            if (text.text.toString() != "") {
                opB = text.text.toString().toInt()
                text_secondary.text=text_secondary.text.toString()+opB.toString()
                if(text_secondary.text.toString().contains("+")){
                    val answer_value = opB + opA
                    answer.text = "=" + answer_value.toString()
                    text.text = ""
                }
                else{
                    val answer_value = opA - opB
                    answer.text = "=" + answer_value.toString()
                    text.text = ""
                }


            } else {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            }
        }


    }


}