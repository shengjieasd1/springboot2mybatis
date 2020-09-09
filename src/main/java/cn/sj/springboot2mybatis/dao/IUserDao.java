package cn.sj.springboot2mybatis.dao;

import cn.sj.springboot2mybatis.model.Permission;
import cn.sj.springboot2mybatis.model.Role;
import cn.sj.springboot2mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shuzheng
 */
@Mapper
public interface IUserDao {
    
    /**
     * 用户添加
     * @param user
     * @return
     */
    public int addUser(User user);
    
    /**
     * 用户修改
     * @param user
     * @return
     */
    public int updateUser(User user);
    
    /**
     * 用户删除
     * @param user
     * @return
     */
    public int deleteUser(User user);
    
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
    public List<Role> userSelectRole(int id);
    
    /**
     * 查询用户有多少权限
     * @param id
     * @return
     */
    public List<Permission> userSelectPer(int id);
    
    /**
     * 给用户添加角色
     * @param userid
     * @param roleid
     * @return
     */
    public int userAddUserRole(int userid,int roleid);


}
