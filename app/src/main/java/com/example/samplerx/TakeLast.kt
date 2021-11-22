package com.example.samplerx

import android.annotation.SuppressLint
import io.reactivex.Observable

@SuppressLint("CheckResult")
private fun main () {
    takeLast()?.subscribe{a->println(message = a)}
}

fun takeLast() : Observable<Int>?{
    return Observable.just(32,10,45,60).takeLast(2)
}