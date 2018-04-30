package co.com.test;

import org.apache.commons.text.WordUtils;

public class Cadena {
	
	public static void main(String[] args) {
		String text = "LOS PROGRAMADORES TIENEN EL AVANCE DEL MUNDO EN SUS MANOS";
		String result = WordUtils.capitalizeFully(text);
		
		String[] articles = {"Los", "Tienen", "El", "Del", "En", "Sus"};
		for (int i = 0; i < articles.length; i++) {
			articles[i] = " " + articles[i] + " ";			
			if(result.contains(articles[i])) {
				result = result.replace(articles[i].substring(0,2), articles[i].substring(0, 2).toLowerCase());
			}
		}
		System.out.println(result);
	}
}
