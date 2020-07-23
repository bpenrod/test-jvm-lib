package com.bpenrod.test

fun main(args: Array<String>) {
    val foo = Foo()
    println(
            args.joinToString(separator = ",", prefix = "Awesomized: [", postfix = "]") { foo.awesomize(it) }
    )
}