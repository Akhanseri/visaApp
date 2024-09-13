package com.example.visaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userinfo")
public class UserInfoController {

    private final UserInfoRepository userInfoRepository;
    @Autowired
    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }


    @PostMapping
    public ResponseEntity<UserInfo> createUserInfo(@RequestBody UserInfo userInfo) {
        UserInfo createdUserInfo = userInfoRepository.save(userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserInfo);
    }

    @GetMapping
    public ResponseEntity<List<UserInfo>> getAllUserInfos() {
        List<UserInfo> userInfos = userInfoRepository.findAll();
        return ResponseEntity.ok(userInfos);
    }

}

