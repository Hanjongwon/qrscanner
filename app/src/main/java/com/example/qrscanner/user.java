package com.example.qrscanner;

public class user {
    public String userName;
    public String userNumber;
    public String userAddress;

    public user() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public user(String userName, String userNumber, String userAddress) {
        this.userName = userName;
        this.userNumber = userNumber;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "user{" +
                "이름 ='" + userName + '\'' +
                ", 주소 ='" + userAddress + '\'' +
                ", 핸드폰번호 ='" + userNumber + '\'' +
                '}';
    }
}
