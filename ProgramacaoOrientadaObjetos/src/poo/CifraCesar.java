package poo;
import java.util.ArrayList;
import java.util.Arrays;

public class CifraCesar {

	public static void main(String[] args) {
		ArrayList <String> cifra = new ArrayList <String> ();
		int letra = 0;
		String[] alfabeto = {"A", "B", "C", "D", "E", "F",
							 "G", "H", "I", "J", "K", "L",
							 "M", "N", "O", "P", "Q", "R",
							 "S", "T", "U", "V", "W", "X",
							 "Y", "Z"};
		
		ArrayList <String> Alpha = new ArrayList <String> (Arrays.asList(alfabeto));
		
		cifra.add("E");
		cifra.add("D");
		cifra.add("U");
		cifra.add("A");
		cifra.add("R");
		cifra.add("D");
		cifra.add("O");
		
		for (int j = 0; j < cifra.size(); j++) {
			for (int i = 0; i < Alpha.size(); i++) {
				
				if (cifra.get(j).equals(Alpha.get(i))) {
					if (Alpha.get(i).equals("Z")) {
						i = 0;
						letra = i + 2;
						j++;
						System.out.println(Alpha.get(letra));
					}
					else {
						letra = i + 3;
						System.out.println(Alpha.get(letra));
					}
				}
			}
		}
	}
}
