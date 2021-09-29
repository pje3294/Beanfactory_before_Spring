package test;

public class Buds implements EarPhone{

	@Override
	public void playMusic() {
		System.out.println("음악 재생♬");
	}

	@Override
	public void stopMusic() {
		System.out.println("음악 일시정지-");
	}

	@Override
	public void helpAI() {
		System.out.println("하이 빅스비~");
	}

}
