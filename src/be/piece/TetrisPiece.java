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

	@SuppressWarnings("unchecked")
	@Override
	public Object clone() throws CloneNotSupportedException {
		TetrisPiece cloned = (TetrisPiece) super.clone();
		cloned.setPieceLocation((ArrayList<TetrisTileLocation>) pieceLocation.clone());
		return cloned;
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