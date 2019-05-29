package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTheSystemDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);//Mon Apr 08 21:39:40 CDT 2019
		
		//create our own format dd_MM_yyyy_HH_mm_ss
		DateFormat df = new  SimpleDateFormat("dd_MMM_yyyy_HH_mm_ss aa");//08_Apr_2019_21_44_19 PM
		System.out.println(df.format(d));
		
		
	}

}
