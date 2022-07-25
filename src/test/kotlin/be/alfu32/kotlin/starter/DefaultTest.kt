package be.alfu32.kotlin.starter

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull


internal class DefaultTest {

  @Test
  public fun defaultTest(){
    println("hello")
    assertEquals(1,1)
  }
  @Test
  fun mainTest(){
     MainKt().main(arrayOf(""))
  }
}
