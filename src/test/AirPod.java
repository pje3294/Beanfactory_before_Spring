package test;

public class AirPod implements EarPhone{

	@Override
	public void playMusic() {
		System.out.println("���� play�ܢ�");
		
	}

	@Override
	public void stopMusic() {
		System.out.println("���� stop--");
	}

	@Override
	public void helpAI() {
		System.out.println("�ø���!!!");
	}

}
