package cn.sj.springboot2mybatis.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author shuzheng
 */
public class Role {
    private int id;
    private String rolename;
    private String roleide;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Permission> permissions;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<User> users;
    
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roleide='" + roleide + '\'' +
                ", permissions=" + permissions +
                ", users=" + users +
                '}';
    }
    
    public List<Permission> getPermissions() {
        return permissions;
    }
    
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getRolename() {
        return rolename;
    }
    
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
    public String getRoleide() {
        return roleide;
    }
    
    public void setRoleide(String roleide) {
        this.roleide = roleide;
    }
}
