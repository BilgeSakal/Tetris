package fe;

import java.awt.GridLayout;

import javax.swing.JPanel;

import be.TetrisConstants;
import be.board.TetrisBoard;

public class TetrisBoardPanel extends JPanel {

	private static final long serialVersionUID = -3769877145808688555L;

	private TetrisBoard tetrisBoard;
	private TetrisTileLabel[][] tileLabels;

	public TetrisBoardPanel(TetrisBoard tetrisBoard) {
		this.tetrisBoard = tetrisBoard;
		tileLabels = new TetrisTileLabel[tetrisBoard.getBoardRowCount()][tetrisBoard.getBoardColumnCount()];
		initComponents();
		initPanel();
	}

	private void initComponents() {
		for (int i = 0; i < tetrisBoard.getBoardRowCount(); ++i) {
			for (int j = 0; j < tetrisBoard.getBoardColumnCount(); ++j) {
				TetrisTileLabel tileLabel = new TetrisTileLabel(TetrisConstants.EMPTY_TILE_COLOR);
				tileLabels[i][j] = tileLabel;
				tetrisBoard.getBoardTile(i, j).setTileLabel(tileLabel);
			}
		}
	}

	private void initPanel() {
		setLayout(new GridLayout(tetrisBoard.getBoardRowCount(), tetrisBoard.getBoardColumnCount()));
		for (int i = 0; i < tetrisBoard.getBoardRowCount(); ++i) {
			for (int j = 0; j < tetrisBoard.getBoardColumnCount(); ++j) {
				add(tileLabels[i][j]);
			}
		}
	}

	// GETTERS AND SETTERS

	public TetrisBoard getTetrisBoard() {
		return tetrisBoard;
	}

	public void setTetrisBoard(TetrisBoard tetrisBoard) {
		this.tetrisBoard = tetrisBoard;
	}

}
