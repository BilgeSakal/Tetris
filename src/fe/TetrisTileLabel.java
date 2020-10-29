package fe;

import java.awt.Color;

import javax.swing.JLabel;

import be.TetrisConstants;
import be.tile.BoardTile;

public class TetrisTileLabel extends JLabel {

	private static final long serialVersionUID = -4676376697849003841L;

	private Color tileColor;

	public TetrisTileLabel(Color tileColor) {
		setTileColor(tileColor);
		setOpaque(true);
		setMinimumSize(TetrisConstants.TETRIS_TILE_DIMENSION);
		setMaximumSize(TetrisConstants.TETRIS_TILE_DIMENSION);
		setPreferredSize(TetrisConstants.TETRIS_TILE_DIMENSION);
		setBackground(tileColor);
	}

	public void updateLabel(BoardTile boardTile) {
		setBackground(boardTile.getTileColor());
	}

	// GETTERS AND SETTER

	public Color getTileColor() {
		return tileColor;
	}

	public void setTileColor(Color tileColor) {
		this.tileColor = tileColor;
	}

}
