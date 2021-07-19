package com.tom.guess

import androidx.appcompat.app.AppCompatActivity//androidx = android extensions
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

//主要畫面
class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// onCreate 產生後會自動執行方法，初始值設定
        setContentView(R.layout.activity_main)// setContentView 設定內容畫面
        //R類別(com.tom.guess.R)自動掃描產生，控管專案Resources(res資料夾)
        //Drawable 圖檔 layout 畫面配置 values 資料(顏色,字串,樣式)

        Log.d("MainActivity", "secret: ${secretNumber.secret}")
    }

    fun check(view: View) {
        val n = ed_number.text.toString().toInt()//text editable 可編輯
        //println("number: $n")
        Log.d("MainActivity", "number: $n")//debug專用顯示log

        val diff = secretNumber.validate(n)
        var message = "Yes,you got it"
        if (diff < 0) {
            message = "Bigger"
        } else if (diff > 0) {
            message = "Smaller"
        }

        //Toast.makeText(this, message, Toast.LENGTH_LONG).show()//浮動資料顯示
        //Context AppCompatActivity父類別; CharSequence String父類別
        //makeText(應用程式的Context,訊息文字,Toast的顯示持續時間) this MainActivity

        AlertDialog.Builder(this)//對話框顯示
            .setTitle("Message")
            .setMessage(message)
            .setPositiveButton("OK",null)//在對話方塊中加入正向(YES)的按鈕
            .show()
    }
}