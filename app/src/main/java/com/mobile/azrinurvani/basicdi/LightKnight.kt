package com.mobile.azrinurvani.basicdi

class LightKnight(private val senjata: Senjata) {

    //Membuat Fungsi yang mengembalikan Nilai String
    fun setEquip(): String {
        return "Kelompok LightKnight Bertempur Menggunakan " + senjata.pedang()
    }
}