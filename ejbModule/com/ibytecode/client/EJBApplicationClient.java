package com.ibytecode.client;

import javax.naming.Context;
import javax.naming.NamingException;

import com.ibytecode.businesslogic.HelloWorldBean;
import com.ibytecode.clientutility.ClientUtility;

public class EJBApplicationClient {

	private final static String LOOKUP_STRING = "HelloWorldBean/remote";
	//HelloWorldBean/remote
	//HelloWorldSessionBeanHelloWorldSessionBeanHelloWorldBean_Home
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldBean bean = doLookup();
		System.out.println(bean.sayHello());
	}
	
	private static HelloWorldBean doLookup(){
		Context context = null;
		HelloWorldBean bean = null;
		try{
			context = ClientUtility.getInitialContext();
			bean = (HelloWorldBean)context.lookup(LOOKUP_STRING);
		}catch(NamingException e){
			e.printStackTrace();
		}
		return bean;
	}
	//C:\Oracle\Middleware\modules\com.bea.core.jarbuilder_1.7.0.0.jar

}
