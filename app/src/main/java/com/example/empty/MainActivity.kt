package com.example.empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //text view initilization
        val text = findViewById<TextView>(R.id.operation)
        val text_secondary= findViewById<TextView>(R.id.textView)
        var text_keeper = ""
        var operand = arrayListOf<Int>()

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
        val clearbtn =findViewById<Button>(R.id.del)
        //click listeners numbers
       fun texttoinput( v: String): View.OnClickListener? {
            text_keeper = text.text.toString() +v
            text.text = text_keeper.toString()
            return null

       }
        btn0.setOnClickListener{texttoinput(btn0.text.toString())}
        btn1.setOnClickListener{texttoinput(btn1.text.toString())}
        btn2.setOnClickListener{texttoinput(btn2.text.toString())}
        btn3.setOnClickListener{texttoinput(btn3.text.toString())}
        btn4.setOnClickListener{texttoinput(btn4.text.toString())}
        btn5.setOnClickListener{texttoinput(btn5.text.toString())}
        btn6.setOnClickListener {texttoinput(btn6.text.toString())}
        btn7.setOnClickListener {texttoinput(btn7.text.toString())}
        btn8.setOnClickListener {texttoinput(btn8.text.toString())}
        btn9.setOnClickListener {texttoinput(btn9.text.toString())}

        //operATIONS

        btn_add.setOnClickListener {

            if (text.text.toString() != "") {

                operand.add(text.text.toString().toInt())
                text_keeper=""
                for(i in operand.indices){
                    text_keeper +=operand[i].toString()+"+"

                }
                text_secondary.text = text_keeper
                text.text=""

            }
            else{
            Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
        }
        }
        btn_sub.setOnClickListener {
            if (text.text.toString() != "") {

                operand.add(-1*(text.text.toString().toInt()))
                text_keeper=""
                for(i in operand.indices){
                    text_keeper +=operand[i].toString()

                }
                text_secondary.text = text_keeper
                text.text=""

            }
            else{
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            }

        }
        btn_calculate.setOnClickListener {

            var answervalue:Int=0

            if (text_secondary.text.toString() != "") {

              for(i in operand.indices){
                  answervalue=answervalue+operand[i]
              }
                answer.text=answervalue.toString()
            }

            else {
                Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show()
            }
        }

        clearbtn.setOnClickListener{
            text_secondary.text=""
            text.text=""
            answer.text=""
            operand.clear()
            Toast.makeText(this, "everything was cleared", Toast.LENGTH_LONG).show()
        }
    }




}

