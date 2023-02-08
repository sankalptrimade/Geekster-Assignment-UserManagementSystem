package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.Management;
import com.example.usermanagementsystem.service.managementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/management-system")
public class managementController {
    @Autowired
    private managementService managmentService;
    @GetMapping("getAllUser")
    public List<Management> findAll(){
        return managmentService.findAll();
    }
    @GetMapping("getUser/{userId}")
    public Management findById(@PathVariable int userId){
        return managmentService.findById(userId);
    }

    @PostMapping("addUser")
    public void addManagement(@RequestBody Management management){
        managmentService.addManagement(management);
    }
    @PutMapping("updateUserInfo/{userid}")
    public void updateManagement(@PathVariable int userid, @RequestBody Management management){
        managmentService.updateManagement(userid, management);
    }
    @DeleteMapping("deleteUser/{userid}")
    public void deleteManagement(@PathVariable int userid){
        managmentService.deleteManagement(userid);
    }
}
