package problem01

import listTestUtils.ListConstants.NIL
import listTestUtils.ListConstants.ONE_ELEMENT_LIST
import listTestUtils.ListConstants.VALID_LIST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class LastElementTest {

  @Test
  def longValidListTest() {
    assertEquals(9, Utils.lastElement(VALID_LIST))
  }

  @Test
  def oneElementListTest() {
    assertEquals(1, Utils.lastElement(ONE_ELEMENT_LIST))
  }

  @Test
  def nilTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => Utils.lastElement(NIL))
  }

}
