package com.industryproject;

public class StudentMember extends LibraryMember{

	StudentMember(int memberID, String name) {
		super(memberID, name);
	}
	 @Override
	    public void borrowItem(LibraryItem item) {
	        System.out.println("Student " + getName() + " (ID: " + getMemberID() + ") borrowed the item: " + item.getTitle());
	    }

}
