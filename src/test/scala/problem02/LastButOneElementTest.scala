package problem02

import listTestUtils.ListConstants.NIL
import listTestUtils.ListConstants.ONE_ELEMENT_LIST
import listTestUtils.ListConstants.TWO_ELEMENT_LIST
import listTestUtils.ListConstants.VALID_LIST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import problem02.Utils.lastButOne

class LastButOneElementTest {

  @Test
  def validListTest(): Unit = {
    assertEquals(8, lastButOne(VALID_LIST))
    assertEquals(1, lastButOne(TWO_ELEMENT_LIST))
  }

  @Test
  def nilTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => lastButOne(NIL))
  }

  @Test
  def oneElementListTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], ()=> lastButOne(ONE_ELEMENT_LIST))
  }
}
