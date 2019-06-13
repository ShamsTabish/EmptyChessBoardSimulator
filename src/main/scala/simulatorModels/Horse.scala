package simulatorModels

class Horse extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val columnID = initialPosition.columnId
    val rowID = initialPosition.rowId

    val adjacentCell = 1
    val twoCells = 2
    val upLeft = Cell((columnID - adjacentCell).toChar.toString + (rowID + twoCells))
    val upRight = Cell((columnID + adjacentCell).toChar.toString + (rowID + twoCells))
    val rightDown = Cell((columnID - adjacentCell).toChar.toString + (rowID - twoCells))
    val rightUp = Cell((columnID + adjacentCell).toChar.toString + (rowID - twoCells))
    val downLeft = Cell((columnID - twoCells).toChar.toString + (rowID - adjacentCell))
    val downRight = Cell((columnID - twoCells).toChar.toString + (rowID + adjacentCell))
    val leftDown = Cell((columnID + twoCells).toChar.toString + (rowID - adjacentCell))
    val leftUp = Cell((columnID + twoCells).toChar.toString + (rowID + adjacentCell))

    List(upLeft, upRight, rightDown, rightUp, downLeft, downRight, leftDown, leftUp)
      .filter(_ != None)
      .map(_.get)
  }
}
