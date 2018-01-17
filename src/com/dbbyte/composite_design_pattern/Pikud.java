package com.dbbyte.composite_design_pattern;

import java.util.ArrayList;

// 4

public class Pikud implements Soldier {

	private ArrayList<Soldier> allSoldiers = new ArrayList();
	private boolean isJail = false;

	@Override
	public void printSoldierDetails() {
		for (Soldier soldier : allSoldiers)
			soldier.printSoldierDetails();

	}

	public void recruitSoldier(Soldier s) {
		allSoldiers.add(s);
	}

	public void dissmissSoldier(Soldier s) {
		s.printSoldierDetails();
		System.out.println("Has been released from the army.");
		allSoldiers.remove(s);
	}

	public void insertToJail(Soldier s) {
		isJail = true;
		s.printSoldierDetails();
		System.out.println("is now in jail.");
	}
}
