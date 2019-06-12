package simulatorModels

class ChessBoard {
  val cells: List[List[Cell]] = {
    val rowRange = Range(1, 9)
    val colRange = Range('A', 'I')
    colRange.map { col =>
      rowRange.map(row => Cell(col.toChar, row)).toList
    }.toList
  }
}
