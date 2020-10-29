package be;

import be.board.TetrisBoard;
import be.piece.TetrisPiece;
import be.service.TetrisMoveService;
import be.service.TetrisRotationService;

public class TetrisBrain {
	private TetrisPiece curPiece;
	private TetrisBoard tetrisBoard;

	public TetrisBrain() {
		tetrisBoard = new TetrisBoard(TetrisConstants.VERTICAL_TILE_COUNT, TetrisConstants.HORIZONTAL_TILE_COUNT);
	}

	public void startGame() {

	}

	/**
	 * Moves the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction move direction.
	 * @throws CloneNotSupportedException
	 */
	public TetrisPiece movePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		return TetrisMoveService.movePiece(curPiece, direction);
	}

	/**
	 * Rotates the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction rotate direction.
	 * @throws CloneNotSupportedException
	 */
	public TetrisPiece rotatePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		return TetrisRotationService.rotatePiece(curPiece, direction);
	}

	// GETTERS AND SETTERS

	public TetrisBoard getTetrisBoard() {
		return tetrisBoard;
	}

	public void setTetrisBoard(TetrisBoard tetrisBoard) {
		this.tetrisBoard = tetrisBoard;
	}

}
