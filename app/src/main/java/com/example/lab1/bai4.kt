package com.example.lab1

fun main() {
    bai41()
    println("-------------------------------")
    bai42()
    println("-------------------------------")
    bai43()
    println("-------------------------------")
    bai44()
    println("-------------------------------")
    bai45()
    println("-------------------------------")
    bai46()
    println("-------------------------------")
    bai47()
    println("-------------------------------")
    bai48()
    println("-------------------------------")
    bai49()
    println("-------------------------------")
    bai410()
}

fun bai41() {
    println("Hello Word")
}

fun bai42() {
    var a = 9
    var b = 3
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}

fun bai43() {
    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }  // 6
}

fun bai44() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                          // 4
}

fun bai45() {
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola")
}

fun bai46() {
    fun describeString(maybeString: String?): String {              // 1
        if (maybeString != null && maybeString.length > 0) {        // 2
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"                           // 3
        }
    }

    println(describeString("Không null"))
}

fun bai47() {
    class Customer                                  // 1

    class Contact(val id: Int, var email: String)   // 2

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}

fun bai48() {
    open class Dog {                // 1
        open fun sayHello() {       // 2
            println("wow wow!")
        }
    }

    class Yorkshire : Dog() {       // 3
        override fun sayHello() {   // 4
            println("wif wif!")
        }
    }

    val dog: Dog = Yorkshire()
    dog.sayHello()
}

fun bai49() {
    fun cases(obj: Any) {
        when (obj) {                                     // 1
            1 -> println("One")                          // 2
            "Hello" -> println("Greeting")               // 3
            is Long -> println("Long")                   // 4
            !is String -> println("Not a string")        // 5
            else -> println("Unknown")                   // 6
        }
    }

    class MyClass

    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun bai410() {
    fun eatACake() = println("Eat a Cake")
    fun bakeACake() = println("Bake a Cake")

    fun man() {
        var cakesEaten = 0
        var cakesBaked = 0

        while (cakesEaten < 5) {                    // 1
            eatACake()
            cakesEaten ++
        }

        do {                                        // 2
            bakeACake()
            cakesBaked++
        } while (cakesBaked < cakesEaten)

    }

    man()
}