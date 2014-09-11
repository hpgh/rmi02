package com.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.rmi.service.PersonService;
import com.rmi.service.impl.PersonServiceImpl;

public class PersonServer {

    public static void main(String[] args) {
        try {
            PersonService personService = new PersonServiceImpl();
            // 注册通讯端口
            LocateRegistry.createRegistry(6606);
            // 注册通讯路径
            Naming.rebind("rmi://127.0.0.1:6606/PersonService", personService);
            System.out.println("Person Service Start!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}