package be.tile;

import java.awt.Color;

import fe.TetrisTileLabel;

public class BoardTile {

	private TetrisTileLocation tileLocation;
	private Color tileColor;
	private TetrisTileLabel tileLabel;

	public BoardTile(TetrisTileLocation tileLocation, Color tileColor) {
		setTileLocation(tileLocation);
		this.tileColor = tileColor;
	}

	public void notifyLabel() {
		tileLabel.updateLabel(this);
	}

	// GETTERS AND SETTERS

	public TetrisTileLocation getTileLocation() {
		return tileLocation;
	}

	public void setTileLocation(TetrisTileLocation tileLocation) {
		this.tileLocation = tileLocation;
	}

	public Color getTileColor() {
		return tileColor;
	}

	public void setTileColor(Color tileColor) {
		this.tileColor = tileColor;
		notifyLabel();
	}

	public TetrisTileLabel getTileLabel() {
		return tileLabel;
	}

	public void setTileLabel(TetrisTileLabel tileLabel) {
		this.tileLabel = tileLabel;
	}

}
