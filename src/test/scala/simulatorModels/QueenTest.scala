package simulatorModels

import org.scalatestplus.play.PlaySpec
import util.TestHelpers

class QueenTest extends PlaySpec with TestHelpers {
  "Queen" should {
    "be able to move in all eight Diagonal, Vertical and  Horizontal directions when it has cells all around" in {
      val queen = new Queen()
      val expectedSequence = "F6, D4, G7, C3, H8, B2, A1, F4, D6, G3, C7, H2, B8, E1, E2, E3, E4, E6, E7, E8, A5, B5, C5, D5, F5, G5, H5"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('E', 5), new ChessBoard) mustEqual (expectedMoves)
    }

    "be able to move only up right Diagonally and bottom and left boundary when it is placed at bottom left corner" in {
      val queen = new Queen()
      val expectedSequence = "B2, C3, D4, E5, F6, G7, H8, A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('A', 1), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only up left Diagonally and bottom and right boundary  when it is placed at bottom right corner" in {
      val queen = new Queen()
      val expectedSequence = "G2, F3, E4, D5, C6, B7, A8, H2, H3, H4, H5, H6, H7, H8, A1, B1, C1, D1, E1, F1, G1"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('H', 1), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only down left Diagonally and top and right boundary  when it is placed at right top corner" in {
      val queen = new Queen()
      val expectedSequence = "G7, F6, E5, D4, C3, B2, A1, H1, H2, H3, H4, H5, H6, H7, A8, B8, C8, D8, E8, F8, G8"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('H', 8), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move only down right Diagonally and top and left boundary  when it is placed at left top corner" in {
      val queen = new Queen()
      val expectedSequence = "B7, C6, D5, E4, F3, G2, H1, A1, A2, A3, A4, A5, A6, A7, B8, C8, D8, E8, F8, G8, H8"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('A', 8), new ChessBoard) mustEqual (expectedMoves)
    }
    "be able to move Diagonally, Vertically and Horizontally when it is place at some border" in {
      val queen = new Queen()
      val expectedSequence = "B7, A6, D7, E6, F5, G4, H3, C1, C2, C3, C4, C5, C6, C7, A8, B8, D8, E8, F8, G8, H8"
      val expectedMoves = parseCells(expectedSequence)

      queen.move(Cell('C', 8), new ChessBoard) mustEqual (expectedMoves)
    }
  }
}
