package com.shuang.dormitory.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuang.dormitory.service.VisitorService;
import com.shuang.dormitory.entity.Visitor;
import com.shuang.dormitory.mapper.VisitorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class VisitorServiceImpl extends ServiceImpl<VisitorMapper, Visitor> implements VisitorService {

    @Resource
    private VisitorMapper visitorMapper;

    /**
     * 访客添加
     */
    @Override
    public int addNewVisitor(Visitor visitor) {
        return visitorMapper.insert(visitor);
    }

    /**
     * 访客查询
     */
    @Override
    public Page find(Integer pageNum, Integer pageSize, String search) {
        Page page = new Page<>(pageNum, pageSize);
        QueryWrapper<Visitor> qw = new QueryWrapper<>();
        qw.like("name", search);
        return visitorMapper.selectPage(page, qw);
    }

    /**
     * 访客信息更新
     */
    @Override
    public int updateNewVisitor(Visitor visitor) {
        return visitorMapper.updateById(visitor);
    }

    /**
     * 访客删除
     */
    @Override
    public int deleteVisitor(Integer id) {
        return visitorMapper.deleteById(id);
    }

}
