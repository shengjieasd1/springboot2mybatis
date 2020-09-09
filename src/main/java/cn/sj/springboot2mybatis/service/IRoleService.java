package cn.sj.springboot2mybatis.service;


import cn.sj.springboot2mybatis.model.Role;

import java.util.List;

/**
 * @author shuzheng
 */
public interface IRoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    String addRole(Role role);
    
    /**
     * 修改角色
     * @param role
     * @return
     */
    String updateRole(Role role);
    
    /**
     * 删除角色
     * @param role
     * @return
     */
    String deleteRole(Role role);
    
    /**
     * 角色查找用户
     * @param id
     * @return
     */
    Role roleSelectUser(int id);
    
    /**
     * 角色查找拥有的权限
     * @param id
     * @return
     */
    Role roleSelectPer(int id);
    
    /**
     * 给角色添加权限
     * @param roleid
     * @param permissionid
     * @return
     */
    String roleAddPer(int roleid,int permissionid);
    
    /**
     * 给角色添加用户
     * @param roleid
     * @param userid
     * @return
     */
    String roleAddUser(int roleid,int userid);
}
