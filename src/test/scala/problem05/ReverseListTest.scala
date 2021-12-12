package problem05

import listTestUtils.ListConstants.LONG_VALID_LIST
import listTestUtils.ListConstants.NIL
import listTestUtils.ListConstants.ONE_ELEMENT_LIST
import listTestUtils.ListConstants.VALID_LIST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import problem05.Util.foldReverseList
import problem05.Util.reverseList

class ReverseListTest {

  @Test
  def reverseTest(): Unit = {
    assertEquals(LONG_VALID_LIST.reverse, reverseList(LONG_VALID_LIST))
    assertEquals(VALID_LIST.reverse, reverseList(VALID_LIST))
    assertEquals(NIL.reverse, reverseList(NIL))
    assertEquals(ONE_ELEMENT_LIST.reverse, reverseList(ONE_ELEMENT_LIST))
  }

  @Test
  def reverseFoldTest(): Unit = {
    assertEquals(LONG_VALID_LIST.reverse, foldReverseList(LONG_VALID_LIST))
    assertEquals(VALID_LIST.reverse, foldReverseList(VALID_LIST))
    assertEquals(NIL.reverse, foldReverseList(NIL))
    assertEquals(ONE_ELEMENT_LIST.reverse, foldReverseList(ONE_ELEMENT_LIST))
  }
}
