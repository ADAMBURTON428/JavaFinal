package infinityDungeon;

public class RoomSetup {
	
	public static void setup() {
		
		int rand = (int)(Math.random() * 10 + 1 );
		if (rand > 4) {
			En.enChoice();
		}
		else {
			RoomLayout.dispRoom();
		}
		
	}

}
