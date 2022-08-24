package com.example.vespauladesafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val capaUm = findViewById<Button>(R.id.bt1)

        capaUm.setOnClickListener {

            irParaCapaUm()
        }
        val capaDois = findViewById<Button>(R.id.bt2)

        capaDois.setOnClickListener {

            irParaCapaDois()
        }
        val capaTres = findViewById<Button>(R.id.bt3)

        capaTres.setOnClickListener {

            irParaCapaTres()
        }
        val torsoUm = findViewById<Button>(R.id.bt4)

        torsoUm.setOnClickListener {

            irParaTorsoUm()
        }
        val torsoDois = findViewById<Button>(R.id.bt5)

        torsoDois.setOnClickListener {

            irParaTorsoDois()
        }
        val torsoTres = findViewById<Button>(R.id.bt6)

        torsoTres.setOnClickListener {

            irParaTorsoTres()
        }
        val calcaUm = findViewById<Button>(R.id.bt7)

        calcaUm.setOnClickListener {

            irParaCalcaUm()
        }
        val calcaDois = findViewById<Button>(R.id.bt8)

        calcaDois.setOnClickListener {

            irParaCalcaDois()
        }
        val calcaTres = findViewById<Button>(R.id.bt9)

        calcaTres.setOnClickListener {

            irParaCalcaTres()
        }
        val armaUm = findViewById<Button>(R.id.bt10)

        armaUm.setOnClickListener {

            irParaArmaUm()
        }
        val armaDois = findViewById<Button>(R.id.bt11)

        armaDois.setOnClickListener {

            irParaArmaDois()
        }
        val armaTres = findViewById<Button>(R.id.bt12)

        armaTres.setOnClickListener {

            irParaArmaTres()
        }
    }


    private fun irParaCapaUm() {

        val capaUm = Intent(this, capaUm::class.java)
        startActivity(capaUm)
    }

    private fun irParaCapaDois() {

        val capaDois = Intent(this, capaDois::class.java)
        startActivity(capaDois)
    }

    private fun irParaCapaTres() {

        val capaTres = Intent(this, capaTres::class.java)
        startActivity(capaTres)
    }

    private fun irParaTorsoUm() {

        val torsoUm = Intent(this, torsoUm::class.java)
        startActivity(torsoUm)
    }

    private fun irParaTorsoDois() {

        val torsoDois = Intent(this, torsoDois::class.java)
        startActivity(torsoDois)
    }

    private fun irParaTorsoTres() {

        val torsoTres = Intent(this, torsoTres::class.java)
        startActivity(torsoTres)
    }

    private fun irParaCalcaUm() {

        val calcaUm = Intent(this, calcaUm::class.java)
        startActivity(calcaUm)
    }

    private fun irParaCalcaDois() {

        val calcaDois = Intent(this, calcaDois::class.java)
        startActivity(calcaDois)
    }

    private fun irParaCalcaTres() {

        val calcaTres = Intent(this, calcaTres::class.java)
        startActivity(calcaTres)
    }

    private fun irParaArmaUm() {

        val armaUm = Intent(this, armaUm::class.java)
        startActivity(armaUm)
    }

    private fun irParaArmaDois() {

        val armaDois = Intent(this, armaDois::class.java)
        startActivity(armaDois)
    }

    private fun irParaArmaTres() {

        val armaTres = Intent(this, armaTres::class.java)
        startActivity(armaTres)
    }
}