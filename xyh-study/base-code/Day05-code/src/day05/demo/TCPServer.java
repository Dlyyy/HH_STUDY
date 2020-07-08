package day05.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    /*
    TCPͨ�ŵķ������ˣ����տͻ��˷��͵����ݣ����ͻ��˻�д����
    һ����ʾ�������˵��ࣺ
    java.net.ServerSocket:����ʵ�ַ��������׽���
    ���췽����
    ServerSocket(int port)�����󶨵��ض��˿ڵķ������׽���
    ������port���˿ں�
    ����������֪�����ĸ��ͻ��˵�����
    ���Կ���ʹ��accept������ȡ������Ŀͻ��˶���Socket
    ��Ա������
    Socket accept():���������յ��׽��ֵ�����
    ʵ�ֲ��裺
    1.����������ServerSocket�����ϵͳҪָ���Ķ˿�
    2.ʹ��ServerSocket���󷽷��е�accept����ȡ������Ŀͻ��˶���Socket
    3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream
    4.ʹ�������ֽ�������InputStream�����еķ���read����ȡ�ͻ��˷��͵�����
    5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������InputStream
    6.ʹ�������ֽ������OutputStream����ķ���write�����ͻ���д������
    7.�ͷ���Դ
    */
    public static void main(String[] args) throws IOException {
        // 1.����������ServerSocket�����ϵͳҪָ���Ķ˿�
        ServerSocket server=new ServerSocket(8888);
        // 2.ʹ��ServerSocket���󷽷��е�accept����ȡ������Ŀͻ��˶���Socket
        Socket socket=server.accept();
        //3.ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream
        InputStream is=socket.getInputStream();
        //4.ʹ�������ֽ�������InputStream�����еķ���read����ȡ�ͻ��˷��͵�����
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5.ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������InputStream
        OutputStream os=socket.getOutputStream();
        //6.ʹ�������ֽ������OutputStream����ķ���write�����ͻ���д������
        os.write("�յ���лл".getBytes());
        //7.�ͷ���Դ
        socket.close();
        server.close();



    }
}
