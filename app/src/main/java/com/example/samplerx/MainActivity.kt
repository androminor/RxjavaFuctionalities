package com.example.samplerx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataS = Observable.just(10,20,30,40)
        val dataStreamIntegers = object : Observer<Int> {
            override fun onSubscribe(d: Disposable?) {
                println("Disposing data :$d")
            }

            override fun onNext(t: Int?) {
                println("new data incoming : $t")
            }

            override fun onError(e: Throwable?) {
                println("error came :" + e?.message)
            }

            override fun onComplete() {
                println("the data is completed")
            }

        }
            //subscribing the data stream "observables"by observers
        dataS.subscribe(dataStreamIntegers)
    }


}