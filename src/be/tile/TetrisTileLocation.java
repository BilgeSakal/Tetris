package be.tile;

public class TetrisTileLocation {

	private int row;
	private int column;

	public TetrisTileLocation(int row, int column) {
		setRow(row);
		setColumn(column);
	}

	@Override
	public String toString() {
		return "row: " + row + ", col:" + column;
	}

	// GETTERS AND SETTERS

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

}
