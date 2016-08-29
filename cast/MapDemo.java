package cast;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Number> map = new LinkedHashMap<String, Number>();
		map.put("kitty", new Integer(100));
		map.put("snoopy", 101);
		map.put("micky", 3.14);
		map.put("garfield", 15000L);
		map.put("kitty", 200L);
		Set<String>  set = map.keySet();
		for(String e :set){
			System.out.println(e + "==>" + map.get(e));
		}
		
		
		
		

	}

}
