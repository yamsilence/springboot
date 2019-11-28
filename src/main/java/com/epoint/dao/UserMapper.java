package com.epoint.dao;

import com.epoint.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User sel(int id);
}
