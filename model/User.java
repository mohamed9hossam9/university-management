package org.example.model;

public abstract class  User {

protected String name;
protected int idNumber;
protected int phoneNumber;


protected String emailAddress;
protected String password;
public User ()
{

}
 protected User (String name, int idNumber, int phoneNumber, String emailAddress, String password) {
        this.name = name;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.password = password;
        }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public int getIdNumber() {
              return idNumber;
       }

       public void setIdNumber(int idNumber) {
              this.idNumber = idNumber;
       }

       public int getPhoneNumber() {
              return phoneNumber;
       }

       public void setPhoneNumber(int phoneNumber) {
              this.phoneNumber = phoneNumber;
       }

       public String getEmailAddress() {
              return emailAddress;
       }

       public void setEmailAddress(String emailAddress) {
              this.emailAddress = emailAddress;
       }

       public String getPassword() {
              return password;
       }

       public void setPassword(String password) {
              this.password = password;
       }

       @Override
       public String toString() {
              return "User{" +
                      "name='" + name + '\'' +
                      ", idNumber=" + idNumber +
                      ", phoneNumber=" + phoneNumber +
                      ", emailAddress='" + emailAddress + '\'' +
                      ", password='" + password + '\'' +
                      '}';
       }
}
