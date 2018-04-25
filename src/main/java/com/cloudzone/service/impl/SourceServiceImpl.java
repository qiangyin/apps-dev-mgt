package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Source;
import com.cloudzone.common.entity.SourceExample;
import com.cloudzone.mapper.SourceMapper;
import com.cloudzone.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class SourceServiceImpl implements SourceService {
    @Autowired
    private SourceMapper sourceMapper;

    @Override
    public long countByExample(SourceExample example) {
        return sourceMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SourceExample example) {
        return sourceMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Source record) {
        return sourceMapper.insert(record);
    }

    @Override
    public int insertSelective(Source record) {
        return sourceMapper.insertSelective(record);
    }

    @Override
    public List<Source> selectByExample(SourceExample example) {
        return sourceMapper.selectByExample(example);
    }

    @Override
    public Source selectByPrimaryKey(Integer id) {
        return sourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Source record, SourceExample example) {
        return sourceMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Source record, SourceExample example) {
        return sourceMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Source record) {
        return sourceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Source record) {
        return sourceMapper.updateByPrimaryKey(record);
    }
}
