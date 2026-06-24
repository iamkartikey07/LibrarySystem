public class Member{
    private String memberName;
    private int memberAge;
    private String address;
    private String AADHAR;
    private int count = 0;
    private int regId;

    public Member(String memberName , int memberAge , String address ,String AADHAR , int regId){
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.address = address;
        this.AADHAR = AADHAR;
        this.regId = regId;
    }

    public void getInfo(){
        System.out.println(memberName + "," + memberAge + "," + address + "," + AADHAR + "," + regId + "," + count);
    }
    public int getBorrowCount(){
        return count;
    }
    public void borrowAgain(){
        count++;
    }
    public String getMemberName(){
        return memberName;
    }
    public int getMemberAge(){
        return memberAge;
    }
    public String getAddress(){
        return address;
    }
    public String getAADHAR(){
        return AADHAR;
    }
    public int getRegId(){
        return regId;
    }
}
