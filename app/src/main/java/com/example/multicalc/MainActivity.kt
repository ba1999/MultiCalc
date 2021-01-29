package com.example.multicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private val eingabe1 : EditText by lazy { findViewById(R.id.editTextInput) }
    private val eingabe2 : EditText by lazy { findViewById(R.id.editTextInput2) }
    private val ausgabe : TextView by lazy { findViewById(R.id.textViewOutput) }
    private val btnSimple : Button by lazy { findViewById(R.id.simpleButton) }
    private val radiogroupId : RadioGroup by lazy { findViewById(R.id.radiogroupId) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimple.setOnClickListener {


            val currentId = radiogroupId.checkedRadioButtonId
            if (currentId != -1) {

                val message = eingabe1.text.toString().toInt()
                val message2 = eingabe2.text.toString().toInt()

                    val Zahl = message
                    val Zahl2 = message2
                    var Ergebnis = 0.0

                    val radio: RadioButton = findViewById(radiogroupId.checkedRadioButtonId)
                    val checked = radio.isChecked
                    when (radio.getId()) {
                        R.id.radioButton ->
                            if (checked) {
                                Ergebnis = 1.0*Zahl + Zahl2
                            }
                        R.id.radioButton2 ->
                            if (checked) {
                                Ergebnis = 1.0*Zahl * Zahl2
                            }
                        R.id.radioButton3 ->
                            if (checked) {
                                Ergebnis = 1.0*Zahl - Zahl2
                            }
                        R.id.radioButton4 ->
                            if (checked) {
                                Ergebnis = 1.0*Zahl/Zahl2
                            }
                    }
                    ausgabe.text = Ergebnis.toString()
            }
        }
    }
    fun onRadioButtonClicked(view: View){

    }
}