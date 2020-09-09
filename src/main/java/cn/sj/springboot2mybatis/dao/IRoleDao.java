package cn.sj.springboot2mybatis.dao;


import cn.sj.springboot2mybatis.model.Permission;
import cn.sj.springboot2mybatis.model.Role;
import cn.sj.springboot2mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shuzheng
 */
@Mapper
public interface IRoleDao {
    /**
     * 添加角色
     * @param role
     * @return
     */
    int addRole(Role role);
    
    /**
     * 修改角色
     * @param role
     * @return
     */
    int updateRole(Role role);
    
    /**
     * 删除角色
     * @param role
     * @return
     */
    int deleteRole(Role role);
    
    /**
     * 查询角色
     * @param id
     * @return
     */
    Role selectRole(int id);
    
    /**
     * 角色查找用户
     * @param id
     * @return
     */
    List<User> roleSelectUser(int id);
    
    /**
     * 角色查找拥有的权限
     * @param id
     * @return
     */
    List<Permission> roleSelectPer(int id);
    
    /**
     * 给角色添加权限
     * @param roleid
     * @param permissionid
     * @return
     */
    int roleAddPer(int roleid, int permissionid);
    
    /**
     * 给角色添加用户
     * @param roleid
     * @param userid
     * @return
     */
    int roleAddUser(int roleid, int userid);
    
    
}
