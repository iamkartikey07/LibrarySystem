public class BorrowRecord {
    private Member member;
    private Book book;
    private String borrowDate;
    private String returnDate;
    private boolean isOverdue;
    private boolean isReturned;

    public BorrowRecord(Member member , Book book , String borrowDate , String returnDate){
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.isOverdue = false;
        this.isReturned = false;
    }

    public void returnBook(){
        book.changeStatus(false);
        this.isReturned = true;
    }
    public void markOverdue(){
        this.isOverdue = true;
    }
    public void isBookAvailable(){
        if(book.isIssued() != true){
            System.out.println("Yes , the book is available");
        }
        else{
            System.out.println("Sorry , the book is not currently available");
        }
    }


    public String getBorrowDate() {
        return borrowDate;
    }
    public Book getBook() {
        return book;
    }
    public Member getMember() {
        return member;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public boolean isOverdue() {
        return isOverdue;
    }
    public boolean isReturned() {
        return isReturned;
    }
}
