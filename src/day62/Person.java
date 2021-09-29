package day62;

public class Person {
	public static void main(String[] args) {
		BeanFactory  factory = new BeanFactory();
		Phone phone = (Phone)factory.getBean(args[0]);
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.powerOff();
		
		// 아이폰 -> 갤럭시 변경시 객체명, 메소드명 다 수정해야됨,, == 높은 결합도
		
		
		
	}
}
