package com.bl.qiestions

import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    println("Enter the String")
    var str = sc.next()
    str = str.lowercase()
    var flag: Boolean = false
    var vowelCount: Int = 0
    var consonantCount: Int = 0
    var vowelArray = arrayOf('a', 'e', 'i', 'o', 'u','A','E','I','O','U')
    for (i in 0..str.length - 1) {
        val ch = str.toCharArray(0)
        flag=false
        for (j in 0..vowelArray.size - 1) {
            if (ch[i] == vowelArray[j]) {
                vowelCount++
                flag=true
            }
        }
        if(flag==false)
            consonantCount++
    }
    println("Total no of vowel are:" + vowelCount)
    println("Total no of consonant are:" + consonantCount)
}
