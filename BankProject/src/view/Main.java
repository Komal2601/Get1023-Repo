package view;

import java.util.Date;
import java.util.Scanner;

import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
//import au.com.bytecode.opencsv.CSVWriter;


public class Main {
	public static void main(String args[]) {
		System.out.println("select any option:\n 1)Display all the complaints based on the year provided by the user\n 2)Display all the complaints based on the name of the bank provided by the user\n 3)Display complaints based on the complaint id provided by the user\n 4)Display all the complaints closed/closed with explanation\n 5)Display all the complaints which received a timely response \n 6)Take input from user for storing new complaints");
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		
		int op = sc.nextInt();
		if (op == 1) {
			int year = sc.nextInt();
			String y = Integer.toString(year);
			String line = "";
			String splitBy = ",";
			try {
				
				BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
				while ((line = br.readLine()) != null)
	
				{
					String[] users = line.split(splitBy);
	
					if (users[0].contains(y)) {
						//System.out.println("Data");
						System.out.println(users[0]+" "+users[1]+" "+users[2]+" "+users[3]+" "+users[4]+" "+users[5]+" "+users[6]+" "+users[7]+" "+users[8]+" "+users[9]+" "+users[10]+" "+users[11]+" "+users[12]+" "+users[13]);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (op == 2) {
			String bankName = sc.next();
			// String y = Integer.toString(year);
			String line = "";
			String splitBy = ",";
			try {
				
				BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
				while ((line = br.readLine()) != null)
		
				{
					String[] users = line.split(splitBy);
		
					if (users[5].equals(bankName)) {
						System.out.println(users[0]+" "+users[1]+" "+users[2]+" "+users[3]+" "+users[4]+" "+users[5]+" "+users[6]+" "+users[7]+" "+users[8]+" "+users[9]+" "+users[10]+" "+users[11]+" "+users[12]+" "+users[13]);
						
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (op == 3) {
			String complaintId = sc.next();
			// String y = Integer.toString(year);
			String line = "";
			String splitBy = ",";
			try {
				
				BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
				while ((line = br.readLine()) != null)
			
				{
					String[] users = line.split(splitBy);
			
					if (users[13].equals(complaintId)) {
						System.out.println(users[0]+" "+users[1]+" "+users[2]+" "+users[3]+" "+users[4]+" "+users[5]+" "+users[6]+" "+users[7]+" "+users[8]+" "+users[9]+" "+users[10]+" "+users[11]+" "+users[12]+users[13]);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (op == 12) {
			
			//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			String line = "";
			String splitBy = ",";
			long difference_In_Days  = 0;
			try {
	
				BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
				while ((line = br.readLine()) != null)
				
				{
					String[] users = line.split(splitBy);
				
					
//					try{
//
//						Date d1 = sdf.parse(users[0]);
//						Date d2 = sdf.parse(users[9]);
//
//						long difference_In_Time = d2.getTime() - d1.getTime();
//
//						 difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
//
//						}
//
//					// Catch the Exception
//						catch(ParseException e){e.printStackTrace();
//					}
//					
						System.out.println("Data");
						System.out.println(users[9]);
					}
				}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
else if (op == 5) {
			
	
	String line = "";
	String splitBy = ",";
	try {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
		while ((line = br.readLine()) != null)
		// returns a Boolean value
		{
			String[] users = line.split(splitBy);
			if (users[10].equals("Closed") || (users[10].equals("Closed with explanation"))) {
				System.out.println(users[0]+" "+users[1]+" "+users[2]+" "+users[3]+" "+users[4]+" "+users[5]+" "+users[6]+" "+users[7]+" "+users[8]+" "+users[9]+" "+users[10]+" "+users[11]+" "+users[12]+" "+users[13]);
				//System.out.println(users[5]);
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
		}
else if (op == 6) {
			
	
	String line = "";
	String splitBy = ",";
	try {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Training\\JavaLecture\\complaints.csv"));
		while ((line = br.readLine()) != null)
		{
			String[] users = line.split(splitBy);

			if (users[11].equals("Yes")) {
				System.out.println(users[0]+" "+users[1]+" "+users[2]+" "+users[3]+" "+users[4]+" "+users[5]+" "+users[6]+" "+users[7]+" "+users[8]+" "+users[9]+" "+users[10]+" "+users[11]+" "+users[12]+" "+users[13]);
				//System.out.println(users[5]);
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
		}
else if(op==7)
{
	Date startDate = null;
	Date receivedDate = null;
	try {
		 startDate = sdf.parse(sc.next());
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String product = sc.next();
	String subProduct = sc.next();
	String issue = sc.next();
	String subIssue = sc.next();
	String company = sc.next();
	String state = sc.next();
	String zipCode = sc.next();
	String submitted = sc.next();

	try {
		 receivedDate = sdf.parse(sc.next());
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String response = sc.next();
	String timely_response = sc.next();
	String consumer_disputed = sc.next();
	String complaintId = sc.next();
	//User user = new User(startdate,product,subProduct,issue,subIssue,company,state,zipCode,submitted)
	//String csv = "data.csv";
    CSVWriter writer=null;
	try {
		writer = new CSVWriter(new FileWriter("C:\\Training\\JavaLecture\\complaints.csv", true));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    String [] record = {dateFormat.format(startDate),product,subProduct,issue,subIssue,company,state,zipCode,submitted,dateFormat.format(receivedDate),timely_response,consumer_disputed,complaintId};

    writer.writeNext(record);
    System.out.println("Data is successfully added to your file");

    try {
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	}

	}

	
