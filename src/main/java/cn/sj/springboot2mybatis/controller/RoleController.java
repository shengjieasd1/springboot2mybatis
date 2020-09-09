package cn.sj.springboot2mybatis.controller;

import cn.sj.springboot2mybatis.model.*;
import cn.sj.springboot2mybatis.service.IRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shuzheng
 */
@RestController
public class RoleController {
    @Resource
    private IRoleService roleService;
    
    /**
     * 角色添加
     * @param role
     * @return
     */
    @RequestMapping(value = "/addRole",method = RequestMethod.POST)
    public String addRole(Role role){
        return roleService.addRole(role);
    }
    
    /**
     * 修改角色
     * @param role
     * @return
     */
    @RequestMapping(value = "/updateRole",method = RequestMethod.POST)
    public String updateRole(Role role){
        return roleService.updateRole(role);
    }
    
    /**
     * 删除角色
     * @param role
     * @return
     */
    @RequestMapping(value = "/deleteRole",method = RequestMethod.POST)
    public String deleteRole(Role role){
        return roleService.updateRole(role);
    }
    
    /**
     * 角色id查询使用的用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/roleSelectUser",method = RequestMethod.GET)
    public Role roleSelectUser(int id){
        return roleService.roleSelectUser(id);
    }
    
    /**
     *  角色查找拥有的权限
     * @param id
     * @return
     */
    @RequestMapping(value = "/roleSelectPer",method = RequestMethod.GET)
    public Role roleSelectPer(int id){
        return roleService.roleSelectPer(id);
    }
    
    /**
     *给角色添加权限
     * @param roleid
     * @param permissionid
     * @return
     */
    @RequestMapping(value = "/roleAddPer",method = RequestMethod.GET)
    public String roleAddPer(int roleid,int permissionid){
        return roleService.roleAddPer(roleid,permissionid);
    }
    
    /**
     * 给角色添加用户
     * @param roleid
     * @param userid
     * @return
     */
    @RequestMapping(value = "/roleAddUser",method = RequestMethod.GET)
    public String roleAddUser(int roleid,int userid){
        return roleService.roleAddUser(roleid,userid);
    }
    
    
}
