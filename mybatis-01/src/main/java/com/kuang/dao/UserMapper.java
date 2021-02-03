package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserLike(String value);
    User getUserById(int id);
    User getUserById2(Map<String, Object> map);
    int addUser(User user);
    int addUser2(Map<String, Object> map);
    int updateUser(User user);
    int deleteUser(int id);
}
