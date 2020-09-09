package cn.sj.springboot2mybatis.service.impl;

import cn.sj.springboot2mybatis.dao.IPermissionDao;
import cn.sj.springboot2mybatis.model.Permission;
import cn.sj.springboot2mybatis.service.IPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shuzheng
 */
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Resource
    private IPermissionDao permissionDao;
    @Override
    public String addPer(Permission permission) {
        return permissionDao.addPer(permission);
    }
    
    @Override
    public String updatePer(Permission permission) {
        return permissionDao.updatePer(permission);
    }
    
    @Override
    public String deletePer(Permission permission) {
        return permissionDao.deletePer(permission);
    }
}
