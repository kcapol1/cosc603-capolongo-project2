package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class FreeParkingCell.
 */
public class FreeParkingCell extends Cell {

	/**
	 * Instantiates a new free parking cell.
	 */
	public FreeParkingCell() {
		setName("Free Parking");
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	/**
	 * @deprecated Use {@link #playAction(String)} instead
	 */
	public void playAction() {
		playAction(null);
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public boolean playAction(String msg) {
		return true;
	}
}
