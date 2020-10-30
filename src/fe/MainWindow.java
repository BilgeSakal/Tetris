package fe;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import be.TetrisBrain;
import be.TetrisDirectionEnum;

public class MainWindow {

	private JFrame mainFrame;

	public static void main(String[] args) throws CloneNotSupportedException {
		MainWindow m = new MainWindow();
		m.createAndShowUI();
	}

	private void initMainFrame() throws CloneNotSupportedException {
		mainFrame = new JFrame();
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TetrisBrain tb = new TetrisBrain();
		mainFrame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					try {
						tb.movePiece(TetrisDirectionEnum.LEFT);
						System.out.println("moving left");
					} catch (CloneNotSupportedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					try {
						tb.movePiece(TetrisDirectionEnum.RIGHT);
						System.out.println("moving right");
					} catch (CloneNotSupportedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		mainFrame.add(new TetrisBoardPanel(tb.getTetrisBoard()));
		mainFrame.pack();
		setFrameLocation();
		mainFrame.setVisible(true);
		tb.startGame();
	}

	public void createAndShowUI() throws CloneNotSupportedException {
		initMainFrame();
		mainFrame.pack();
		setFrameLocation();
		mainFrame.setVisible(true);
	}

	private void setFrameLocation() {
		final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setLocation((int) (dim.width / 2 - mainFrame.getSize().getWidth() / 2.0),
				(int) (dim.height / 2 - mainFrame.getSize().getHeight() / 2.0));
	}

}
