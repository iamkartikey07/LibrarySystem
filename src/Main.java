public class Main {
    public static void main(String[] args) {
        Book b = new Book("Atomic Habits" , "AH101" , "Self Help" , 549);
        Member m = new Member("Krish",19,"ABCD",25004392,119);
        BorrowRecord br = new BorrowRecord(m , b , "17July" , "30July");
        br.isBookAvailable();
        b.changeStatus(true);
        br.markOverdue();
        br.returnBook();
        System.out.println(m.getMemberName() + " borrowed " + b.getBookName());
        System.out.println("Is overdue: " + br.isOverdue());
        System.out.println("Is returned: " + br.isReturned());
        System.out.println("Is book still issued: " + b.isIssued());
    }
}