package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UseServiceImpl  implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public JSONObject findUserByunionid(String unionid) {
        System.out.println(unionid);
        User user = null;
        user = userMapper.findUserByunionid(unionid);
        if (user == null) {
            userMapper.insertUser(unionid);
            user = userMapper.findUserByunionid(unionid);
        }
        JSONObject result = new JSONObject();
        result.put("id", user.getId());
        result.put("openid", user.getOpenid());
        result.put("school", user.getSchool());
        result.put("academy", user.getAcademy());
        result.put("classes", user.getClasses());
        result.put("name", user.getName());
        result.put("studentId", user.getStudentId());
        System.out.println(result);
        return result;
    }
}
