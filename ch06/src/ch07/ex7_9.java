package ch07;

public class ex7_9 {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}
}

class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB { // AAA 클래스의 멤버처럼 사용
		void method() {
//			AAA a= new AAA();
//			System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부 클래스의 멤버 접근 가능
		}
	}
}
