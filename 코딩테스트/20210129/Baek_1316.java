package _20210129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int count = 0;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			if (groupWord()) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean groupWord() throws IOException {
		boolean[] groupWord = new boolean[26];
		int prev = 0;
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (!groupWord[now - 'a']) {
					groupWord[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			}
		}

		return true;
	}

}
// 그룹 단어 체커(S5) - 구현, 문자열