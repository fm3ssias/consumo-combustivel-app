package br.com.fmessias.consumo_combustivel

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencias
        val kmText = findViewById<EditText>(R.id.editText_km)
        val gasText = findViewById<EditText>(R.id.editText_gas)
        val consumoFinal = findViewById<TextView>(R.id.txtView_media)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val buttonDicas = findViewById<Button>(R.id.button_dicas)
        val imagemKm = findViewById<ImageView>(R.id.imageView_km)
        val imagemL = findViewById<ImageView>(R.id.imageView_litros)

        imagemKm.alpha = 0.5F
        imagemL.alpha = 0.5F

        buttonCalcular.setOnClickListener{
            consumoFinal.text = calculaConsumoMedia(kmText.text.toString(), gasText.text.toString())
        }

        buttonDicas.setOnClickListener {
            val intent = Intent(this, HowToActivity::class.java)
            startActivity(intent)
        }
    }

    private fun calculaConsumoMedia(km: String, litros: String): String {
        val km: Double = km.toDouble()
        val litros: Double = litros.toDouble()

        return (km/litros).toString()
    }


}
