package com.industryproject;

public class Book extends LibraryItem{
	private String author;
	
	Book(String title,int itemID,String author){
		super(title,itemID);
		this.author=author;
	}
	
	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Author"+" : " + author);		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void reserveItem(LibraryItem item){
		System.out.println("Book Reserve" + item.getTitle());		
	}


}
