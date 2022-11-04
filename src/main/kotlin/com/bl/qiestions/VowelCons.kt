package com.bl.qiestions

import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    println("Enter the String")
    var str = sc.next()
    var count: Int = 0
    var count1: Int = 0
    for (i in 0..str.length - 1) {
        val ch = str.toCharArray(i)
        if (ch.contains('a')  || ch.contains('e')  || ch.contains('i')  || ch.contains('o')  || ch.contains('u') ){
            count++
        }
        else{
            count1++
        }
    }
    println("Total no of vowel are:"+ count)
    println("Total no of consonant are:"+ count1)
}