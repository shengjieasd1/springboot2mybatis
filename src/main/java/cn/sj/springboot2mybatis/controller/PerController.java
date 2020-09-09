package cn.sj.springboot2mybatis.controller;

import cn.sj.springboot2mybatis.model.Permission;
import cn.sj.springboot2mybatis.service.IPermissionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 权限查询
 * @author shuzheng
 */
@RestController
public class PerController {
    @Resource
    private IPermissionService permissionService;
    
    /**
     * 增加权限
     * @param permission
     * @return
     */
    @RequestMapping(value = "/addPer",method = RequestMethod.POST)
    public String addPer(Permission permission){
        return permissionService.addPer(permission);
    }
    
    /**
     * 修改权限
     * @param permission
     * @return
     */
    @RequestMapping(value = "/updatePer",method = RequestMethod.POST)
    public String updatePer(Permission permission){
        return permissionService.updatePer(permission);
    }
    
    /**
     * 删除权限
     * @param permission
     * @return
     */
    @RequestMapping(value = "/deletePer",method = RequestMethod.POST)
    public String deletePer(Permission permission){
        return permissionService.deletePer(permission);
    }
    
}
