package com.sify;

import java.lang.reflect.InvocationTargetException;

public class DhoniTest {
	

	public static void main(String[] args) throws Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {

	//	String area = GetObj.obj().area();
		String area = GetObjWithHelpOfInstance.obj().area();
		System.out.println("area >"+area);
		//System.out.println("Name >"+GetObj.obj().name());
		//System.out.println("School >"+GetObj.obj().school());
		
	
		
	}

}
