
import java.util.*;




public class Tic_tac_tok {

	static int digit;
	
private int[][] tic = new int[digit][digit];




public Tic_tac_tok() {

for (int i = 0; i < digit; i++) {

for (int j = 0; j < digit; j++) {

tic[i][j] = 0;

}

}

}




public static void main(String[] args) {

// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);

int a;

Tic_tac_tok tic;




for (;;) {

System.out.println("======= Tic tac tok========");
System.out.println();
System.out.print("게임을 시작하시겠습니까?(1.네 2.아니요) : ");

a = scan.nextInt();

System.out.println();

System.out.print("몇칸으로 실행 하시겠습니까?");

digit=scan.nextInt();

tic = new Tic_tac_tok();




if (a == 1) {

for (;;) {

tic.showArray();

System.out.println("plyaer1님 차례입니다.");

tic.setNum(1);

if(tic.judgeWinner(1)==1)

break;

if(!tic.gameOver())

break;




tic.showArray();

System.out.println("plyaer2님 차례입니다.");

tic.setNum(2);

if(tic.judgeWinner(2)==2)

break;

if(!tic.gameOver())

break;

}

} else {

break;

}

}

}




public void showArray() {

for (int i = 0; i < digit; i++) {

for (int j = 0; j < digit; j++) {

System.out.print(tic[i][j] + " ");

}

System.out.println();

}

}




public void setNum(int player) {

Scanner scan = new Scanner(System.in);

System.out.print("x 좌표 입력 : ");

int x = scan.nextInt()-1;

System.out.print("y 좌표 입력 : ");

int y = scan.nextInt()-1;




if (x >= 0 && x < digit+1 && y >= 0 && y < digit+1) {

if (tic[x][y] == 0) {

tic[x][y] = player;

} else {

System.out.println("이미 있는 위치입니다. 다시 입력해 주세요");

setNum(player);

}

} else {

System.out.println("잘못된 범위를 입력하였습니다. 다시해주세요");

setNum(player);

}

}




public boolean gameOver() {

boolean over = true;



for(int i=0; i<digit; i++){

for(int j=0; j<digit; j++){

if(tic[i][j] == 0)

over = false;

}

}



if(!over) 
return true;

else{

showArray();

System.out.println("무승부");

return false;

}

}



public int judgeWinner(int player){

int count;



for(int i=0; i<digit; i++){

count = 0;

for(int j=0; j<digit; j++){

if(tic[i][j]==player)

count++;

}

if(count==digit){

System.out.println("player" + player + "승리!!");

return player;

}

}



for(int i=0; i<digit; i++){

count=0;

for(int j=0; j<digit; j++){

if(tic[j][i]==player)

count++;

}

if(count==digit){

System.out.println("player" + player + "승리!!");

return player;

}

}



count=0;

for(int i=0; i<digit; i++){

if(tic[i][i] == player)

count++;

}



if(count==digit){

System.out.println("player" + player + "승리!!");

return player;

}

else

return 0;

}

}
