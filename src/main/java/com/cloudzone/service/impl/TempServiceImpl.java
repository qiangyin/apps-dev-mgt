package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Temp;
import com.cloudzone.common.entity.TempExample;
import com.cloudzone.mapper.TempMapper;
import com.cloudzone.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class TempServiceImpl implements TempService {
    @Autowired
    private TempMapper mapper;

    @Override
    public long countByExample(TempExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TempExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Temp record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Temp record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Temp> selectByExample(TempExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Temp selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Temp record, TempExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Temp record, TempExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Temp record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Temp record) {
        return mapper.updateByPrimaryKey(record);
    }
}
