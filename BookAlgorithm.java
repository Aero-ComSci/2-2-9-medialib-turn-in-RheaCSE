/*
 * Activity 2.2.7
 */
System.out.println("You have a NEW Library");
MediaLib myLib2 = new MediaLib();

Book newBook = new Book("To Kill a Mockingbird", "Lee");
myLib2.addBook(newBook);
System.out.println(myLib2);
newBook = new Book("1984", "Orwell");
System.out.println(myLib2);
