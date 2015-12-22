import java.io.*;

  public class Stream{
  
  public static void main(String[] args) throws IOException{
    FileOutputStream in = new FileOutputStream("Stream.txt"); // 스트림파일 입력
     in.write(72); //H
     in.write(101); //E
     in.write(108); //L
     in.write(108); //L
     in.write(111); //O
     in.close(); //in 닫기
   System.out.println("Stream.txt 파일 기록완료");
   
   
   FileInputStream out=new FileInputStream("Stream.txt"); // 스트림파일 빼기
   int r_byte;
   r_byte=out.available();
   System.out.println(r_byte); // Stream.txt 파일의 글자 용량 수 프린트
   byte buf[]=new byte[r_byte];
   
   r_byte=out.read(buf);
   
   System.out.println(new String(buf)); //Stream.txt 파일의 내용 프린트
  } 
} 
