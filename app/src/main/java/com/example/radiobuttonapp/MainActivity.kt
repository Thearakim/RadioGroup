package com.example.radiobuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            var selR = group.checkedRadioButtonId
            when(selR){
                R.id.op1->
                {
                    Toast.makeText(this, "Option1", Toast.LENGTH_LONG).show()
                }
                R.id.op2->
                {
                    Toast.makeText(this, "Option2", Toast.LENGTH_LONG).show()
                }
                R.id.op3->
                {
                    Toast.makeText(this, "Option3", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
