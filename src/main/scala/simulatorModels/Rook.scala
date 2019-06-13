package simulatorModels

class Rook extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val startIndex = 0
    val endIndex = 7
    val startAlphabet = 'A'
    val endAlphabet = 'H'
    val cellRow = Range(startIndex, endIndex + 1).map(r => Cell(initialPosition.columnId, r + 1))
    val cellColumn = Range(startAlphabet, endAlphabet + 1).map(c => Cell(c.toChar, initialPosition.rowId))
    (cellRow ++ cellColumn).filter(_ != initialPosition).toList
  }
}
