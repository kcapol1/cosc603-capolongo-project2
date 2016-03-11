/*
 * 
 */
package edu.towson.cis.cosc603.project2.monopoly;


import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class GameMasterProduct.
 */
public class GameMasterProduct {
	
	/** The init amount of money. */
	private int initAmountOfMoney;

	/**
	 * Gets the inits the amount of money.
	 *
	 * @return the inits the amount of money
	 */
	public int getInitAmountOfMoney() {
		return initAmountOfMoney;
	}

	/**
	 * Sets the inits the amount of money.
	 *
	 * @param initAmountOfMoney the new inits the amount of money
	 */
	public void setInitAmountOfMoney(int initAmountOfMoney) {
		this.initAmountOfMoney = initAmountOfMoney;
	}

	/**
	 * Sets the number of players.
	 *
	 * @param number  the new number of players
	 * @param players the players
	 */
	public void setNumberOfPlayers(int number, ArrayList<Player> players) {
		players.clear();
		for (int i = 0; i < number; i++) {
			Player player = new Player();
			player.setMoney(initAmountOfMoney);
			players.add(player);
		}
	}
}