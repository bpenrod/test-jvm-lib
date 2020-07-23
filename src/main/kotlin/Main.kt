package com.bpenrod.test

fun main(args: Array<String>) {
    val foo = Foo()
    println(
            args.map { foo.awesomize(it) }.joinToString(separator = ",", prefix = "Awesomized: [", postfix = "]")
    )
}