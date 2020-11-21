package com.example.demo.controller;


import com.example.demo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public JSONObject getUnionid(@RequestParam("code") String code) {

        String appid = "wx702333d2dea9331f";
        String secret = "a6390821fa553ee10fa36ae4f68be7f3";
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        String result = restTemplate.getForObject(url, String.class);
        net.sf.json.JSONObject re = JSONObject.fromObject(result);
        String unionid = (String) re.get("openid");
        return userService.findUserByunionid(unionid);

    }
}
