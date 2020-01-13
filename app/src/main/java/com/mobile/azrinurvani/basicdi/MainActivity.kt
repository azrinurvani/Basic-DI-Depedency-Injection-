package com.mobile.azrinurvani.basicdi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*Setelah menggunakan DI (depedency injection), apabila di class senjata
    * terjadi perubahan, maka pada class DarkKnight dan LightKnight tidak perlu
    * diubah kembali, perubahan terjadi hanya pada Main Activity*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaPedang = "Pedang Api"
        val namaTombak = "Tombak Petir"

        val senjata = Senjata(namaPedang,namaTombak)

        //Membuat Instance atau Objec dari Class Light dan Dark Night
        val lightKnight = LightKnight(senjata)
        val darkKnight = DarkKnight(senjata)

        //Menambahkan listener pada Button
        click_me.setOnClickListener {
            //Menampilkan Data pada TextView yang diambil dari Fungsi setEquip dari kedua Class tersebut
            val getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip()
            report.text = getReport
        }
    }
}
