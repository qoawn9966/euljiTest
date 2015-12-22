import java.util.*;
 
public class heap {
 static int n = 30;  //소팅할 갯수
 static int sja[] = new int[n]; // 소팅을 할 배열  2차원일시에는 2차원배열로 선언한다.
 
/**
* 소팅 배열에 랜덤함수를 이용하여 숫자를 입력해넣는다.
*/
 public void randInit(){
   for (int i = 0; i < n; i++ ){
       int r = (int)(Math.random()*n+1);  //랜덤함수를 발생하여 배열을 초기화
       sja[i]=r;
   } 
   System.out.print("before : ");   
   for (int i = 0; i < sja.length; i++ ){
      System.out.print(sja[i] + " ");   //소팅전 데이타를 출력해본다.
    }
 }
 
/**
* 소팅 배열에 랜덤함수를 이용하여 숫자를 입력해넣는다.
*/
 public void QuickSort(int a[], int lo0, int hi0)
   {
      int lo = lo0;
      int hi = hi0;
      int mid;
      if ( hi0 > lo0)
      {
          mid = a[ ( lo0 + hi0 ) / 2 ];
         while( lo <= hi )
         {
            while( ( lo < hi0 ) && ( a[lo] < mid )) ++lo;
            while( ( hi > lo0 ) && ( a[hi] > mid )) --hi;
            if( lo <= hi )
            {
               swap(a, lo, hi);
               ++lo;
               --hi;
            }
         }
         if( lo0 < hi )
            QuickSort( a, lo0, hi );
         if( lo < hi0 )
            QuickSort( a, lo, hi0 );
      }
   }
/**
* 소팅데이타를 바꾸는 함수부분
*/
   private void swap(int a[], int i, int j)
   {
      int T;
      T = a[i];
      a[i] = a[j];
      a[j] = T;
   }
 
/**
* 소팅후 소팅된 데이타를 출력한다
*/
   public void PrintSort(){
      System.out.print("after :");
   for (int i = 0; i < sja.length; i++ ){
       System.out.print(sja[i]+ " ");
    }
 }
/**
* 메인함수
*/
 public static void main(String[] args) 
 {
    try{
    heap quick = new heap();
    quick.randInit();
    quick.QuickSort(sja, 0, sja.length - 1);
    System.out.println();
    quick.PrintSort();
    }catch(Exception ex){
     System.out.println(ex);
    }
   }
}
