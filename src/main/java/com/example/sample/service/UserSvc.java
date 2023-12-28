package com.example.sample.service;

import com.example.sample.model.UserData;
import com.example.sample.model.UserDataDto;

import java.util.List;

public interface UserSvc {
    public void saveUser(UserDataDto userDataDto);
    public List<UserData> getData();
}
