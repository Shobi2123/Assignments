package week1Hw1;

public class TwoWheeler {

	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=123456;
	boolean isPunctured= true;
	String bikeName= "Sai";
	double runningKM=100.300;
	
	public static void main(String[] args) {
		TwoWheeler live = new TwoWheeler();
		System.out.println(live.noOfWheels);
		System.out.println(live.noOfMirrors);
		System.out.println(live.chassisNumber);
		System.out.println(live.isPunctured);
		System.out.println(live.bikeName);
		System.out.println(live.runningKM);
}
}
