/**
 * 
 */
package com.gqt.core.java.p1;

import java.util.Scanner;
/**
 * @author Shalini
 *
 */
class automobile{
	int auto_choice=0;
	private String st;
	void list() {
		System.out.println("1.CAR");
		System.out.println(" 2.BIKE");
		System.out.println(" 3.SCOOTER");
		choice();
		}
	void choice() {
		System.out.println("ENTER YOUR CHOICE:");
		Scanner sc = new Scanner (System.in);
		int auto_choice = sc.nextInt();
		if (auto_choice==1) {
			System.out.println("CAR DETAILS:");
			System.out.println("CAR NAME : BALENO");
			System.out.println("VARIENT : DISEAL");
			System.out.println("COST : Rs.1200000");
		}
		else if (auto_choice==2) {
			System.out.println("BIKE DETAILS:");
			System.out.println("BIKE NAME: ROYAL ENFIELD");
			System.out.println("COLOUR: BLACK");
			System.out.println("COST : Rs150000");
		}
		else {
			System.out.println("SCOOTER DETAILS:");
			System.out.println("SCOOTER : TVS JUPITER");
			System.out.println("COLOUR : RED");
			System.out.println("COST : Rs75000");
		}
		paymentPage();
	}
	void paymentPage() {
		if (auto_choice==1) {
		System.out.println("THE ITEM SELECTED BY YOU IS : CAR");
		}
		else if (auto_choice==2) {
			System.out.println("THE ITEM SELECTED BY YOU IS : BIKE");
		}
		else {
			System.out.println("THE ITEM SELECTED BY YOU IS : SCOOTER");
		}
		
		System.out.println("DO YOU WANT TO BUY? SAY Y OR N.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		st =scan.next();
		if (st.equalsIgnoreCase("y")) {
			System.out.println("MAKE PAYMENT");
			System.out.println("ENTER CARD DETAILS:");
			paymentStatus();
			}
		else {
			System.out.println("EXIT");
		}
			}
	void paymentStatus() {
		System.out.println("PAYMENT DONE");
		System.out.println("YOUR PURCHASE WAS SUCCESSFUL" );
	}
}
class electronics{
	int elec_choice=0;
	private String st;
	void list() {
		System.out.println("1.TELEVISION");
		System.out.println("2.LAPTOP");
		System.out.println("3.MOBILE");
		choice();
		}
	void choice() {
		System.out.println("ENTER YOUR CHOICE:");
		Scanner sc = new Scanner (System.in);
		int elec_choice = sc.nextInt();
		if (elec_choice==1) {
			System.out.println("TELEVISION DETAILS:");
			System.out.println("SAMSUNG  44-Inches  Rs.55000");
		}
		else if (elec_choice==2) {
			System.out.println("LAPTOP DETAILS:");
			System.out.println("DELL INSPERION  Rs52000");
		}
		else {
			System.out.println("MOBILE DETAILS:");
			System.out.println("REDMI-NOTE11  BLUE Rs18000");
		}
		paymentPage();
	}
	void paymentPage() {
		System.out.println("THE ITEM SELECTED BY THE YOU IS :"+elec_choice);
		System.out.println("DO YOU WANT TO BUY? SAY Y OR N.");
		Scanner scan = new Scanner(System.in);
		st =scan.next();
		if (st.equalsIgnoreCase("y")) {
			System.out.println("MAKE PAYMENT");
//			paymentStatus();
			}
		else {
			System.out.println("EXIT");
		}
			}
//	void paymentStatus() {
//		System.out.println("PAYMENT DONE");
//		System.out.println("YOU PURCHASED "+elec_choice);
//	}
}
class clothing{
	int clo_choice=0;
	private String st;
	void list() {
		System.out.println("1.JACKETS 2.SWEAT-SHIRTS 3.TRACK-PANTS");
		choice();
		}
	void choice() {
		System.out.println("ENTER YOUR CHOICE:");
		Scanner sc = new Scanner (System.in);
		int clo_choice = sc.nextInt();
		if (clo_choice==1) {
			System.out.println("JACKETS DETAILS:");
			System.out.println("LEATHER  BROWN  UNISEX");
		}
		else if (clo_choice==2) {
			System.out.println("SWEAT-SHIRTS DETAILS:");
			System.out.println("COTTON BLACK PRINTED");
		}
		else {
			System.out.println("TRACK-PANTS DETAILS:");
			System.out.println("NAVY-BLUE  XXL  WATERPROOF");
		}
		paymentPage();
	}
	void paymentPage() {
		System.out.println("THE ITEM SELECTED BY THE YOU IS :"+clo_choice);
		System.out.println("DO YOU WANT TO BUY? SAY Y OR N.");
		Scanner scan = new Scanner(System.in);
		st =scan.next();
		if (st.equalsIgnoreCase("y")) {
			System.out.println("MAKE PAYMENT");
			paymentStatus();
			}
		else {
			System.out.println("EXIT");
		}
			}
	void paymentStatus() {
		System.out.println("PAYMENT DONE");
		System.out.println("YOU PURCHASED "+clo_choice);
	}
}
class household{
	int item_choice=0;
	private String st;
	void list() {
		System.out.println("1.WASHING MACHINE 2.MICROWAVE 3.GAS-STOVE");
		choice();
		}
	void choice() {
		System.out.println("ENTER YOUR CHOICE:");
		Scanner sc = new Scanner (System.in);
		int item_choice = sc.nextInt();
		if (item_choice==1) {
			System.out.println("WASHING MACHINE DETAILS:");
			System.out.println("IFB  FRONT-LOAD  GREY");
		}
		else if (item_choice==2) {
			System.out.println("MICROWAVE DETAILS:");
			System.out.println("HAIER  WHITE  25-LTS");
		}
		else {
			System.out.println("GAS-STOVE DETAILS:");
			System.out.println("PRESTIGE  3-BURNER  GLASSTOP");
		}
		paymentPage();
	}
	void paymentPage() {
		System.out.println("THE ITEM SELECTED BY THE YOU IS :"+item_choice);
		System.out.println("DO YOU WANT TO BUY? SAY Y OR N.");
		Scanner scan = new Scanner(System.in);
		st =scan.next();
		if (st.equalsIgnoreCase("y")) {
			System.out.println("MAKE PAYMENT");
			paymentStatus();
			}
		else {
			System.out.println("EXIT");
		}
			}
	void paymentStatus() {
		System.out.println("PAYMENT DONE");
		System.out.println("YOU PURCHASED "+item_choice);
	}
}
public class projectlaunchmain {
	public static void main(String[] args) {
		System.out.println("**** WELCOME TO GQT SHOPPING MART ****");
        System.out.println("AVAILABLE PRODUCT CATEGORIES ARE : ");
        System.out.println("		1.AUTOMOBILE 2.ELECTRONICS 3. CLOTHING 4.HOUSEHOLD ITEMS");
        System.out.println("ENTER YOUR CHOICE");
        Scanner sc = new Scanner(System.in);
        int choice1 = sc.nextInt();
        if (choice1==1) {
        	System.out.println("WELCOME TO THE WORLD OF AUTOMOBILES");
        	automobile a = new automobile();
        	a.list();
               	}
        else if (choice1==2){
        	System.out.println("WELCOME TO THE WORLD OF ELECTRONICS");
        	electronics e = new electronics();
        	e.list();
        }
        else if (choice1==3){
        	System.out.println("WELCOME TO THE WORLD OF CLOTHING");
        	clothing c = new clothing();
        	c.list();
        }
        else if (choice1==4){
        	System.out.println("WELCOME TO THE WORLD OF HOUSEHOLD ITEMS");
        	household hh = new household();
        	hh.list();
        }
        else {
        	System.out.println("ENTER VALID INPUT");
        }
	}

}
