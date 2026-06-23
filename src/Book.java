public class Book {
    private String bookName;
    private String bookCode;
    private String bookGenre;
    private int bookPrice;
    private boolean isIssued;

    public Book(String bookName , String bookCode , String bookGenre , int bookPrice){
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.bookGenre = bookGenre;
        this.bookPrice = bookPrice;
        this.isIssued = false;
    }

    public String getBookName(){
        return bookName;
    }
    public String getBookCode(){
        return bookCode;
    }
    public String getBookGenre(){
        return bookGenre;
    }
    public int getBookPrice(){
        return bookPrice;
    }
    public boolean isIssued() {
        return isIssued;
    }
    public void changeStatus(boolean status){
        this.isIssued = status;
    }
    public void getBookInfo(){
        System.out.println(bookName + "," + bookCode + "," + bookGenre + "," + bookPrice + "," + isIssued);
    }
}
