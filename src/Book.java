/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nabin
 */
public class Book {
    static int totalBooks;
    String title ;
    String author ;
    String isbn;
  static {
      totalBooks=0;
  
  }
  Book(String title, String author ,String isbn){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
  
  
  
  }
    
     public borrowBook(){
    System.out.println("This book is bororwed");
    }
    
    public static void main(String[] args) {
        
    }
    
    
    
}
