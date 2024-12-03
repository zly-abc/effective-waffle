package com.shuang.dormitory.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuang.dormitory.entity.DormManager;
import com.shuang.dormitory.mapper.DormManagerMapper;
import com.shuang.dormitory.service.DormManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class DormManagerServiceImpl extends ServiceImpl<DormManagerMapper, DormManager> implements DormManagerService {

    @Resource
    private DormManagerMapper dormManagerMapper;

    /**
     * 宿管登录
     */
    @Override
    public DormManager dormManagerLogin(String username, String password) {
        QueryWrapper<DormManager> qw = new QueryWrapper<>();
        qw.eq("username", username);
        qw.eq("password", password);
        DormManager dormManager = dormManagerMapper.selectOne(qw);
        if (dormManager != null) {
            return dormManager;
        } else {
            return null;
        }
    }

    /**
     * 宿管新增
     */
    @Override
    public int addNewDormManager(DormManager dormManager) {
        return dormManagerMapper.insert(dormManager);
    }

    /**
     * 宿管查找
     */
    @Override
    public Page find(Integer pageNum, Integer pageSize, String search) {
        Page page = new Page<>(pageNum, pageSize);
        QueryWrapper<DormManager> qw = new QueryWrapper<>();
        qw.like("name", search);
        return dormManagerMapper.selectPage(page, qw);
    }

    /**
     * 宿管信息更新
     */
    @Override
    public int updateNewDormManager(DormManager dormManager) {
        return dormManagerMapper.updateById(dormManager);
    }

    /**
     * 宿管删除
     */
    @Override
    public int deleteDormManager(String username) {
        return dormManagerMapper.deleteById(username);
    }

}
