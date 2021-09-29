package test;

public class Person {
	public static void main(String[] args) {
		BeanFactory bf = new BeanFactory();
		
		EarPhone earphone = (EarPhone)bf.getBean(args[0]);
		earphone.helpAI();
		earphone.playMusic();
		earphone.stopMusic();
		
		
	}
}
