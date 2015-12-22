import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

       public static void main(String[] args) {

             Queue q = new LinkedList();

             q.offer("First data");

             q.offer("Second data");

             q.offer("Third data");

             System.out.println("---------");


             while(!q.isEmpty()){

                    System.out.println(q.poll());

             }
             
             System.out.println("큐는 먼저 입력한 데이터가 먼저 나온다(선입선출)");
       }

}
