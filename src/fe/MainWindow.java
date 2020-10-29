package fe;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import be.TetrisBrain;
import be.TetrisDirectionEnum;
import be.piece.TetrisPiece;
import be.piece.TetrisPieceJ;
import be.piece.TetrisPieceStick;
import be.service.TetrisMoveService;

public class MainWindow {

	private JFrame mainFrame;

	public MainWindow() throws CloneNotSupportedException {
		mainFrame = new JFrame();
		mainFrame.setLayout(new FlowLayout());
		TetrisBrain tb = new TetrisBrain();
		mainFrame.add(new TetrisBoardPanel(tb.getTetrisBoard()));
		mainFrame.pack();
		mainFrame.setVisible(true);
		tb.getTetrisBoard().placePiece(new TetrisPieceJ(Color.BLUE));
		TetrisPiece s = new TetrisPieceStick(Color.PINK);
		s = TetrisMoveService.movePiece(s, TetrisDirectionEnum.DOWN);
		s = TetrisMoveService.movePiece(s, TetrisDirectionEnum.DOWN);
		s = TetrisMoveService.movePiece(s, TetrisDirectionEnum.DOWN);
		s = TetrisMoveService.movePiece(s, TetrisDirectionEnum.DOWN);
		tb.getTetrisBoard().placePiece(s);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		MainWindow m = new MainWindow();
	}

}
