package com.doj.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorld {
	
	public static void main(String[] args) {
		//Message message = new Message();
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Message message = (Message) factory.getBean("message");
		
		message.showMessage();
	}

}
