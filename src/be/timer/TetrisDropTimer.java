package be.timer;

import be.TetrisBrain;
import be.TetrisConstants;
import be.TetrisDirectionEnum;

public class TetrisDropTimer extends Thread {

	private TetrisBrain tetrisBrain;

	public TetrisDropTimer(TetrisBrain tetrisBrain) {
		this.tetrisBrain = tetrisBrain;
	}

	private void drop() {
		try {
			sleep(TetrisConstants.DROP_TIME);
			if (!isInterrupted()) {
				tetrisBrain.movePiece(TetrisDirectionEnum.DOWN);
			}
		} catch (InterruptedException e) {
			System.out.println("interrupted");
			drop();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			drop();
		}
	}

}
