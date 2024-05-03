package com.sify;

import org.aeonbits.owner.ConfigCache;

public class GetObj {

	
	public static DhoniInterface obj() {
		return ConfigCache.getOrCreate(DhoniInterface.class);
	}
	
}
