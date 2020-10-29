package be.piece;

import java.awt.Color;

import be.tile.TetrisTileLocation;

public class TetrisPieceJ extends TetrisPiece {

	public TetrisPieceJ(Color pieceColor) throws CloneNotSupportedException {
		super(pieceColor);
	}

	@Override
	public void generatePiece() {
		pieceLocation.add(new TetrisTileLocation(0, 1));
		pieceLocation.add(new TetrisTileLocation(1, 1));
		pieceLocation.add(new TetrisTileLocation(2, 1));
		pieceLocation.add(new TetrisTileLocation(2, 0));
	}

}