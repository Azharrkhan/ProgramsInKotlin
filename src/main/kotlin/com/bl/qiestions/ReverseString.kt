package com.bl.qiestions

import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    println("Enter the String")
    var str = sc.next()
    var revStr = str.reversed()

    for(i in str.length-1 downTo 0){
            revStr += str[i]
        }
    println(revStr)
}
