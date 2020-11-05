package main;

public class Conditionals {
//	  public static void main(String[] args) {
//	        boolean isLightOn = false;
//
//	        if(isLightOn) {
//	            System.out.println("The light is turned on");
//	        } else {
//	            System.out.println("The light is turned off");
//	        }
//	    }
//	public static void main(String[] args) {
//        int number = 10;
//
//        if(number == 10) {
//            System.out.println("Number is equal to 10");
//        } else {
//            System.out.println("Number is not equal to 10");
//        }
//    }
//		public static void main(String[] args) {
//	        int number = 8;
//
//	        if(number != 10) {
//	            System.out.println("Number is not equal to 10");
//	        } else {
//	            System.out.println("Number is equal to 10");
//	        }
//	    }
//	public static void main(String[] args) {
//        int number = 8;
//
//        if(number < 10) {
//            System.out.println("Number is less than to 10");
//        } else {
//            System.out.println("Number is greater than 10");
//        }
//	 public static void main(String[] args) {
//	        int number = 11;
//
//	        if(number > 10) {
//	            System.out.println("Number is greater than to 10");
//	        } else {
//	            System.out.println("Number is less than 10");
//	        }
//	    }
//    }
//    public static void main(String[] args) {
//        int number = 10;
//        int number2 = 20;
//
//        if(number >= 10 && number2 == 20) {
//            System.out.println("Number is greater than or equal to 10 and Number 2 is equal to 20");
//        } else {
//            System.out.println("Number is less than 10, or Number 2 is not equal to 20");
//        }
//    }
//	   public static void main(String[] args) {
//	        int number = 9;
//	        int number2 = 20;
//
//	        if(number >= 10 || number2 == 20) {
//	            System.out.println("Number is greater than or equal to 10 or Number 2 is equal to 20");
//	        } else {
//	            System.out.println("Number is less than 10, and Number 2 is not equal to 20");
//	        }
//	    }
//	public static void main(String[] args) {
//        int number = 10;
//        int number2 = 20;
//
//        if(number >= 10 & number2 == 20) {
//            System.out.println("Number is greater than or equal to 10 and Number 2 is equal to 20");
//        } else {
//            System.out.println("Number is less than 10, or Number 2 is not equal to 20");
//        }
//    }

//	    public static int variable = 0;
//
//	    public static void main(String[] args) {
//	        conditional();
//	    }
//
//	    public void conditional() {
//	        if (true & setValue()) {
//	            System.out.println(variable);
//	        }
//	    }
//
//	    public boolean setValue() {
//	        variable = 10;
//	        return true;
//	    }
	
	public static void main(String[] args) {
        int day = 5;

        switch(day) {
            case 1:
                System.out.println("Monday you can fall apart");
                break;
            case 2:
                System.out.println("Tuesday,");
                break;
            case 3:
                System.out.println("Wednesday break my heart");
                break;
            case 4:
                System.out.println("Oh, Thursday doesn't even start");
                break;
            case 5:
                System.out.println("It's Friday I'm in love");
                break;
            case 6:
                System.out.println("Saturdaaaay wait");
                break;
            case 7:
                System.out.println("Sunday always comes too late");
                break;
            default:
                System.out.println("You need to listen to The Cure");
                break;
        }
    }
	}
