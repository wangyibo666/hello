package fuxi07;
import java.util.Scanner;

public class fuxi07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入一个成绩的等级(A/B/C/D/F):");
		String degree=scanner.next();
		
		switch (degree) {//()中的表达式或变量的值跟哪个case后的值相同就执行后面的语句，()中的表达式或变量的值只能是byte/short/int/char/String
		case "A":
			System.out.println("分数>=90");
			break;//跳出switch结构
		case "B":
			System.out.println("80<=分数<90");
			break;
		case "C":
			System.out.println("70<=分数<80");
			break;
		case "D":
			System.out.println("60<=分数<70");
			break;
		case "F":
			System.out.println("分数<60");
			break;
		default:
			System.out.println("未知的等级！");
			break;
		}//每个case后的值不允许重复；case后面的值一定要是常量或常量值,不能是变量;每个case后都要跟一个break。
		
		System.out.println("程序执行完毕！");
	}

	}


