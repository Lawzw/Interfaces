package demo;

import java.lang.*;
import java.util.Scanner;
/*
 * ʹ��scanner����������ȡ�û�����ĳɼ���Ϣ
 * scanner��λ��java.util���У�ʹ��ʱ�赼��˰�
 * ���裺
 * 1������java.util.Scanner
 * 2������Scanner����
 * 3�����ղ������û������ֵ
 */
public class Demo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//����Scanner����
		System.out.print("�������û��ɼ���Ϣ��");
		int score=input.nextInt();//��ȡ�û���������ݲ������ڱ�����
		int count=0;
		System.out.println("�޸�ǰ�ɼ���"+score);
		while(score<60){
			score+=1;
			count++;
		}
		System.out.println("�޸ĺ�ɼ���"+score);
		System.out.println("�޸Ĵ�����"+count);
	}
}