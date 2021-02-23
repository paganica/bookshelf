package com.pagan.testing;


public class main {

    public static void main(String[] args) {
	
	TestBook book;
	TestBook bookFromClassBook;
	
	
	book = new TestBook();
	
	
	System.out.println(book.authorString + book.nameString);
	
	bookFromClassBook = new TestBook("Peter Zechenter", "Nieco v tme", "Thriller");
	
	System.out.println(bookFromClassBook.authorString);
	
    }
}
