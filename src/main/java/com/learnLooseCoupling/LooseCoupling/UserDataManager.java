package com.learnLooseCoupling.LooseCoupling;

public class UserDataManager {

    UserDatabseProviderInterface userData;
    public  UserDataManager(UserDatabseProviderInterface userDataProvider){
        this.userData = userDataProvider;
    }

    public String getUserIntoFromManger(){
        return this.userData.getUserInfoFromDb();
    }
}
