package day04.demo;
import javax.swing.*;
import java.util.Scanner;

/*
��������(Anonymous)��
һ����������� ������=new ������();
�������������ֻ���ұߵĶ���û����ߵ����ֺ͸�ֵ�������
��ʽ��new ������();
ע����������ֻ��ʹ��һ�Ρ�
ʹ�ý��飺���ȷ���������ֻ��Ҫʹ��Ψһ��һ�Σ�������������Ϊ�����ķ���ֵ



*/
public class Demo3 {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="Dora";
        person.showName();
        //��������
        new Person().name="Dora";
        new Person().showName();//null
        Scanner sc= methodReturn();
        int num=sc.nextInt();
        System.out.println("������ǣ�"+num);

    }

    //ʹ������������Ϊ�����ķ���ֵ
    public static  Scanner methodReturn(){

        return new Scanner(System.in);
    }

}

