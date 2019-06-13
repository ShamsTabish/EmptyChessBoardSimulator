package util

import simulatorModels.Cell

trait TestHelpers {
  def parseCells(expectedCellsAsString: String): List[Cell] = {
    expectedCellsAsString
      .split(", ")
      .map(Cell(_).get)
      .toList
  }
}
