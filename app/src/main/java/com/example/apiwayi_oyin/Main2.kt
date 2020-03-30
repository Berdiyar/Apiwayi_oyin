package com.example.apiwayi_oyin

import android.content.Intent
import android.opengl.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.Random
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2 : AppCompatActivity() {

    private val random = Random()
    private var durisjuwap: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        generatsiylaw()

    }

    fun basilganda(view: View){
        val basil = (view as Button).toString().toInt()
        if(basil==durisjuwap){
            generatsiylaw()
        }
        else{
            val sms = Intent (this, Main3::class.java)
            startActivity(sms)
            finish()
        }


    }

    fun generatsiylaw(){

        val bir = Random().nextInt(100)
        val eki = Random().nextInt(100)
        val belgi = Random().nextInt(4)

        when(belgi){
            0->soraw.text = "$bir + $eki"
            1->soraw.text = "$bir - $eki"
            2->soraw.text = "$bir * $eki"
            else->soraw.text = "$bir / $eki"
        }
        durisjuwap = when(belgi){
            0->bir + eki
            1->bir - eki
            2->bir * eki
            else->bir / eki
        }

        qate_juwap_generatsiyasi(juwap_1)
        qate_juwap_generatsiyasi(juwap_2)
        qate_juwap_generatsiyasi(juwap_3)
        qate_juwap_generatsiyasi(juwap_4)

        when(random.nextInt(4)){
            0->{
                juwap_1.text = durisjuwap.toString()
            }
            1->{
                juwap_2.text = durisjuwap.toString()
                }
            2-> {
                juwap_3.text = durisjuwap.toString()

            }
            else->{
                juwap_4.text = durisjuwap.toString()
            }
        }



    }
    private fun qate_juwap_generatsiyasi(button: Button){
        when(random.nextBoolean()){
            true->{
                button.text = (durisjuwap + random.nextInt(100)+1).toString()
            }
            false->{
                button.text = (durisjuwap - random.nextInt(100)+1).toString()
            }
        }
    }

}
