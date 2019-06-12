package simulatorModels

import org.scalatestplus.play.PlaySpec

class CellTest extends PlaySpec {
  "Cell" should {
    "convert to String with ColumnId and row Id concatenated without any saperator" in {
      new Cell('A', 2).toString mustEqual ("A2")
    }

    "be creatable from valid cell id" in {
      Cell("A1") mustEqual (Some(Cell('A', 1)))
    }

    "be creatable from small case column id" in {
      Cell("h8") mustEqual (Some(Cell('H', 8)))
    }

    "not be created when input is beyond the board limits" in {
      Cell("I1") mustEqual (None)
      Cell("A0") mustEqual (None)
      Cell("A9") mustEqual (None)
    }
    "not be created when input is invalid" in {
      Cell("") mustEqual (None)
      Cell("A") mustEqual (None)
      Cell("9") mustEqual (None)
      Cell("##") mustEqual (None)
      Cell("A_") mustEqual (None)
      Cell("@1") mustEqual (None)
      Cell("  ") mustEqual (None)
      Cell("A23") mustEqual (None)
      Cell("AB5") mustEqual (None)
    }

  }

}
