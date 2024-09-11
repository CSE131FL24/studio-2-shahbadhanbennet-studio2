package studio2;

public class Ruin {

	public static void main(String[] args) {
		double winChance = 0.5;
		int winLimit = 1000;
		int winCounter = 0;
		int lossCounter = 0;
		int dayCounter = 0;
		int days = 100;
		int successCounter = 0;
		int ruinCounter = 0;
		int probSuccess = 0;
		for (int i = 1; i <= 100; i = i + 1)
		{
			int startAmount= 500;

			while ((startAmount < winLimit) && (startAmount > 0)) {
				int randomNum = (int)(Math.random()*10)+1;
				dayCounter = dayCounter + 1;
				System.out.println(randomNum);
				if (randomNum < winChance*(10.0)) {
					System.out.println("win");
					startAmount++;
					winCounter++;
				}
				else {
					System.out.println("loss");
					startAmount--;
					lossCounter++;
				}	
			}
			if (startAmount == winLimit){
				System.out.println("success");
				successCounter = successCounter + 1;
			}// if
			else {
				System.out.println("ruin");
				ruinCounter++;
			}// else
			System.out.println("Days: " + i);
			probSuccess = successCounter/(successCounter + ruinCounter) * 100;
		}// while loop ends
		System.out.println(ruinCounter + " " + successCounter);
		System.out.println(probSuccess);
	}// for loop end

}	



//reference: used geeksforgeeks

