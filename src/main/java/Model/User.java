package Model;

public class User {
    private String iDentify;
    private String userName;
    private String firstName;
    private String lastName;
    private String eMail;
    private String passWord;

    public User(String iDentify, String userName, String firstName, String lastName, String eMail, String passWord) {
        this.iDentify = iDentify;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.passWord = passWord;
    }

    public User(){

    }

    public String getiDentify() {
        return iDentify;
    }

    public void setiDentify(String iDentify) {
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
