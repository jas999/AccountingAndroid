package com.logo.bo;

import com.google.gson.annotations.Expose;

import org.json.JSONArray;

public class User {

    public final String AUTHTYPE = "authType";
    public final String EMAIL = "email";
    public final String NAME = "name";
    public final String PASSWORD = "password";
    public final String USERID = "userId";
    public final String USERNAME = "username";
    public final String FACEBOOKID = "facebookID";
    public final String FACEBOOKAUTHTOKEN = "facebookAuthToken";
    public final String GOOGLEAUTHTOKEN = "googleAuthToken";
    public final String TOKEN = "token";
    public final String PHOTO = "photo";
    public final String FIRSTNAME = "firstName";
    public final String LASTNAME = "lastName";
    public final String DEVICE_TOKEN = "deviceToken";
    public final String DEVICE_TYPE = "deviceType";
    public final String PHONE = "phone";
    public final String CITY = "city";
    public final String MYACCOUNTS = "myAccounts";

    @Expose
    private String name;
    @Expose
    private  String email;
    @Expose
    private String password;
    @Expose
    private String apiUrl;
    @Expose
    public String authToken;
    @Expose
    private int userId;
    @Expose
    private String username;
    @Expose
    private String facebookID;
    @Expose
    private String picture;
    @Expose
    private String city;
    @Expose
    private String phone;
    private Object myAccounts;
    @Expose
    private String authType;
    @Expose
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String firstName;
    public  String lastName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getFacebookAuthToken() {
        return facebookAuthToken;
    }

    public void setFacebookAuthToken(String facebookAuthToken) {
        this.facebookAuthToken = facebookAuthToken;
    }

    private String facebookAuthToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getMyAccounts() {
        return myAccounts;
    }

    public void setMyAccounts(Object myAccounts) {
        this.myAccounts = myAccounts;
    }
}
