public class Contact {

    /*
    -	First name
-	Last name
o	Alphabetic characters, space, -, ‘,
-	Nickname
-	Phone number(s)
o	00 for international if length is more than 10
-	Email
o	string@string.string
-	Birthday
o	Date in the past
-	Address (Put it all in one line separated by commas)
-	Company
o	Alphabetic characters, space, -, ‘, numbers, .
-	ICE Contact
o	00 for international if length is more than 10
-	Boolean isFavourite
-	How you feel about them on scale of 1 to 100
     */
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String homeNumber;
    private String email;
    private Date birthday;

    public Contact(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
