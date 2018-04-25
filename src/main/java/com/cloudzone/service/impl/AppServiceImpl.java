package com.cloudzone.service.impl;

import com.cloudzone.common.entity.App;
import com.cloudzone.common.entity.AppExample;
import com.cloudzone.mapper.AppMapper;
import com.cloudzone.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppMapper mapper;

    @Override
    public long countByExample(AppExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AppExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(App record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(App record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<App> selectByExample(AppExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public App selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(App record, AppExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(App record, AppExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(App record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(App record) {
        return mapper.updateByPrimaryKey(record);
    }
}
