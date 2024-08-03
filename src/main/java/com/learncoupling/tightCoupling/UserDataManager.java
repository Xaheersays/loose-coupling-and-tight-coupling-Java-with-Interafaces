package com.learncoupling.tightCoupling;

public class UserDataManager {

    //here I had to create userData object manually and in future if lets say I want to fetch
    // data from MongoDB then even after changin or creating new class for UserDatabase I had to look into
    //UserDataManger class and create another instance
    //this is tight coupling too
    //also not obeying solid principles

    UserDatabase userdata = new UserDatabase();

    public  String getUserInfoFromManager(){
        return userdata.getUserInfoFromDb();
    }
}
