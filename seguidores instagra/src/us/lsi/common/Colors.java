package us.lsi.common;

import java.util.HashMap;
import java.util.Map;




public class Colors {
	
	private static Map<Integer, String> mapColors = null;
		
	public static String getNameOfColor(Integer color) {			
		if (Colors.mapColors==null) {
			Map<Integer,String> m;
			m = new HashMap<>();
			m.put(0, "");
			m.put(1, "red");
			m.put(2, "yellow");
			m.put(3, "gray");
			m.put(4, "cyan");
			m.put(5, "orange");
			m.put(6, "magenta");
			m.put(7, "blue");
			m.put(8, "black");
			m.put(9, "green");
			Colors.mapColors = m;
		}
		return Colors.mapColors.get(color);
	}
	

}
