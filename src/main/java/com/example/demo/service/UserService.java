package com.example.demo.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public JSONObject findUserByunionid(String unionid);
}
