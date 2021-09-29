package test;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("airpod")) {
			return new AirPod();
		}else if(beanName.equals("buds")) {
			return new Buds();
		}
		
		return null;
	}
}
