package com.mobile.azrinurvani.basicdi

//Class ini nantinya akan diakses oleh Class LightKnight dan DarkKnight
class Senjata(private val namaPedang : String, private val namaTombak:String) {

    //Membuat 2 Buah Fungsi yang Mengenbalikan Nilai String dengan Data Berbeda
    fun tombak(): String {
        return "Tombak"
    }

    fun pedang(): String {
        return "Pedang"
    }
}