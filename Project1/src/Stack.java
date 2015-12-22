
import java.io.*;
public class Stack{
 public static void main(String[] ar) throws IOException{
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  int a, c = 0;
  int [] x = new int [4];
  
 
  while (true){
  for (int b = 0; b <= x.length; b++ ){
  System.out.print("입력 = 1, 삭제 = 2, 초기화 = 3 : ");
  a = Integer.parseInt(in.readLine());
  
  if (a == 1){
   System.out.print("입력 값은 = ");
  x[c] = Integer.parseInt(in.readLine());
   ++c;
   if ( c == 4){
    System.err.println(" 꽉 찼습니다.");
   }
   System.out.println("현 상태 : " + x[0] +" "+ x[1]+ " " + x[2] +" " + x[3]);
  }
  else if (a == 2){
   System.out.println("삭제 값 = " + x[c-1]);
   x[c-1] = 0;
   c--;
    if (c-1 == -1){
    System.err.println(" 비었습니다.");
    
   }
   
   System.out.println("현 상태 : " + x[0] +" "+ x[1]+ " " + x[2] +" " + x[3]);
   
  }
  else if (a == 3){
   x[0] = 0; x[1] = 0; x[2] = 0; x[3] = 0;
   c = 0;
   System.out.println("현 상태 : " + x[0]+ " " + x[1] + " " + x[2] + " " + x[3] );
  }
  }
   }
  }
 }

