import java.io.*;

  public class Stream{
  
  public static void main(String[] args) throws IOException{
    FileOutputStream in = new FileOutputStream("Stream.txt"); // ��Ʈ������ �Է�
     in.write(72); //H
     in.write(101); //E
     in.write(108); //L
     in.write(108); //L
     in.write(111); //O
     in.close(); //in �ݱ�
   System.out.println("Stream.txt ���� ��ϿϷ�");
   
   
   FileInputStream out=new FileInputStream("Stream.txt"); // ��Ʈ������ ����
   int r_byte;
   r_byte=out.available();
   System.out.println(r_byte); // Stream.txt ������ ���� �뷮 �� ����Ʈ
   byte buf[]=new byte[r_byte];
   
   r_byte=out.read(buf);
   
   System.out.println(new String(buf)); //Stream.txt ������ ���� ����Ʈ
  } 
} 
