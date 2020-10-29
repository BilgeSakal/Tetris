package be.board;

import java.util.List;

import be.TetrisConstants;
import be.piece.TetrisPiece;
import be.tile.BoardTile;
import be.tile.TetrisTileLocation;

public class TetrisBoard {

	private int boardRowCount;
	private int boardColumnCount;
	private BoardTile[][] tetrisBoard;

	public TetrisBoard(int boardRowCount, int boardColumnCount) {
		setBoardRowCount(boardRowCount);
		setBoardColumnCount(boardColumnCount);
		initTetrisBoard();
	}

	/**
	 * Initializes the tetris board.
	 */
	private void initTetrisBoard() {
		tetrisBoard = new BoardTile[boardRowCount][boardColumnCount];
		for (int i = 0; i < boardRowCount; ++i) {
			for (int j = 0; j < boardColumnCount; ++j) {
				tetrisBoard[i][j] = new BoardTile(new TetrisTileLocation(i, j), TetrisConstants.EMPTY_TILE_COLOR);
			}
		}
	}

	/**
	 * Places the piece on the board.
	 * 
	 * @param piece to be placed.
	 */
	public void placePiece(final TetrisPiece piece) {
		List<TetrisTileLocation> toBePlacedTiles = piece.getPieceLocation();
		for (TetrisTileLocation tile : toBePlacedTiles) {
			tetrisBoard[tile.getRow()][tile.getColumn()].setTileColor(piece.getPieceColor());
		}
	}

	/**
	 * Removes the piece from the board.
	 * 
	 * @param piece to be removed.
	 */
	public void removePiece(final TetrisPiece piece) {
		List<TetrisTileLocation> toBeRemovedTiles = piece.getPieceLocation();
		for (TetrisTileLocation tile : toBeRemovedTiles) {
			tetrisBoard[tile.getRow()][tile.getColumn()].setTileColor(TetrisConstants.EMPTY_TILE_COLOR);
		}
	}

	/**
	 * Returns the board tile located in [row][column]
	 * 
	 * @param row    row number
	 * @param column column number
	 * @return the board tile located in [row][column]
	 */
	public BoardTile getBoardTile(int row, int column) {
		return tetrisBoard[row][column];
	}

	// GETTERS AND SETTERS

	public int getBoardRowCount() {
		return boardRowCount;
	}

	public void setBoardRowCount(int boardRowCount) {
		this.boardRowCount = boardRowCount;
	}

	public int getBoardColumnCount() {
		return boardColumnCount;
	}

	public void setBoardColumnCount(int boardColumnCount) {
		this.boardColumnCount = boardColumnCount;
	}

}
