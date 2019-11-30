package com.epoint.dao;

import com.epoint.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //查询所有的用户
    public List<User> getUser();

}
