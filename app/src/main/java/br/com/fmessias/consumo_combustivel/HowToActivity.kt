package br.com.fmessias.consumo_combustivel

import android.os.Bundle
import android.app.Activity
import android.widget.ImageView

import kotlinx.android.synthetic.main.activity_how_to.*

class HowToActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to)

        val imagemBackground = findViewById<ImageView>(R.id.imageView_background)

        imagemBackground.alpha = 0.2F
    }

}
