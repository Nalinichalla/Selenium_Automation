package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void a() {
		System.out.println("@a_login");
	}

	@Test
	void b() {
		System.out.println("@b_validateCredentials");
	}

	@Test
	void c() {
		System.out.println("@c_logout");
	}

}
