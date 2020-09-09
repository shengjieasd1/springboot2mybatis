package cn.sj.springboot2mybatis.service;

import cn.sj.springboot2mybatis.model.Permission;

/**
 * @author shuzheng
 */
public interface IPermissionService {
    /**
     * 添加权限
     * @param permission
     * @return
     */
    String addPer(Permission permission);
    
    /**
     * 修改权限
     * @param permission
     * @return
     */
    String updatePer(Permission permission);
    
    /**
     * 删除权限
     * @param permission
     * @return
     */
    String deletePer(Permission permission);
}
