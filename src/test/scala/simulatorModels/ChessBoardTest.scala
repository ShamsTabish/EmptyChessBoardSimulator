package simulatorModels

import org.scalatestplus.play.PlaySpec
import util.TestHelpers

class ChessBoardTest extends PlaySpec with TestHelpers {
  "ChessBoard" should {
    "lay down cells with labels and indexes" in {
      val expectedBoard: List[List[Cell]] = List(
        parseCells("A1, A2, A3, A4, A5, A6, A7, A8"),
        parseCells("B1, B2, B3, B4, B5, B6, B7, B8"),
        parseCells("C1, C2, C3, C4, C5, C6, C7, C8"),
        parseCells("D1, D2, D3, D4, D5, D6, D7, D8"),
        parseCells("E1, E2, E3, E4, E5, E6, E7, E8"),
        parseCells("F1, F2, F3, F4, F5, F6, F7, F8"),
        parseCells("G1, G2, G3, G4, G5, G6, G7, G8"),
        parseCells("H1, H2, H3, H4, H5, H6, H7, H8")
      )
      new ChessBoard().cells mustEqual (expectedBoard)
    }
  }
}
