package com.mobile.azrinurvani.basicdi

class DarkKnight(private val senjata: Senjata) {

    //Membuat Fungsi yang Mengembalikan Nilai String
    fun setEquip(): String {
        return "Kelompok DarkKnight Bertempur Menggunakan " + senjata.tombak()
    }

}