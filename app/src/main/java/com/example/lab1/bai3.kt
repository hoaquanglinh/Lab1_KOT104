package com.example.lab1

fun main () {
    var a = 0.0
    var b = 0.0
    print("Nhập a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    print("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}