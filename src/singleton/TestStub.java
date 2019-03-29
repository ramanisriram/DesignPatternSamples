package singleton;

import singleton.SingletonPattern;

public class TestStub {
	public static void main(String args[]) {
		System.out.println(SingletonPattern.getInstance().toString());
		System.out.println(SingletonPattern.getInstance().toString());
		System.out.println(SingletonPattern.getInstance().toString());
	}
}