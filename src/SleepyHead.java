
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation = false;
		int i = JOptionPane.showConfirmDialog(null, "is it a weekday?");

		if (i == 1) {
			isWeekday = false;
		} else {
			isWeekday = true;
			int x = JOptionPane.showConfirmDialog(null, "Is it a vacation?");
			if (x == 1) {
				isVacation = false;
			} else {
				isVacation = true;
			}
		}

		if (isWeekday == false || isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep in");

		} else {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
		}

	}
	/*
	 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
	 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
	 */

	/*
	 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
	 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
	 * in”.
	 */
}
