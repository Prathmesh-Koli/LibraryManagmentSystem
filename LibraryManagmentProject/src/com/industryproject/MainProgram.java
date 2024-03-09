package com.industryproject;

public class MainProgram {

	public static void main(String[] args) {
       Book book = new Book("Think and Grow Rich", 1,"Nepolean Hill" );
       DVD dvd = new DVD("RRR",2,4);
       
       StudentMember student = new StudentMember(11, "Jay");
       FacultyMember faculty = new FacultyMember(101, "Veeru");

       book.displayInfo();
       dvd.displayInfo();

       student.borrowItem(book);
       faculty.borrowItem(dvd);
       faculty.reserveItem(book);
       
	}
}
