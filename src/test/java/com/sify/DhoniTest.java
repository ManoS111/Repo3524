package com.sify;

import java.lang.reflect.InvocationTargetException;

public class DhoniTest {
	

	public static void main(String[] args) throws Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {

	//	String area = GetObj.obj().area();
		String area = GetObjWithHelpOfInstance.obj().area();
		System.out.println("area >"+area);
        System.out.println("Welcome Notes Persion X ...");
		System.out.println("Person Y ...");
		System.out.println("Scripted  for add sub mul");
		
		
	}

}
