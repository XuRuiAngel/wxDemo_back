package com.example.demo.mapper;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user where openid=#{unionid}")
    User findUserByunionid(@Param("unionid") String unionid);

    @Insert("insert into user(openid,school,academy,classes,name,studentId) values(#{unionid},'未设置','未设置','未设置','未设置','未设置')")
    void insertUser(@Param("unionid") String unionid);
}
