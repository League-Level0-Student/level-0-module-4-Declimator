import javax.swing.JOptionPane;

public class ChooseYourOwnStory {
	public static void main(String[] args) {
		/*
		 * JOptionPane.showOptionDialog(null,"","ChooseYourOwnStory", 0,
		 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Right", "Left" },
		  null);
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
			if (x1 == 2) {
				int x10 = JOptionPane.showOptionDialog(null, "You try to cut some branches but all of them are wet",
						"ChooseYourOwnStory", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Go back and try to climb the oak tree", "Continue walking ahead" }, null);
				if (x10 == 0) {
					JOptionPane.showMessageDialog(null,
							"You try to climb the oak tree and you fall back and break your leg, now you die");

				}
				else if (x10==1) {
					JOptionPane.showMessageDialog(null, "You walk ahead and you wake up from a dream");
				}
			} else if (x1 == 1) {
				JOptionPane.showMessageDialog(null, "You walk ahead and you wake up from a dream");
			} else if (x1 == 0) {
				int x12 = JOptionPane.showOptionDialog(null,
						"You try to climb the oak tree and you fall back and break your leg", "ChooseYourOwnStory", 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Try to climb it again with a broken leg",
								"Turn around and continue down the road", "Find something to help heal your leg" },
						null);
				if (x12 == 1) {
					JOptionPane.showMessageDialog(null, "Your leg starts bleeding and you die");

				}
				else if(x12==2) {
					int x121= JOptionPane.showOptionDialog(null,"You find a dead shrub","ChooseYourOwnStory", 0,
							 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Eat it", "Drop it and continue down the road" },
							  null);
					if(x121==1) {
						JOptionPane.showMessageDialog(null,"Your leg starts bleeding and you die");
					
				}
					else if(x121==0) {
						JOptionPane.showMessageDialog(null, "The shrub does nothing and you die");
						
					}
				}
				else if(x12==0) {
					JOptionPane.showMessageDialog(null, "You try to climb it again but you fall and die");
				}
			}

			// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		} else if (x == 1) {
			int x2 = JOptionPane.showOptionDialog(null,
					"The clouds above now completely cover the sky and it starts to rain", "ChooseYourOwnStory", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go back", "Keep going", "Run off the path" },
					null);
			// question 2 left path
			if(x2==0) {
				int x21=JOptionPane.showOptionDialog(null,"You turn around and the path you came from disappeared","ChooseYourOwnStory", 0,
						 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Turn around again", "Run off the path" },
						  null);
				if(x21==0) {
					JOptionPane.showMessageDialog(null, "Now the path disappears and you fall down a giant hole forever");
				}
				if(x21==1) {
					JOptionPane.showMessageDialog(null, "The path disappears and a puppet stage appears with puppets playing the Wizard of Oz until you feint and wake up from your nightmare");
				}
			}
			if(x2==2) {
				JOptionPane.showMessageDialog(null, "The path disappears and a puppet stage appears with puppets playing the Wizard of Oz until you feint and wake up from your nightmare");
			}
			if(x2==1) {
				int x22=JOptionPane.showOptionDialog(null,"You find a corn field","ChooseYourOwnStory", 0,
						 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go into the field", "Turn around" },
						  null);
				if(x22==1) {
					int x221=JOptionPane.showOptionDialog(null,"Everything around you disappears","ChooseYourOwnStory", 0,
							 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Sit and wait", "Run off" },
							  null);
if(x221==0) {
	JOptionPane.showMessageDialog(null, "You wake up from your dream");
}
if(x221==1) {
	JOptionPane.showMessageDialog(null, "A giant hole appears and you fall down forever");
}
}
				if(x22==0) {
					JOptionPane.showMessageDialog(null, "The corn field disappears and you wake up from a dream");
				}
				}
			}
		}

	}

