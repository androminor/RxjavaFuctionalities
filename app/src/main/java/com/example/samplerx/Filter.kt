package com.example.samplerx

import io.reactivex.Observable

fun main ()
{
   filterOperator()?.subscribe {a-> print(a) }
}
fun filterOperator(): Observable<Int>? {
    return Observable.just(2,40,30,50).filter{x->x>10}

}