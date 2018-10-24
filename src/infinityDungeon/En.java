package infinityDungeon;

public class En {
	
	public static void enChoice() {

		String[] desc = {" strange"," creepy"," wierd-looking"," powerful"};
		String en = "";
		String the = "";
		int die = 0;
		int i = (int)(Math.random() * 4 + 1 ) - 1;
		//Randomly selects an encounter if there is one
		int rand = (int)(Math.random() * 10 + 1 );

		switch(rand)
        {
            case 2:
            	en1(en, die, the, desc[i]);
            	break;
            case 3:
            	en2(en, die, the, desc[i]);
            	break;
            case 4:
            	en3(en, die, the, desc[i]);
            	break;
            case 5:
            	en4(en, die, the, desc[i]);
            	break;
            case 6:
            	en5(en, die, the, desc[i]);
            	break;
            case 7:
            	en6(en, die, the, desc[i]);
            	break;
            case 8:
            	en7(en, die, the, desc[i]);
            	break;
            case 9:
            	en8(en, die, the, desc[i]);
            	break;
            case 10:
            	en9();
            	break;
            default:
            	en0(en, die, the, desc[i]);
        }
		
	}
	public static void en0(String en, int die, String the, String desc) {
		en = " traps";
		the = " some";
		die = 1;
		String var = "You found" + the + desc + en;
		S.op(var);
		DeathScreen.dispRoom();
	}
	public static void en1(String en, int die, String the, String desc) {
		en = " man";
		the = " a";
		die = 0;
		String var = "You encountered" + the + desc + en;
		S.op(var);
		RoomLayout.dispRoom();
	}
	public static void en2(String en, int die, String the, String desc) {
		en = " goblin";
		the = " a";
		die = (int)(Math.random() * 2 + 1) - 1;
		if (die == 1) {
			String var = "You encountered" + the + desc + en + " and died";
			S.op(var);
			DeathScreen.dispRoom();
		}
		else {
			String var = "You encountered" + the + desc + en;
			S.op(var);
			RoomLayout.dispRoom();
		}
	}
	public static void en3(String en, int die, String the, String desc) {
		en = " haunted cleaver";
		the = " a";if (die == 1) {
			String var = "You encountered" + the + desc + en + " and died";
			S.op(var);
			DeathScreen.dispRoom();
		}
		else {
			String var = "You encountered" + the + desc + en;
			S.op(var);
			RoomLayout.dispRoom();
		}
	}
	public static void en4(String en, int die, String the, String desc) {
		en = " butcher without a cleaver";
		the = " a";
		die = 1;
		String var = "You encountered" + the + desc + en + " and died";
		S.op(var);
		DeathScreen.dispRoom();
	}
	public static void en5(String en, int die, String the, String desc) {
		en = " pickle, with a face";
		the = " a";
		die = 0;
		String var = "You encountered" + the + desc + en;
		S.op(var);
		RoomLayout.dispRoom();
	}
	public static void en6(String en, int die, String the, String desc) {
		en = " dog";
		the = " a";
		die = (int)(Math.random() * 2 + 1) - 1;
		if (die == 1) {
			String var = "You encountered" + the + desc + en + " and died";
			S.op(var);
			DeathScreen.dispRoom();
		}
		else {
			String var = "You encountered" + the + desc + en;
			S.op(var);
			RoomLayout.dispRoom();
		}
	}
	public static void en7(String en, int die, String the, String desc) {
		en = " static TV";
		the = " a";
		die = 0;
		String var = "You encountered" + the + desc + en;
		S.op(var);
		RoomLayout.dispRoom();
	}
	public static void en8(String en, int die, String the, String desc) {
		en = " penny";
		the = " a";
		die = 0;
		String var = "You encountered" + the + desc + en;
		S.op(var);
		RoomLayout.dispRoom();
	}
	public static void en9() {
		String var = "You encountered absolutely positively nothing";
		S.op(var);
		RoomLayout.dispRoom();
	}
}