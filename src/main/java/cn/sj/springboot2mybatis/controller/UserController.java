package cn.sj.springboot2mybatis.controller;


import cn.sj.springboot2mybatis.model.User;
import cn.sj.springboot2mybatis.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**用户操作
 * @author shuzheng
 */
@RestController
public class UserController {
    @Resource
    private IUserService userService;
    
    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public String addUser(User user){
        return userService.addUser(user);
    }
    
    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateUser(User user){
        return userService.updateUser(user);
    }
    
    /**
     * 删除用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public String deleteUser(User user){
        return userService.deleteUser(user);
    }
    
    /**
     * 查询用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/selectUser",method = RequestMethod.POST)
    public User selectUser(int id){
        return userService.selectUser(id);
    }
    
    /**
     * 模糊查询用户
     * @param username
     * @return
     */
    @RequestMapping(value = "/selectBlurryUser",method = RequestMethod.GET)
    public List<User> selectBlurryUser(String username){
        return userService.selectBlurryUser(username);
    }
    
    /**
     * 用户id查询拥有的角色
     * @param id
     * @return
     */
    @RequestMapping(value = "/userSelectRole",method = RequestMethod.GET)
    public User userSelectRole(int id){
        return userService.userSelectRole(id);
        
    }
    
    /**
     * 用户id查询拥有的权限
     * @param id
     * @return
     */
    @RequestMapping(value = "/userSelectPer",method = RequestMethod.GET)
    public User userSelectPer(int id){
        return userService.userSelectPer(id);
    }
    
    /**
     * 给用户添加角色
     * @param userid
     * @param roleid
     * @return
     */
    @RequestMapping(value = "/userAddUserRole",method = RequestMethod.GET)
    public String userAddUserRole(int userid,int roleid){
        return userService.userAddUserRole(userid,roleid);
    }
}
