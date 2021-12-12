package problem01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class LastElementTest {

  @Test
  def longValidListTest() {
    assertEquals(9, Utils.lastElement(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
  }

  @Test
  def oneElementListTest() {
    assertEquals(9, Utils.lastElement(List(9)))
  }

  @Test
  def nilTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => Utils.lastElement(Nil))
  }

}
