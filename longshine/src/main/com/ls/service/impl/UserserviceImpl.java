package main.com.ls.service.impl;

import main.com.ls.service.UserService;
import main.com.ls.vo.UserVo;

import java.util.ArrayList;
import java.util.List;

public class UserserviceImpl implements UserService {
    public void insertUser(UserVo userVo) {
        System.out.println("添加成功！");
    }

    public List<UserVo> selectAllUsers() {
        UserVo userVo=new UserVo("zhangsan", 22);
        UserVo userVo1=new UserVo("zhangsan1", 23);
        UserVo userVo2=new UserVo("zhangsan2", 24);
        List<UserVo> lists = new ArrayList<UserVo>();
        lists.add(userVo);
        lists.add(userVo1);
        lists.add(userVo2);
        return lists;
    }
}
