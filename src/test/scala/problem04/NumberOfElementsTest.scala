package problem04

import listTestUtils.ListConstants.LONG_VALID_LIST
import listTestUtils.ListConstants.NIL
import listTestUtils.ListConstants.VALID_LIST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import problem04.Util.buildinNumberOfElements
import problem04.Util.recursiveNumberOfElements

class NumberOfElementsTest {

  @Test
  def buildInNumberOfElementsTest(): Unit = {
    assertEquals(0, buildinNumberOfElements(NIL))
    assertEquals(10, buildinNumberOfElements(VALID_LIST))
    assertEquals(600, buildinNumberOfElements(LONG_VALID_LIST))
  }

  @Test
  def numberOfElementsTest(): Unit = {
    assertEquals(0, recursiveNumberOfElements(NIL))
    assertEquals(10, recursiveNumberOfElements(VALID_LIST))
    assertEquals(600, recursiveNumberOfElements(LONG_VALID_LIST))
  }

  @Test
  def foldNumberOfElementsTest(): Unit = {
    assertEquals(0, recursiveNumberOfElements(NIL))
    assertEquals(10, recursiveNumberOfElements(VALID_LIST))
    assertEquals(600, recursiveNumberOfElements(LONG_VALID_LIST))
  }
}
