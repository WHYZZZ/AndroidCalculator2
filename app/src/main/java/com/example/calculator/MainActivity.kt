package com.example.calculator

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText=findViewById<EditText>(R.id.textRes)
        var myNum=""
        var res=""


        buttonOne.setOnClickListener(){
            myNum=myNum+"1"
            editText.setText(myNum)
        }

        buttonTwo.setOnClickListener(){
            myNum=myNum+"2"
            editText.setText(myNum)
        }

        buttonThree.setOnClickListener(){
            myNum=myNum+"3"
            editText.setText(myNum)
        }

        buttonFour.setOnClickListener(){
            myNum=myNum+"4"
            editText.setText(myNum)
        }

        buttonFive.setOnClickListener(){
            myNum=myNum+"5"
            editText.setText(myNum)
        }

        buttonSix.setOnClickListener(){
            myNum=myNum+"6"
            editText.setText(myNum)
        }

        buttonSeven.setOnClickListener(){
            myNum=myNum+"7"
            editText.setText(myNum)
        }

        buttonEight.setOnClickListener(){
            myNum=myNum+"8"
            editText.setText(myNum)
        }

        buttonNine.setOnClickListener(){
            myNum=myNum+"9"
            editText.setText(myNum)
        }

        buttonZero.setOnClickListener(){
            myNum=myNum+"0"
            editText.setText(myNum)
        }

        buttonAdd.setOnClickListener(){
            res=res+myNum
            myNum=""
        }

        buttonEqual.setOnClickListener(){
            
        }
    }








}
