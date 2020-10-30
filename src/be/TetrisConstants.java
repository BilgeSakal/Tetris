package be;

import java.awt.Color;
import java.awt.Dimension;

public interface TetrisConstants {

	public Color EMPTY_TILE_COLOR = Color.WHITE;
	public Dimension MIN_TILE_DIMENSION = new Dimension(30, 30);

	public int HORIZONTAL_TILE_COUNT = 10;
	public int VERTICAL_TILE_COUNT = 20;

	public Dimension TETRIS_TILE_DIMENSION = new Dimension(20, 20);

	public long DROP_TIME = 1000;

}