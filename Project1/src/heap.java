import java.util.*;
 
public class heap {
 static int n = 30;  //������ ����
 static int sja[] = new int[n]; // ������ �� �迭  2�����Ͻÿ��� 2�����迭�� �����Ѵ�.
 
/**
* ���� �迭�� �����Լ��� �̿��Ͽ� ���ڸ� �Է��سִ´�.
*/
 public void randInit(){
   for (int i = 0; i < n; i++ ){
       int r = (int)(Math.random()*n+1);  //�����Լ��� �߻��Ͽ� �迭�� �ʱ�ȭ
       sja[i]=r;
   } 
   System.out.print("before : ");   
   for (int i = 0; i < sja.length; i++ ){
      System.out.print(sja[i] + " ");   //������ ����Ÿ�� ����غ���.
    }
 }
 
/**
* ���� �迭�� �����Լ��� �̿��Ͽ� ���ڸ� �Է��سִ´�.
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
* ���õ���Ÿ�� �ٲٴ� �Լ��κ�
*/
   private void swap(int a[], int i, int j)
   {
      int T;
      T = a[i];
      a[i] = a[j];
      a[j] = T;
   }
 
/**
* ������ ���õ� ����Ÿ�� ����Ѵ�
*/
   public void PrintSort(){
      System.out.print("after :");
   for (int i = 0; i < sja.length; i++ ){
       System.out.print(sja[i]+ " ");
    }
 }
/**
* �����Լ�
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
