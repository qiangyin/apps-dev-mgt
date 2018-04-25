package com.cloudzone.service.impl;

import com.cloudzone.common.entity.Share;
import com.cloudzone.common.entity.ShareExample;
import com.cloudzone.mapper.ShareMapper;
import com.cloudzone.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class ShareServiceImpl implements ShareService {
    @Autowired
    private ShareMapper mapper;

    @Override
    public long countByExample(ShareExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShareExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Share record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Share record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Share> selectByExample(ShareExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Share selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Share record, ShareExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Share record, ShareExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Share record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Share record) {
        return mapper.updateByPrimaryKey(record);
    }
}
