package be.service;

import be.TetrisDirectionEnum;
import be.piece.TetrisPiece;
import be.tile.TetrisTileLocation;

public class TetrisMoveService {

	/**
	 * Moves the given piece in the given direction.
	 * 
	 * @param piece     to be moved.
	 * @param direction move direction.
	 * @return moved piece.
	 * @throws CloneNotSupportedException
	 */
	public static TetrisPiece movePiece(final TetrisPiece piece, TetrisDirectionEnum direction)
			throws CloneNotSupportedException {
		TetrisPiece movedPiece = (TetrisPiece) piece.clone();
		int rowChange = 0;
		int colChange = 0;
		switch (direction) {
		case UP: {
			rowChange = -1;
			break;
		}
		case RIGHT: {
			colChange = 1;
			break;
		}
		case DOWN: {
			rowChange = 1;
			break;
		}
		case LEFT: {
			colChange = -1;
			break;
		}
		default:
		}
		for (TetrisTileLocation tileLocation : movedPiece.getPieceLocation()) {
			tileLocation.setRow(tileLocation.getRow() + rowChange);
			tileLocation.setColumn(tileLocation.getColumn() + colChange);
		}
		return movedPiece;
	}

}