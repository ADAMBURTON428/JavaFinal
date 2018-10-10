package infinityDungeon;

public class Chest {
	

	public static void chestChoice() {

		
		int rand = (int)(Math.random() * 10 + 1 );

		switch(rand)
        {
            case 2:
            	chest2();
            	break;
            case 3:
            	chest3();
            	break;
            case 4:
            	chest4();
            	break;
            case 5:
            	chest5();
            	break;
            case 6:
            	chest6();
            	break;
            case 7:
            	chest7();
            	break;
            case 8:
            	chest8();
            	break;
            case 9:
            	chest9();
            	break;
            case 10:
            	chest10();
            	break;
            default:
            	chest1();
        }
	}
	public static void chest1() {
		System.out.println(1);
	}
	public static void chest2() {
		System.out.println(2);
	}
	public static void chest3() {
		System.out.println(3);
	}
	public static void chest4() {
		System.out.println(4);
	}
	public static void chest5() {
		System.out.println(5);
	}
	public static void chest6() {
		System.out.println(6);
	}
	public static void chest7() {
		System.out.println(7);
	}
	public static void chest8() {
		System.out.println(8);
	}
	public static void chest9() {
		System.out.println(9);
	}
	public static void chest10() {
		System.out.println(10);
	public static void chestArray() {



	}

}