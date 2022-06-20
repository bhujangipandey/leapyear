package secondtest;

public class LeapYearTest {

	public static void main(String[] args) {
	
	
	}

	public static boolean checkDatepattern(String date) {
		if(date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[1-2]))-([0-9]{4})$")) {
			return true;
		}else {
			return false;
		}
	}

	public static int getDate(String date) {
		String []dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-3]);
		
	}

	public static int getMonth(String date) {
		String []dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-2]);
		
	}

	public static int getYear(String date) {
		String []dateArray = date.split("-");
		return Integer.parseInt(dateArray[dateArray.length-1]);
		
	}

	private static boolean checkDivisibleByHundred(String year) {
		String Value = year.substring(2,4);
		int lastTwoNumber = Integer.parseInt(Value);
		if(lastTwoNumber == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
