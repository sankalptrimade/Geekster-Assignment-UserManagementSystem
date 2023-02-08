package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.model.Management;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class managementService {

    private static List<Management> managements = new ArrayList<>();
    private static int count = 0;
    static {
        managements.add(new Management(++count, "Sankalp", "sankalp001", "Shankar Nagar", 78956478));
        managements.add(new Management(++count, "Sushant", "sushant002", "Mahaveer Nagar", 98756478));
        managements.add(new Management(++count, "Bhagat", "bhagat003", "Santoshi Nagar", 78956758));
        managements.add(new Management(++count, "Ayush", "ayush004", "Shri ram Nagar", 89763478));
        managements.add(new Management(++count, "Aditya", "aditya005", "Housing board society", 98657845));
    }

    public List<Management> findAll(){
        return managements;
    }

    public Management findById(int userId){
        Predicate<? super Management> predicate = management -> management.getUserId() == userId;
        Management management = managements.stream().filter(predicate).findFirst().get();
        return management;
    }

    public void addManagement(Management management){
        managements.add(management);
    }

    public void updateManagement(int userid, Management newManagement){
        //step-1 find todo to be update
        Management management = findById(userid);

        //step-2 update todo
        management.setUserId(newManagement.getUserId());
        management.setName(newManagement.getName());
        management.setUserName(newManagement.getUserName());
        management.setAddress(newManagement.getAddress());
        management.setContact(newManagement.getContact());
    }

    public void deleteManagement(int userid){
        Predicate<? super Management> predicate = management -> management.getUserId() == userid;
        managements.removeIf(predicate);
    }
}
