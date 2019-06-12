package simulatorModels

import org.scalatestplus.play.PlaySpec

class KingTest extends PlaySpec {
  "King" should {
    "Move in all directions just one cell when it has cells in all directions" in {
      val king = new King()
      val expectedMoves = "C4, C5, C6, D4, D6, E4, E5, E6".split(", ").map(Cell(_).get).toList
      king.move(Cell("D5").get, new ChessBoard) mustEqual expectedMoves
    }
    "Move in all directions just one cell except backward and on right when it is on bottom right boundary" in {
      val king = new King()
      val expectedMoves = "G1, G2, H2".split(", ").map(Cell(_).get).toList
      king.move(Cell("H1").get, new ChessBoard) mustEqual expectedMoves
    }
    "Move in all directions just one cell except backward and on left when it is on bottom left boundary" in {
      val king = new King()
      val expectedMoves = "A2, B1, B2".split(", ").map(Cell(_).get).toList
      king.move(Cell("A1").get, new ChessBoard) mustEqual expectedMoves
    }
    "Move in all directions just one cell except forward and on right when it is on top right boundary" in {
      val king = new King()
      val expectedMoves = "G7, G8, H7".split(", ").map(Cell(_).get).toList
      king.move(Cell("H8").get, new ChessBoard) mustEqual expectedMoves
    }
    "Move in all directions just one cell except forward and on left when it is on top left boundary" in {
      val king = new King()
      val expectedMoves = "A7, B7, B8".split(", ").map(Cell(_).get).toList
      king.move(Cell("A8").get, new ChessBoard) mustEqual expectedMoves
    }
  }
}
