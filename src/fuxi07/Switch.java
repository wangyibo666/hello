package fuxi07;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Scanner scanner=new Scanner(System.in);
System.out.print("������һ���ɼ��ĵȼ�(A/B/C/D/F):");
String degree=scanner.next();
switch(degree){
case"A":
System.out.println("����>=90");
break;
default:
System.out.println("δ֪");
break;}
System.out.println("���");
}


	}


