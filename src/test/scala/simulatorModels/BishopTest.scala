package simulatorModels

import org.scalatestplus.play.PlaySpec
import util.TestHelpers

class BishopTest extends PlaySpec with TestHelpers {
  "Bishop" should {
    "be able to move in all four Diagonal directions when it has cells all around" in {
      val bishop = new Bishop()
      val expectedSequence = "F6, D4, G7, C3, H8, B2, A1, F4, D6, G3, C7, H2, B8"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('E', 5), new ChessBoard) mustEqual (expectedMoves)
    }

    "be able to move only up right Diagonally when it is placed at bottom left corner" in {
      val bishop = new Bishop()
      val expectedSequence = "B2, C3, D4, E5, F6, G7, H8"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('A', 1), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only up left Diagonally when it is placed at bottom right corner" in {
      val bishop = new Bishop()
      val expectedSequence = "G2, F3, E4, D5, C6, B7, A8"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('H', 1), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only down left Diagonally when it is placed at right top corner" in {
      val bishop = new Bishop()
      val expectedSequence = "G7, F6, E5, D4, C3, B2, A1"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('H', 8), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only down right Diagonally when it is placed at left top corner" in {
      val bishop = new Bishop()
      val expectedSequence = "B7, C6, D5, E4, F3, G2, H1"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('A', 8), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only Diagonally when it is place at some border" in {
      val bishop = new Bishop()
      val expectedSequence = "B7, A6, D7, E6, F5, G4, H3"
      val expectedMoves = parseCells(expectedSequence)

      bishop.move(Cell('C', 8), new ChessBoard) mustEqual (expectedMoves)
    }
  }

}
