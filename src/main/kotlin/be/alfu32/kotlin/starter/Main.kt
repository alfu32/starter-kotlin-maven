package be.alfu32.kotlin.starter

fun main(args: Array<String>){
    println("it works with args")
    args.forEachIndexed {
        i,arg -> println("""arg[$i]='$arg'""")
    }
    val c = MyCalculator()
    val list = listOf(1,2,3,4,5)
    println("""MyCalculator.sum($list) = ${c.sum(list)}""")
}