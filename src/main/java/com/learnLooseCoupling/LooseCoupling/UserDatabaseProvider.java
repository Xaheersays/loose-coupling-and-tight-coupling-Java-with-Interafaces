package com.learnLooseCoupling.LooseCoupling;

public class UserDatabaseProvider implements UserDatabseProviderInterface {
    @Override
    public String getUserInfoFromDb(){
        return "these are the user details from db";
    }
}
