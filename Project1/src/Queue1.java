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
             
             System.out.println("ť�� ���� �Է��� �����Ͱ� ���� ���´�(���Լ���)");
       }

}
