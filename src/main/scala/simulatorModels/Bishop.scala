package simulatorModels

class Bishop extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val endIndex = 7
    val columnID = initialPosition.columnId
    val rowID = initialPosition.rowId

    val forwardDiagonals: List[Option[Cell]] = Range(1, endIndex + 1).flatMap { i =>
      println()
      List(Cell((columnID + i).toChar.toString + (rowID + i)), Cell((columnID - i).toChar.toString + (rowID - i)))
    }.toList
    val forwardDiagonalCells = forwardDiagonals.filter(x => x != None).map(_.get)

    val beckwardDiagonals = Range(1, endIndex + 1).flatMap(i =>
      List(Cell((columnID + i).toChar.toString + (rowID - i)), Cell((columnID - i).toChar.toString + (rowID + i)))
    )
    val backwardDiagonalCells = beckwardDiagonals.filter(_ != None).map(_.get)

    (forwardDiagonalCells ++ backwardDiagonalCells).filter(_ != initialPosition)
  }
}
