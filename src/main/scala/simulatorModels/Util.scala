package simulatorModels

import scala.util.Try

object Util {
  def inputParser(input: String): Option[(Cell, Piece)] = Try {
    val inputSegments = input.split("\\s+")
    val piece = Piece(inputSegments(0))
    val initialPosition = inputSegments(1)
    val initialCell = Cell(initialPosition)
    if (initialCell.isDefined) {
      Some(initialCell.get, piece)
    } else None
  }.getOrElse(None)
}
