package _20210129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int word = 0;

		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals("")) {
				word += 1;
			}
		}
		System.out.println(word);
	}

}
// 단어의 개수 (B2)