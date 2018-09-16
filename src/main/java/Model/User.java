package Model;

public class User {
    private int iDentify;
    private String userName;
    private String firstName;
    private String lastName;
    private String eMail;
    private String passWord;

    public User(int iDentify, String userName, String firstName, String lastName, String eMail, String passWord) {
        this.iDentify = iDentify;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.passWord = passWord;
    }

    public User(){

    }

    public int getiDentify() {
        return iDentify;
    }

    public void setiDentify(int iDentify) {
        this.iDentify = iDentify;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "ID= " + iDentify + "| Username= " + userName + "| Firstname= " + firstName +
                "| Lastname= " + lastName + "| E-mail= " + eMail + "| Password= " + passWord ;
    }


}
