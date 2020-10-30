package be;

import java.awt.Color;

import be.board.TetrisBoard;
import be.piece.TetrisPiece;
import be.piece.TetrisPieceL;
import be.service.TetrisMoveService;
import be.service.TetrisRotationService;
import be.timer.TetrisDropTimer;

public class TetrisBrain {
	private TetrisPiece curPiece;
	private TetrisBoard tetrisBoard;
	private TetrisDropTimer dropTimer;

	public TetrisBrain() {
		tetrisBoard = new TetrisBoard(TetrisConstants.VERTICAL_TILE_COUNT, TetrisConstants.HORIZONTAL_TILE_COUNT);
		dropTimer = new TetrisDropTimer(this);
		try {
			curPiece = new TetrisPieceL(Color.BLUE);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void startGame() {
		dropTimer.start();
	}

	/**
	 * Moves the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction move direction.
	 * @throws CloneNotSupportedException
	 */
	public void movePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		TetrisPiece movedPiece = TetrisMoveService.movePiece(curPiece, direction);
		tetrisBoard.removePiece(curPiece);
		tetrisBoard.placePiece(movedPiece);
		curPiece = movedPiece;
	}

	/**
	 * Rotates the <b>curPiece</b> in the given <i>direction</i>.
	 * 
	 * @param direction rotate direction.
	 * @throws CloneNotSupportedException
	 */
	public void rotatePiece(TetrisDirectionEnum direction) throws CloneNotSupportedException {
		TetrisPiece rotatedPiece = TetrisRotationService.rotatePiece(curPiece, direction);
	}

	public void resetDropTimer() {
		dropTimer.interrupt();
	}

	// GETTERS AND SETTERS

	public TetrisBoard getTetrisBoard() {
		return tetrisBoard;
	}

	public void setTetrisBoard(TetrisBoard tetrisBoard) {
		this.tetrisBoard = tetrisBoard;
	}

}
