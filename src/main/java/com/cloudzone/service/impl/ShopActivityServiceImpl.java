package com.cloudzone.service.impl;

import com.cloudzone.common.entity.ShopActivity;
import com.cloudzone.common.entity.ShopActivityExample;
import com.cloudzone.mapper.ShopActivityMapper;
import com.cloudzone.service.ShopActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class ShopActivityServiceImpl implements ShopActivityService {
    @Autowired
    private ShopActivityMapper mapper;

    @Override
    public long countByExample(ShopActivityExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShopActivityExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopActivity record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ShopActivity record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<ShopActivity> selectByExample(ShopActivityExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public ShopActivity selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ShopActivity record, ShopActivityExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ShopActivity record, ShopActivityExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopActivity record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopActivity record) {
        return mapper.updateByPrimaryKey(record);
    }
}
