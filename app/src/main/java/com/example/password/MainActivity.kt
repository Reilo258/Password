package com.example.password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var showbtn1: Button;
    lateinit var showbtn2: Button;
    lateinit var okbtn1: Button;
    lateinit var okbtn2: Button;
    lateinit var passBox1: EditText;
    lateinit var passBox2: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showbtn1 = findViewById(R.id.showbtn1);
        showbtn2 = findViewById(R.id.showbtn2);
        passBox1 = findViewById(R.id.passBox1);
        passBox2 = findViewById(R.id.passBox2);

        var pass1 = "";
        var pass2 = "";

        showbtn1.setOnClickListener {
            if(showbtn1.text.toString().equals("Show")){
                passBox1.transformationMethod = HideReturnsTransformationMethod.getInstance();
                showbtn1.text = "Hide";
            } else{
                passBox1.transformationMethod = PasswordTransformationMethod.getInstance();
                showbtn1.text = "Show";
            }
        }
        showbtn2.setOnClickListener {
            if(showbtn2.text.toString().equals("Show")){
                passBox2.transformationMethod = HideReturnsTransformationMethod.getInstance();
                showbtn2.text = "Hide";
            } else{
                passBox2.transformationMethod = PasswordTransformationMethod.getInstance();
                showbtn2.text = "Show";
            }
        }

        okbtn1.setOnClickListener {
            pass1 = passBox1.text.toString();
            if(pass1 == pass2)
                findViewById<TextView>(R.id.textView1).text = "Hasła zgodne";
            else
                findViewById<TextView>(R.id.textView1).text = "Hasła niezgodne";
        }

        okbtn2.setOnClickListener {
            pass2 = passBox2.text.toString();
            if(pass1 == pass2)
                findViewById<TextView>(R.id.textView1).text = "Hasła zgodne";
            else
                findViewById<TextView>(R.id.textView1).text = "Hasła niezgodne";
        }
    }
}