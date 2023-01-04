package zad3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		XmlCreator xml = new XmlCreator();
		List<Student> s = new ArrayList<Student>();
		s.add(new Student("Stefan", "Stefanovski", 100));
		s.add(new Student("Aleksandar", "Ristevski", 105));
		xml.createXMLFile("xml.xml", s);
	}

}
