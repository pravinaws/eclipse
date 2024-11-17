package sparsh.utils;

import java.util.UUID;

public class UniqueIdGenration {
	public static String uniqidGen() {
		
	
	UUID uuid = UUID.randomUUID();
	System.out.println(uuid);
	String uniqeId = uuid.toString();
	String newId = uniqeId.replace("-","");
	System.out.println(newId);
	return newId;
}
}
