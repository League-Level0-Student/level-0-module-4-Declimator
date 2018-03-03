//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	static // 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
int h = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String x = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<4;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take a walk", "Feed it", "Give it water", "Pet it" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	Walk();
}
if(task==1) {
	Feed();
}
if(task==2) {
	Water();
}
if(task==3) {
	Pet();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(h==3) {
	JOptionPane.showMessageDialog(null, "You love your " + x);
	break;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	static void Walk(){
		JOptionPane.showMessageDialog(null, "Your pet enjoyed walking outside. It's satisfied");
		h++;
	}
	static void Feed() {
		JOptionPane.showMessageDialog(null, "Your pet was not very hungry. It's not happy");
		h--;
	}
	static void Water() {
		JOptionPane.showMessageDialog(null, "Your pet drank all the water. It's satisfied");
	h++;
	}
	static void Pet() {
		JOptionPane.showMessageDialog(null, "Your pet did not like that. It's not happy");
	h--;
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}