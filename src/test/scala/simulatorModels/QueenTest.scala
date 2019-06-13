package simulatorModels

import org.scalatestplus.play.PlaySpec

class QueenTest extends PlaySpec {
  "Queen" should {
    "Move in vertically, Horizontally and diagonally in all directions" in {
      val queen = new Queen()
      val expectedList = (
        "D1, D2, D3, D4, D6, D7, D8, " +
          "A5, B5, C5, E5, F5, G5, H5, " +
          "A1, B2, C3, D4, E5, F6, G7, H8, " +
          "H1, G2, F3, E4, C6, B7, A8")
        .split(", ").map(Cell(_).get).toList
      queen.move(Cell('D', 5), new ChessBoard()) mustEqual expectedList
    }
  }
}
