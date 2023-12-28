package com.example.sample.controller;

import com.example.sample.model.UserData;
import com.example.sample.model.UserDataDto;
import com.example.sample.repository.UserDataRepo;
import com.example.sample.service.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private final UserDataRepo userDataRepo;
    @Autowired
    private final UserSvc userSvc;

    public DataController(UserDataRepo userDataRepo, UserSvc userSvc) {
        this.userDataRepo = userDataRepo;
        this.userSvc = userSvc;
    }

    @GetMapping("/home")
    public String home(){
        return "welcome";
    }

//    @PostMapping("/saveData")
//    public String getUserData(@RequestBody UserData data){
//        System.out.println(data);
//        userDataRepo.save(data);
//        return "sucessful";
//    }

    @PostMapping("/saveInfo")
    public String createUser(@RequestBody UserDataDto userDataDto) {
        System.out.println(userDataDto);
        userSvc.saveUser(userDataDto);
        return "success";
    }
    @GetMapping("/getInfo")
    public List<UserData> showData(){
        return userSvc.getData();
    }

}
