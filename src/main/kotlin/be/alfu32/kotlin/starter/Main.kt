package be.alfu32.kotlin.starter

fun main(args: Array<String>){
    println("it works with args")
    args.forEach {
        arg -> println("arg - $arg")
    }
    println(args)
}