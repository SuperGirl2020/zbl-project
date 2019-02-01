package com.zbl.dao;

import com.zbl.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2019/2/1 0001.
 */
public interface UserDao {
    public void save(User user);

    public List<User> queryAll();
}
