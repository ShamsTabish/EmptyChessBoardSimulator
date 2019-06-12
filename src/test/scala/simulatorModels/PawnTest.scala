package simulatorModels

import org.scalatestplus.play.PlaySpec

class PawnTest extends PlaySpec {
  "Pawn" should {
    "move only one cell forward when it has at least one cell ahead" in {
      val pawn = new Pawn()
      pawn.move(Cell("F4").get, new ChessBoard) mustEqual (List(Cell("F5").get))
    }
    "not move when it is on top boundary" in {
      val pawn = new Pawn()
      pawn.move(Cell("C8").get, new ChessBoard) mustEqual (List.empty)
    }
  }
}
