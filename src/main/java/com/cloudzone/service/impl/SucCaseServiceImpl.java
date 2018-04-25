package com.cloudzone.service.impl;

import com.cloudzone.common.entity.SucCase;
import com.cloudzone.common.entity.SucCaseExample;
import com.cloudzone.mapper.SucCaseMapper;
import com.cloudzone.service.SucCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class SucCaseServiceImpl implements SucCaseService {
    @Autowired
    private SucCaseMapper mapper;

    @Override
    public long countByExample(SucCaseExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SucCaseExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SucCase record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SucCase record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<SucCase> selectByExample(SucCaseExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public SucCase selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SucCase record, SucCaseExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SucCase record, SucCaseExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SucCase record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SucCase record) {
        return mapper.updateByPrimaryKey(record);
    }
}
