package com.industryproject;

public class FacultyMember extends LibraryMember implements Reservable{

	FacultyMember(int memberID, String name) {
		super(memberID, name);
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void borrowItem(LibraryItem item) {
	        System.out.println("Faculty " + getName() + " (ID: " + getMemberID() + ") borrowed the item: " + item.getTitle());
	    }

	    @Override
	    public void reserveItem(LibraryItem item) {
	        System.out.println("Faculty " + getName() + " (ID: " + getMemberID() + ") reserved the item: " + item.getTitle());
	    }

}
