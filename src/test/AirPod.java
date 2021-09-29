package test;

public class AirPod implements EarPhone{

	@Override
	public void playMusic() {
		System.out.println("À½¾Ç play¢Ü¢Û");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("À½¾Ç stop--");
	}

	@Override
	public void helpAI() {
		System.out.println("½Ã¸®¾ß!!!");
	}

}
