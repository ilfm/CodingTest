package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedyTest01 
{
	public static void main(String[] args) throws IOException
	{
		
		// �Է��� �ޱ� ���� BufferedReader ��ü ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է� ���� ��
		int inputMoney = Integer.parseInt(br.readLine());
		// �Է¹��� ���� ���� �� ��� �ӽ� ����
		int temp = 0;
		// 500 ���� ����
		int m500;
		// 100 ���� ����
		int m100;
		// 50 ���� ����
		int m50;
		// 10 ���� ����
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
