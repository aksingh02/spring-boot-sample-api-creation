package com.example.sample.serviceImpl;

import com.example.sample.model.UserData;
import com.example.sample.model.UserDataDto;
import com.example.sample.repository.UserDataRepo;
import com.example.sample.service.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSvcImpl implements UserSvc {
    private final UserDataRepo userDataRepo;
    @Autowired
    public UserSvcImpl(UserDataRepo userDataRepo) {
        this.userDataRepo = userDataRepo;
    }

    public void saveUser(UserDataDto userDataDto) {
        UserData user = new UserData();
        user.setName(userDataDto.getName());
        user.setEmail(userDataDto.getEmail());
        user.setPassword(userDataDto.getPassword());

        userDataRepo.save(user);
    }
    @Override
    public List<UserData> getData() {
        return userDataRepo.findAll();
    }
}
