package fuxi07;
import java.util.Scanner;

public class fuxi07 {
    hello
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ���ɼ��ĵȼ�(A/B/C/D/F):");
		String degree=scanner.next();
		
		switch (degree) {//()�еı���ʽ�������ֵ���ĸ�case���ֵ��ͬ��ִ�к������䣬()�еı���ʽ�������ֵֻ����byte/short/int/char/String
		case "A":
			System.out.println("����>=90");
			break;//����switch�ṹ
		case "B":
			System.out.println("80<=����<90");
			break;
		case "C":
			System.out.println("70<=����<80");
			break;
		case "D":
			System.out.println("60<=����<70");
			break;
		case "F":
			System.out.println("����<60");
			break;
		default:
			System.out.println("δ֪�ĵȼ���");
			break;
		}//ÿ��case���ֵ�������ظ���case�����ֵһ��Ҫ�ǳ�������ֵ,�����Ǳ���;ÿ��case��Ҫ��һ��break��
		
		System.out.println("����ִ����ϣ�");
	}

	}


