package cn.sj.springboot2mybatis.service.impl;

import cn.sj.springboot2mybatis.dao.IRoleDao;
import cn.sj.springboot2mybatis.model.Role;
import cn.sj.springboot2mybatis.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shuzheng
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private IRoleDao roleDao;
    @Override
    public String addRole(Role role) {
        int a=  roleDao.addRole(role);
        if(a>0){
            return "添加角色:"+role.getRolename()+"成功";
        }else {
            return "添加角色:"+role.getRolename()+"失败";
        }
    }
    
    @Override
    public String updateRole(Role role) {
        int a=  roleDao.updateRole(role);
        if(a>0){
            return "修改角色:"+role.getRolename()+"成功";
        }else {
            return "修改角色:"+role.getRolename()+"失败";
        }
    }
    
    @Override
    public String deleteRole(Role role) {
        int a=  roleDao.deleteRole(role);
        if(a>0){
            return "删除角色:"+role.getRolename()+"成功";
        }else {
            return "删除角色:"+role.getRolename()+"失败";
        }
    }
    
    @Override
    public Role roleSelectUser(int id) {
        Role role = roleDao.selectRole(id);
        role.setUsers(roleDao.roleSelectUser(id));
        return role;
    }
    
    @Override
    public Role roleSelectPer(int id) {
        Role role = roleDao.selectRole(id);
        role.setPermissions(roleDao.roleSelectPer(id));
        return role;
    }
    
    @Override
    public String roleAddPer(int userid, int permissionid) {
        int a = roleDao.roleAddPer(userid,permissionid);
        if(a>0){
            return "角色添加权限成功";
        }else {
            return "角色添加权限成功";
        }
    }
    
    @Override
    public String roleAddUser(int roleid,int userid) {
        int a = roleDao.roleAddUser(roleid,userid);
        if(a>0){
            return "角色添加用户成功";
        }else {
            return "角色添加用户成功";
        }
    }
}
