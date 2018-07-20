package com.ibytecode.clientutility;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import weblogic.jndi.Environment;

public class ClientUtility {
	
	private static Context initialContext;
	
	public static Context getInitialContext() throws NamingException{
		if(initialContext == null){
			/*
			Properties props = new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			props.put(Context.PROVIDER_URL, "t3://localhost:7001");
			props.put(Context.SECURITY_PRINCIPAL, "sandoval0992");
			props.put(Context.SECURITY_CREDENTIALS, "Sk502130");
			
			initialContext = new InitialContext(props);
			//*/
			/*
			Hashtable env = new Hashtable(5);
			env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			env.put(Context.PROVIDER_URL, "t3://localhost:7001");
			initialContext = new InitialContext(env);
			//*/
			
			Environment environment = new Environment();
			environment.setInitialContextFactory(weblogic.jndi.Environment.DEFAULT_INITIAL_CONTEXT_FACTORY);
			environment.setProviderURL("t3://localhost:7001");
			environment.setSecurityPrincipal("sandoval0992");
			environment.setSecurityCredentials("Sk502130");			
			
			initialContext = environment.getInitialContext();
		}
		return initialContext;
	}

}
