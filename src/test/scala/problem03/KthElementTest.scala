package problem03

import listTestUtils.ListConstants.LONG_VALID_LIST
import listTestUtils.ListConstants.NIL
import listTestUtils.ListConstants.ONE_ELEMENT_LIST
import listTestUtils.ListConstants.VALID_LIST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import problem03.Util.kthElementRecursive
import problem03.Util.kthElementSolutionFromWeb
import problem03.Util.kthElementTake

class KthElementTest {

  @Test
  def validListTakeTest(): Unit = {
    assertEquals(2, kthElementTake(2, VALID_LIST))
    assertEquals(9, kthElementTake(9, VALID_LIST))
  }

  @Test
  def longValidListTakeTest(): Unit = {
    assertEquals(555, kthElementTake(555, LONG_VALID_LIST))
    assertEquals(555, kthElementTake(555, LONG_VALID_LIST))
  }

  @Test
  def nilTakeTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementTake(2, NIL))
  }

  @Test
  def outOfBoundsTakeTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementTake(2, ONE_ELEMENT_LIST))
  }

  @Test
  def validListProceduralTest(): Unit = {
    assertEquals(2, kthElementRecursive(2, VALID_LIST))
    assertEquals(9, kthElementRecursive(9, VALID_LIST))
  }

  @Test
  def longValidListProceduralTest(): Unit = {
    assertEquals(555, kthElementRecursive(555, LONG_VALID_LIST))
    assertEquals(555, kthElementRecursive(555, LONG_VALID_LIST))
  }

  @Test
  def nilProceduralTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementRecursive(2, NIL))
  }

  @Test
  def outOfBoundsProceduralTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementRecursive(2, ONE_ELEMENT_LIST))
  }


  @Test
  def longValidListSolutionFromWebTest(): Unit = {
    assertEquals(555, kthElementSolutionFromWeb(555, LONG_VALID_LIST))
    assertEquals(555, kthElementSolutionFromWeb(555, LONG_VALID_LIST))
  }

  @Test
  def nilSolutionFromWebTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementSolutionFromWeb(2, NIL))
  }

  @Test
  def outOfBoundsSolutionFromWebTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => kthElementSolutionFromWeb(2, ONE_ELEMENT_LIST))
  }
}
