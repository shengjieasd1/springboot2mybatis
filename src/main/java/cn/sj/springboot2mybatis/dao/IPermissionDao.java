package cn.sj.springboot2mybatis.dao;

import cn.sj.springboot2mybatis.model.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shuzheng
 */
@Mapper
public interface IPermissionDao {
    
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
