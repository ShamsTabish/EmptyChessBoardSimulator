package simulatorModels

class Queen extends Piece {
  override def move(initialPosition: Cell, board: ChessBoard): List[Cell] = {
    val bishopMoves = new Bishop().move(initialPosition, board)
    val rookMoves = new Rook().move(initialPosition, board)
    (bishopMoves ++ rookMoves)
  }
}
