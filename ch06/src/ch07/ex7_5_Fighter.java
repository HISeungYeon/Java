package ch07;

public class ex7_5_Fighter implements Fightable {
	public void move(int x, int y) { /* 구현 */ }
	public void attack(String u) { /* 구현 */ }
}

interface Fightable{
	void move(int x, int y);
	void attack(String u);
}

//abstract class Fighter implements Fightable {
//	public void move(int x, int y) { //구현 }
//} 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함

//class Fighter extends Unit implements Fightable{
//	public void move(int x, int y) { //구현 }
//	public void attack(Unit u) { //구현 }
//} 상속과 구현을 동시에 할 수 있다.