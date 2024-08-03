package com.learnLooseCoupling.LooseCoupling;

public class UserDatabaseProviderMongodb implements UserDatabseProviderInterface{

    @Override
    public String getUserInfoFromDb() {
        return "these are the user details from mongodb";
    }
}
