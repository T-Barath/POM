package com.TestNG;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoretest {

	
		
		@Test
		private void women() {
			System.out.println("Women");

		}
		@Test
		@Ignore
		private void dresses() {
			System.out.println("Dresses");

		}
		
		@Test
		private void tshirt() {
			System.out.println("T-Shirt");

			}

	}

