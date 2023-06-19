package ch07;

public class ex7_1 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //조상 클래스로부터 상속받은 멤버
		ctv.channelUp(); //조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaprion("Hello, World");
		ctv.caption = true;
		ctv.displayCaprion("Hello, World");
	}
}

class Tv{
	boolean power; //전원상태 (on/off)
	int channel; //채널
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption; //캡션 상태(on/off)
	
	void displayCaprion(String text) {
		if(caption) { //캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
