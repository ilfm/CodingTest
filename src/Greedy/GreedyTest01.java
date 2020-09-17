package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedyTest01 
{
	public static void main(String[] args) throws IOException
	{
		
		// 입력을 받기 위한 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받은 돈
		int inputMoney = Integer.parseInt(br.readLine());
		// 입력받은 돈을 나눌 때 담는 임시 변수
		int temp = 0;
		// 500 동전 개수
		int m500;
		// 100 동전 개수
		int m100;
		// 50 동전 개수
		int m50;
		// 10 동전 개수
		int m10;
		
		temp = inputMoney%500;
		m500 = inputMoney/500;
		
		m100 = temp/100;
		temp = temp%100;
		
		m50 = temp/50;
		temp = temp%50;
		
		m10 = temp/10;
		
		System.out.printf("%d %d %d %d", m500, m100, m50, m10);
		
		
		
	}	
}
