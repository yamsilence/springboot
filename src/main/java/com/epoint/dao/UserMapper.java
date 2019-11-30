package com.epoint.dao;

import com.epoint.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> getUser();
    @Select("select * from user where id = #{id}")
    public User getUserByid(Integer id);
}
