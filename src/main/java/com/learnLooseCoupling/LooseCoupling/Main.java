package com.learnLooseCoupling.LooseCoupling;

public class Main {
    public static void main(String[] args) {
        UserDatabseProviderInterface userData = new UserDatabaseProvider();
        UserDataManager userDataManager1 = new UserDataManager(userData);
        System.out.println(userDataManager1.getUserIntoFromManger());

        //we have just took the Interfaces help to get type for our UserDatabaseProvider
        //lets say we now want to shift to mongodb what i will do is
        //just create the new mongodb class and which will implement the interface UserDatabaseProviderInterface

        UserDatabseProviderInterface userDataMongo = new UserDatabaseProviderMongodb();
        UserDataManager userDataManager2 = new UserDataManager(userDataMongo);
        System.out.println(userDataManager2.getUserIntoFromManger());


    }
}
