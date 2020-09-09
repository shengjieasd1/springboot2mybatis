package cn.sj.springboot2mybatis.service;

import cn.sj.springboot2mybatis.model.User;

import java.util.List;

/**
 * @author shuzheng
 */
public interface IUserService {
    
    /**
     * 用户添加
     * @param user
     * @return
     */
    public String addUser(User user);
    
    /**
     * 用户修改
     * @param user
     * @return
     */
    public String updateUser(User user);
    
    /**
     * 用户删除
     * @param user
     * @return
     */
    public String deleteUser(User user);
    
    /**
     * 用户查询
     * @param id
     * @return
     */
    public User selectUser(int id);
    
    /**
     * 用户模糊查询
     * @param username
     * @return
     */
    public List<User> selectBlurryUser(String username);
    
    /**
     * 查询用户有多少个角色
     * @param id
     * @return
     */
    public User userSelectRole(int id);
    
    /**
     * 查询用户有多少权限
     * @param id
     * @return
     */
    public User userSelectPer(int id);
    
    /**
     * 给用户添加角色
     * @param userid
     * @param roleid
     * @return
     */
    public String userAddUserRole(int userid,int roleid);
}
