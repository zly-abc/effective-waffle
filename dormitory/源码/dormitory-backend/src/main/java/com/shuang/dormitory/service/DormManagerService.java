package com.shuang.dormitory.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shuang.dormitory.entity.DormManager;

/**
 * 宿舍管理员 业务服务层
 *
 */
public interface DormManagerService extends IService<DormManager> {

    //学生登陆
    DormManager dormManagerLogin(String username, String password);

    //新增学生
    int addNewDormManager(DormManager dormManager);

    //查询学生
    Page find(Integer pageNum, Integer pageSize, String search);

    //更新学生信息
    int updateNewDormManager(DormManager dormManager);

    //删除学生信息
    int deleteDormManager(String username);
}
