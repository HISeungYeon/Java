package ch07;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다.");}
}

interface Fightable2 {
	void move(int x, int y);
	void attack(Fightable2 f);
}

class Fighter extends Unit implements Fightable2{

	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 범위가 좁으면 안된다. (public 안쓰면 default!!)
	public void move(int x, int y) { 
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	
	public void attack(Fightable2 f) {
		System.out.println(f + "를 공격");
	}
	
	//싸울 수 있는 상대를 불러온다.
	Fightable2 getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f;
	}
	
}

public class ex7_7 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.getFightable();
		
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2);  // == f.attack(new Fighter()); 
		
	}
}
