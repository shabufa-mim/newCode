package com.bit.test;

import org.junit.Test;

import Pages.HomePage;
import Pages.ShirtPage;

public class SmokeTest extends BaseTest {
	
	HomePage hp;
	ShirtPage sp;
	
@Test
 public void buyAShirt() {
	hp  = new HomePage(dr);
	hp.hoveroverinmainmenu();
	sp = hp.clickAllShirtSubMenu();
}

 @Test

 public void hoverOverOnWomenMenu() {
	 

}
}
