package simulatorModels

import org.scalatestplus.play.PlaySpec
import util.TestHelpers

class HorseTest extends PlaySpec with TestHelpers {
  "Horse" should {
    "be able to move in all directions two and half cell when it has scope to move" in {
      val horse = new Horse()
      val expectedMoves = parseCells("C8, E8, C2, E2, A4, A6, G4, G6")
      horse.move(Cell('D', 5), new ChessBoard) mustEqual expectedMoves
    }
    "be able to move up right and right up two and half cell when it is place at bottom left corner" in {
      val horse = new Horse()
      val expectedMoves = parseCells("B4, D2")
      horse.move(Cell('A', 1), new ChessBoard) mustEqual expectedMoves
    }

    "be able to move down right and right down two and half cell when it is place at top left corner" in {
      val horse = new Horse()
      val expectedMoves = parseCells("B5, D7")
      horse.move(Cell('A', 8), new ChessBoard) mustEqual expectedMoves
    }

    "be able to move left down and down left two and half cell when it is place at right top corner" in {
      val horse = new Horse()
      val expectedMoves = parseCells("G5, E7")
      horse.move(Cell('H', 8), new ChessBoard) mustEqual expectedMoves
    }
    "be able to move left up and up left two and half cell when it is place at right bottom corner" in {
      val horse = new Horse()
      val expectedMoves = parseCells("G4, E2")
      horse.move(Cell('H', 1), new ChessBoard) mustEqual expectedMoves
    }
  }
}
