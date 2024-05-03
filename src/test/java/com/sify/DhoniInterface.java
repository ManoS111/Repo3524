package com.sify;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({ "system:properties", "classpath:trial.properties", "classpath:trial2.properties" })
//@Config.Sources({ "system:properties", "classpath:trial.properties" })

public interface DhoniInterface extends Config {
	@Key("userfullname")
	String name();

	@Key("age")
	int age();

	@Key("location")
	String area();
	
	@Key("school")
	String school();

}
