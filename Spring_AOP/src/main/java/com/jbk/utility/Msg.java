package com.jbk.utility;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Msg {
	
	
	
	
	@Pointcut("execution(public void deposit())")
	public void messageSend() {
		
	}
	@After("messageSend()")
	public void sendSMS() {
		System.out.println(".....SMS Send to client....");
	}
	
	
	
	//This is @After method

	@Pointcut("execution(public void deposit(..))")
	public void messageSend1() {
		
	}
	
	@After("messageSend()")
	public void sendSMS1(JoinPoint jt) {
	System.out.println("=======  SMS Send To the Client=========== "+Arrays.toString(jt.getArgs()));
		}
	
	
	
	
	//This is @Before method
	
	@Pointcut("execution (public void withdraw())")
	public void pinValid() {
		
	}
	
	@Before("pinValid()")
	public void checkpinValid() {
		System.out.println("+++++++++++ Pin is Validatated++++++++++++");
	}
	
	
	
	
	// This is @Arround Method
	
	
	@Pointcut("execution (* com.tka.entity.Account.*(..)) ")
	public void checkAfterBeforeLogic() {		
	}	
	@Around("checkAfterBeforeLogic()")
	public void arroundMessage(ProceedingJoinPoint p) {		
		System.out.println("======== before Method Pin is validatated==============");
		//pin validation logic 		
		// end of pin validation logic 		
			try {
				p.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
		// Send SMS Logic 
		
		System.out.println("========After Method Send SMS Logic=====");		
	}
	

}
