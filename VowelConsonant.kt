package com.bl.qiestions

import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    println("Enter the Name")
    var name = sc.next()
    name = name.lowercase()

    var vowelCount: Int = 0
    var consonantCount: Int = 0

    var vowelArray = arrayOf('a', 'e', 'i', 'o', 'u','A','E','I','O','U')
    for (i in 0..name.length - 1) {
        val ch = name.toCharArray(0)

        for (j in 0..vowelArray.size - 1) {
            if (ch[i] == vowelArray[j]) {
                vowelCount++
            }
        }
    }
    consonantCount = name.length - vowelCount

    println("Total no of vowel are:" + vowelCount)
    println("Total no of consonant are:" + consonantCount)
}