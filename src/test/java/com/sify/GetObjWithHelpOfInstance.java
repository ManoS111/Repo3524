package com.sify;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.aeonbits.owner.ConfigCache;

public class GetObjWithHelpOfInstance {

	
	public static DhoniInterface obj() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		@SuppressWarnings("unchecked")
		//Class<DhoniInterface> cls = (Class<DhoniInterface>)Class.forName("com.sify.DhoniInterface");
		//Constructor<DhoniInterface> constructor = cls.getDeclaredConstructor();
		////constructor.setAccessible(true);
		//DhoniInterface planet = constructor.newInstance();
		Class<?> cls = Class.forName("com.sify.DhoniInterface");
		Object _instance = cls.newInstance();
		return (DhoniInterface) _instance;
	}
	
}
