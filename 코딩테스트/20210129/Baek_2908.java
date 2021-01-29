package _20210129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());

		sb.reverse();

		System.out.println(Math.max(Integer.parseInt(sb.substring(0, 3)), Integer.parseInt(sb.substring(4))));
	}

}
// 상수 뒤집어서 비교 (B2)