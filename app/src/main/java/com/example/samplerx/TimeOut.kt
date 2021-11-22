package com.example.samplerx

import android.annotation.SuppressLint
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

@SuppressLint("CheckResult")
fun main () {
   timeOut("mahadev")?.subscribe(
       {
       name ->
           println("Hello Bhagwan :$name")
       },{
           //here it lambda is throwable for errors
           it ->
           println("Error"+it.javaClass.simpleName)
   }
   )
}

private fun timeOut(name:String):Observable<String>? {

    return Observable.fromCallable {
    if (name == "mahadev")
    Thread.sleep(10)
        name
    }.timeout(10,TimeUnit.MILLISECONDS)

}