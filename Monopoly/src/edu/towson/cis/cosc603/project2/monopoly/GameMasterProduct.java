package edu.towson.cis.cosc603.project2.monopoly;


import java.util.ArrayList;

public class GameMasterProduct {
	private int initAmountOfMoney;

	public int getInitAmountOfMoney() {
		return initAmountOfMoney;
	}

	public void setInitAmountOfMoney(int initAmountOfMoney) {
		this.initAmountOfMoney = initAmountOfMoney;
	}

	/**
	 * Sets the number of players.
	 * @param number  the new number of players
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