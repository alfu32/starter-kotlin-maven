package be.alfu32.kotlin.starter

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class MyCalculatorTest {

    @Test
    fun testSum(){
        val mc = MyCalculator()
        println(mc.sum(listOf(1,2,3,4,5)))
    }
}
