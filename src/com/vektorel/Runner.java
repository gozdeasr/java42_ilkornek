package com.vektorel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	
		
		File fl = new File("d:\\fileIO.txt");
		
		
		try {
			Scanner sc= new Scanner(fl);
			while(sc.hasNext()) {
				String s= sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
