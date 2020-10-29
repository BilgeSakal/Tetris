package be.piece;

import java.awt.Color;

import be.tile.TetrisTileLocation;

public class TetrisPieceL extends TetrisPiece {

	public TetrisPieceL(Color pieceColor) throws CloneNotSupportedException {
		super(pieceColor);
	}

	@Override
	public void generatePiece() {
		pieceLocation.add(new TetrisTileLocation(0, 0));
		pieceLocation.add(new TetrisTileLocation(1, 0));
		pieceLocation.add(new TetrisTileLocation(2, 0));
		pieceLocation.add(new TetrisTileLocation(2, 1));
	}
}
