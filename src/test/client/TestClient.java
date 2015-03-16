package test.client;

import pkg.singleton.Singleton;

/*
 * See:
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		Singleton myInstanceA = Singleton.getInstance();
		System.out.println("myInstanceA: " + myInstanceA);
		System.out
				.println("myInstanceA Hash: "
						+ System.identityHashCode(System
								.identityHashCode(myInstanceA)));

		Singleton myInstanceB = Singleton.getInstance();
		System.out.println("myInstanceB: " + myInstanceB);
		System.out
				.println("myInstanceB Hash: "
						+ System.identityHashCode(System
								.identityHashCode(myInstanceB)));

	}

}