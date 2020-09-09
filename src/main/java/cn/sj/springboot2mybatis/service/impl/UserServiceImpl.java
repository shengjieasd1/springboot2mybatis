package cn.sj.springboot2mybatis.service.impl;

import cn.sj.springboot2mybatis.dao.IUserDao;
import cn.sj.springboot2mybatis.model.User;
import cn.sj.springboot2mybatis.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author shuzheng
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    
    @Resource
    private IUserDao userDao;
    
    @Override
    public String addUser(User user) {
        int a = userDao.addUser(user);
        if(a>0){
            return "添加用户:"+user.getUsername()+"成功";
        }else {
            return "添加用户:"+user.getUsername()+"失败";
        }
    }
    
    @Override
    public String updateUser(User user) {
        int a = userDao.updateUser(user);
        if(a>0){
            return "修改用户:"+user.getUsername()+"成功";
        }else {
            return "修改:"+user.getUsername()+"失败";
        }
    }
    
    @Override
    public String deleteUser(User user) {
        int a = userDao.deleteUser(user);
        if(a>0){
            return "删除用户:"+user.getUsername()+"成功";
        }else {
            return "删除用户:"+user.getUsername()+"失败";
        }
    }
    
    @Override
    public User selectUser(int id) {
        return userDao.selectUser(id);
    }
    
    @Override
    public List<User> selectBlurryUser(String username) {
        return userDao.selectBlurryUser(username);
    }
    
    @Override
    public User userSelectRole(int id) {
        User user = userDao.selectUser(id);
        user.setRoles(userDao.userSelectRole(id));
        return user;
    }
    
    @Override
    public User userSelectPer(int id) {
        User user = userDao.selectUser(id);
        user.setPermissions(userDao.userSelectPer(id));
        return user;
    }
    
    @Override
    public String userAddUserRole(int userid,int roleid) {
        int a = userDao.userAddUserRole(userid,roleid);
        if(a>0){
            return "用户添加角色成功";
        }else {
            return "用户添加角色成功";
        }
    }
}
