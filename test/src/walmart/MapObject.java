package walmart;

import java.util.Map;
import java.util.TreeMap;

public class MapObject {

	public static void main(String arg[]) {
		Map<String, String> mapLang = new TreeMap<>();
		 
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		 
		System.out.println(mapLang);
	}
}
