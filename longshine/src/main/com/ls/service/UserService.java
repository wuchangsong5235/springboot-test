package main.com.ls.service;

import main.com.ls.vo.UserVo;

import java.util.List;

public interface UserService {
    void insertUser(UserVo userVo);
    List<UserVo> selectAllUsers();
}
