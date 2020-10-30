package be.piece;

import java.awt.Color;
import java.util.ArrayList;

import be.tile.TetrisTileLocation;

public abstract class TetrisPiece implements Cloneable {

	protected ArrayList<TetrisTileLocation> pieceLocation;
	protected Color pieceColor;

	/**
	 * Constructor to instantiate a Piece.
	 * 
	 * @param pieceColor color of the piece.
	 * @throws CloneNotSupportedException
	 */
	public TetrisPiece(Color pieceColor) throws CloneNotSupportedException {
		setPieceColor(pieceColor);
		pieceLocation = new ArrayList<TetrisTileLocation>();
		generatePiece();
	}

	public abstract void generatePiece();

	@Override
	public Object clone() throws CloneNotSupportedException {
		TetrisPiece cloned = (TetrisPiece) super.clone();
		ArrayList<TetrisTileLocation> clonedList = new ArrayList<TetrisTileLocation>();
		for (TetrisTileLocation tileLoc : pieceLocation) {
			clonedList.add(new TetrisTileLocation(tileLoc.getRow(), tileLoc.getColumn()));
		}
		cloned.setPieceLocation(clonedList);
		cloned.setPieceColor(new Color(pieceColor.getRGB()));
		return cloned;
	}

	@Override
	public String toString() {
		String res = "";
		for (TetrisTileLocation tileLoc : pieceLocation) {
			res += tileLoc.toString() + System.lineSeparator();
		}
		return res;
	}

	// GETTERS AND SETTERS

	public Color getPieceColor() {
		return pieceColor;
	}

	public void setPieceColor(Color pieceColor) {
		this.pieceColor = pieceColor;
	}

	public ArrayList<TetrisTileLocation> getPieceLocation() {
		return pieceLocation;
	}

	public void setPieceLocation(ArrayList<TetrisTileLocation> pieceLocation) {
		this.pieceLocation = pieceLocation;
	}

}