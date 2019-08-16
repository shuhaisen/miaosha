package com.shs.main;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shs.Service.CoService;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		ioc.start();
		CoService service =ioc.getBean(CoService.class);

		for (int i=0;i<1000;i++) {
			Thread thread =new Thread(new goumai(service),"买家"+i+"号");
			thread.start();
		}
		System.in.read();
	}
	
	public static class goumai implements Runnable{
		private CoService service;
		public goumai(CoService service) {
			this.service=service;
		}
		
		public void run() {
			// TODO Auto-generated method stub
			if (service.updateSpByid("001"))
				System.out.println(Thread.currentThread().getName()+"------购买成功!!!!!!!!!!!");
			else System.out.println(Thread.currentThread().getName()+"------购买失败!!!!!!!!!!!");
			
		}
		
	}
}
