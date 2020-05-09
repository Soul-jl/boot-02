package com.jy.mapper.user;

import com.jy.model.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into t_USERS (t_account) values (#{userAccount})")
    void insert(User user);

}
