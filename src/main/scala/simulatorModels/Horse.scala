package simulatorModels

class Horse extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val columnID = initialPosition.columnId
    val rowID = initialPosition.rowId

    val adjacentCell = 1
    val thirdCell = 3
    val upLeft = Cell((columnID - adjacentCell).toChar.toString + (rowID + thirdCell))
    val upRight = Cell((columnID + adjacentCell).toChar.toString + (rowID + thirdCell))
    val rightDown = Cell((columnID - adjacentCell).toChar.toString + (rowID - thirdCell))
    val rightUp = Cell((columnID + adjacentCell).toChar.toString + (rowID - thirdCell))
    val downLeft = Cell((columnID - thirdCell).toChar.toString + (rowID - adjacentCell))
    val downRight = Cell((columnID - thirdCell).toChar.toString + (rowID + adjacentCell))
    val leftDown = Cell((columnID + thirdCell).toChar.toString + (rowID - adjacentCell))
    val leftUp = Cell((columnID + thirdCell).toChar.toString + (rowID + adjacentCell))

    List(upLeft, upRight, rightDown, rightUp, downLeft, downRight, leftDown, leftUp)
      .filter(_ != None)
      .map(_.get)
  }
}
