package fuxi07;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner scanner=new Scanner(System.in);
System.out.print("请输入一个成绩的等级(A/B/C/D/F):");
String degree=scanner.next();
switch(degree){
case"A":
System.out.println("分数>=90");
break;
default:
System.out.println("未知");
break;}
System.out.println("完毕");
}


	}


