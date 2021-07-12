package com.tom.guess

import androidx.appcompat.app.AppCompatActivity//androidx = android extensions
import android.os.Bundle

//主要畫面
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// onCreate 產生後會自動執行方法，初始值設定
        setContentView(R.layout.activity_main)// setContentView 設定內容畫面
        //R類別(com.tom.guess.R)自動掃描產生，控管專案Resources(res資料夾)
        //Drawable 圖檔 layout 畫面配置 values 資料(顏色,字串,樣式)
    }
}