package ch07;

public class ex7_6 extends Player {
	void play(int pos) {
		//추상 메서드 구현
	}

	@Override
	void stop() {
		// 추상 메서드 구현
	}
	
}

abstract class Player {
	abstract void play(int pos); // 추상메서드
	abstract void stop(); // 추상메서드
}