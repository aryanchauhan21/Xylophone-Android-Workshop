package com.leotarius.xylophoneworkshop

import android.content.Context
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundPool: SoundPool = SoundPool.Builder()
                .setMaxStreams(7)
                .build()

        val tunes = IntArray(7)
        tunes[0] = soundPool.load(applicationContext, R.raw.note1_c, 1)
        tunes[1] = soundPool.load(applicationContext, R.raw.note2_d, 1)
        tunes[2] = soundPool.load(applicationContext, R.raw.note3_e, 1)
        tunes[3] = soundPool.load(applicationContext, R.raw.note4_f, 1)
        tunes[4] = soundPool.load(applicationContext, R.raw.note5_g, 1)
        tunes[5] = soundPool.load(applicationContext, R.raw.note6_a, 1)
        tunes[6] = soundPool.load(applicationContext, R.raw.note7_b, 1)

        btn1.setOnClickListener { soundPool.play(tunes[0], 1f, 1f, 0, 0, 1.0f) }
        btn2.setOnClickListener { soundPool.play(tunes[1], 1f, 1f, 0, 0, 1.0f) }
        btn3.setOnClickListener { soundPool.play(tunes[2], 1f, 1f, 0, 0, 1.0f) }
        btn4.setOnClickListener { soundPool.play(tunes[3], 1f, 1f, 0, 0, 1.0f) }
        btn5.setOnClickListener { soundPool.play(tunes[4], 1f, 1f, 0, 0, 1.0f) }
        btn6.setOnClickListener { soundPool.play(tunes[5], 1f, 1f, 0, 0, 1.0f) }
        btn7.setOnClickListener { soundPool.play(tunes[6], 1f, 1f, 0, 0, 1.0f) }

    }
}