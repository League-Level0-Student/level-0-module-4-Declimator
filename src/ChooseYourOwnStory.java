import javax.swing.JOptionPane;

public class ChooseYourOwnStory {
	public static void main(String[] args) {
		/*
		 * JOptionPane.showOptionDialog(null,"","ChooseYourOwnStory", 0,
		 * JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Right", "Left" },
		 * null);
		 */
		// beginning
		int x = JOptionPane.showOptionDialog(null,
				"You go down a road and find a crossway, to the left there's a dark cluster of clouds above and to the right there's a spooky forest with dead trees. Which way do you go?",
				"ChooseYourOwnStory", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Right", "Left" }, null);
		// question 1
		if (x == 0) {
			int x1 = JOptionPane.showOptionDialog(null,
					"The black trees block out all the sunlight and an old oak falls on the path behind you.",
					"ChooseYourOwnStory", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
							"Try to climb the dead oak tree", "Walk ahead", "Get firewood and camp for the night" },
					null);
			// question 2 right path
			if (x1 == 0) {
				int x10 = JOptionPane.showOptionDialog(null, "You try to cut some branches but all of them are wet",
						"ChooseYourOwnStory", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Go back and try to climb the oak tree", "Continue walking ahead" }, null);
				if (x10 == 1) {
					JOptionPane.showOptionDialog(null,
							"You try to climb the oak tree and you fall back and break your leg", "ChooseYourOwnStory",
							0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Try to climb it again with a broken leg",
									"Turn around and continue down the road", "Find something to help heal your leg" },
							null);
				}
			} else if (x1 == 1) {

			} else if (x1 == 2) {
				int x12 = JOptionPane.showOptionDialog(null,
						"You try to climb the oak tree and you fall back and break your leg", "ChooseYourOwnStory", 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Try to climb it again with a broken leg",
								"Turn around and continue down the road", "Find something to help heal your leg" },
						null);
				if (x12 == 1) {
					JOptionPane.showMessageDialog(null, "Your leg starts bleeding and you die");

				}
			}

			// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		} else if (x == 1) {
			int x2 = JOptionPane.showOptionDialog(null,
					"The clouds above now completely cover the sky and it starts to rain", "ChooseYourOwnStory", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go back", "Keep going", "Run off the path" },
					null);
			// question 2 left path
		}

	}
}
