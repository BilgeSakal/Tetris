package be.piece;

import java.awt.Color;

import be.tile.TetrisTileLocation;

public class TetrisPieceT extends TetrisPiece {

	public TetrisPieceT(Color pieceColor) throws CloneNotSupportedException {
		super(pieceColor);
	}

	@Override
	public void generatePiece() {
		pieceLocation.add(new TetrisTileLocation(0, 1));
		pieceLocation.add(new TetrisTileLocation(1, 0));
		pieceLocation.add(new TetrisTileLocation(1, 1));
		pieceLocation.add(new TetrisTileLocation(1, 2));
	}
}
