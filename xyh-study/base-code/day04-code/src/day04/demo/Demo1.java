package day04.demo;
import javax.lang.model.element.NestingKind;
import java.util.Scanner;
/*
����API��
1.Scanner��Ĺ��ܣ�����ʵ�ּ����������ݵ������С�
�������͵�һ��ʹ�ò��裺
1.����
import ��·��.������
ע��
1�������Ҫʹ�õ�Ŀ����͵�ǰ��λ��ͬһ�����£������ʡ�Ե�����䡣
2��ֻ��java.lang���µ����ݲ���Ҫ����������������Ҫimport��䡣
2.����
3.ʹ��
*/
public class Demo1 {
    public static void main(String[] args) {
        //String��java.lang�У����赼��
        String str="123";
        //�Ӽ��̽�������
        Scanner sc=new Scanner(System.in);
        //��int���ͽ���
        int input=sc.nextInt();
        //��String���ͽ���
        String str1=sc.next();
        System.out.println("����������ǣ�"+input);
        System.out.println("������ַ��ǣ�"+str1);

    }
}
