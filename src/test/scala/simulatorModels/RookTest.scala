package simulatorModels

import org.scalatestplus.play.PlaySpec

class RookTest extends PlaySpec {
  "Rook" should {

    "be able to Move Vertically (Up,down) and Horizontally (Left and Right) when it has cells all around" in {

      val expectedCellsAsString = "D1, D2, D3, D4, D6, D7, D8, A5, B5, C5, E5, F5, G5, H5"
      val expectedCells = parseCells(expectedCellsAsString)
      val rook = new Rook()

      rook.move(Cell('D', 5), new ChessBoard) mustEqual expectedCells
    }

    "be able to Move Vertically only Up and Horizontally only Left when it is on the bottom Right corner" in {

      val expectedCellsAsString = "A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1"
      val expectedCells = parseCells(expectedCellsAsString)
      val rook = new Rook()

      rook.move(Cell('A', 1), new ChessBoard) mustEqual expectedCells
    }

    "be able to Move Vertically only Up and Horizontally only Right when it is on the bottom Left corner" in {

      val expectedCellsAsString = "H2, H3, H4, H5, H6, H7, H8, A1, B1, C1, D1, E1, F1, G1"
      val expectedCells = parseCells(expectedCellsAsString)
      val rook = new Rook()

      rook.move(Cell('H', 1), new ChessBoard) mustEqual expectedCells
    }

    "be able to Move Vertically only down and Horizontally only Right when it is on the top Left corner" in {

      val expectedCellsAsString = "A1, A2, A3, A4, A5, A6, A7, B8, C8, D8, E8, F8, G8, H8"
      val expectedCells = parseCells(expectedCellsAsString)
      val rook = new Rook()

      rook.move(Cell('A', 8), new ChessBoard) mustEqual expectedCells
    }

    "be able to Move Vertically only down and Horizontally only Left when it is on the top Right corner" in {

      val expectedCellsAsString = "H1, H2, H3, H4, H5, H6, H7, A8, B8, C8, D8, E8, F8, G8"
      val expectedCells = parseCells(expectedCellsAsString)
      val rook = new Rook()

      rook.move(Cell('H', 8), new ChessBoard) mustEqual expectedCells
    }
  }

  private def parseCells(expectedCellsAsString: String) = {
    expectedCellsAsString
      .split(", ")
      .map(Cell(_).get)
      .toList
  }
}
