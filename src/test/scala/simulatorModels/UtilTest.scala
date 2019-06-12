package simulatorModels

import org.scalatestplus.play.PlaySpec

class UtilTest extends PlaySpec {
  "Util" should {
    "parse valid input" in {
      val (cell, piece) = Util.inputParser("King H2").get
      cell mustEqual Cell('H', 2)
      piece.isInstanceOf[King] mustBe (true)
    }
    "parseInput and return none if Piece info is invalid" in {
      val result = Util.inputParser("Archer H2")
      result mustBe None
    }
    "parseInput and return none if Initial Cell info is invalid" in {
      val result = Util.inputParser("Queen I5")
      result mustBe None
    }
    "parseInput and return piece as King when passed in input" in {
      val (_, piece) = Util.inputParser("King H2").get
      piece.isInstanceOf[King] mustBe (true)
    }
    "parseInput and return piece as Bishop when passed in input" in {
      val (_, piece) = Util.inputParser("bishop H2").get
      piece.isInstanceOf[Bishop] mustBe (true)
    }
    "parseInput and return piece as Horse when passed in input" in {
      val (_, piece) = Util.inputParser("horSe H2").get
      piece.isInstanceOf[Horse] mustBe (true)
    }
    "parseInput and return piece as Pawn when passed in input" in {
      val (_, piece) = Util.inputParser("pAwn H2").get
      piece.isInstanceOf[Pawn] mustBe (true)
    }
    "parseInput and return piece as Queen when passed in input" in {
      val (_, piece) = Util.inputParser("quEEn      H2").get
      piece.isInstanceOf[Queen] mustBe (true)
    }
    "parseInput and return piece as Rook when passed in input" in {
      val (_, piece) = Util.inputParser("rooK  H2    ").get
      piece.isInstanceOf[Rook] mustBe (true)
    }
  }
}
