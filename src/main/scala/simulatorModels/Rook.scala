package simulatorModels

class Rook extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val startIndex = 0
    val endIndex = 7
    val startAlphabet = 'A'
    val endAlphabet = 'H'
    val rowIdsRange = Range(startIndex, endIndex + 1).map(r => Cell(initialPosition.columnId, r + 1))
    val columnIdsRange = Range(startAlphabet, endAlphabet + 1).map(c => Cell(c.toChar, initialPosition.rowId))
    (rowIdsRange ++ columnIdsRange).filter(_ != initialPosition).toList
  }
}
