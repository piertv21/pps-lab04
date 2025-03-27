package tasks.adts

import org.junit.*
import org.junit.Assert.*
import tasks.adts.SchoolModel.{BasicSchoolModule, SchoolModule}
import u03.extensionmethods.Sequences.Sequence.nil

class SchoolModelTest:

  val schoolADT: SchoolModule = BasicSchoolModule
  import schoolADT.*

  @Test def testCreateTeacher() =
    val t = teacher("Pier")
    assertTrue(true)

  @Test def testCreateCourse() =
    val c = course("Italiano")
    assertTrue(true)

  @Test def testCreateEmptySchool() =
    val s = emptySchool
    assertEquals(nil(), s.teachers)
    assertEquals(nil(), s.courses)