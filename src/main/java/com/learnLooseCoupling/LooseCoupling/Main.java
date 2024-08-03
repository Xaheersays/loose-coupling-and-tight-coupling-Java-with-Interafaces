package com.learnLooseCoupling.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextUser.xml");

        UserDataManager userData = (UserDataManager)  context.getBean("userDataManager");
        System.out.println(userData.getUserIntoFromManger());



//        UserDatabseProviderInterface userData = new UserDatabaseProvider();
//        UserDataManager userDataManager1 = new UserDataManager(userData);
//        System.out.println(userDataManager1.getUserIntoFromManger());
//
//        //we have just took the Interfaces help to get type for our UserDatabaseProvider
//        //lets say we now want to shift to mongodb what i will do is
//        //just create the new mongodb class and which will implement the interface UserDatabaseProviderInterface
//
//        UserDatabseProviderInterface userDataMongo = new UserDatabaseProviderMongodb();
//        UserDataManager userDataManager2 = new UserDataManager(userDataMongo);
//        System.out.println(userDataManager2.getUserIntoFromManger());


    }
}
