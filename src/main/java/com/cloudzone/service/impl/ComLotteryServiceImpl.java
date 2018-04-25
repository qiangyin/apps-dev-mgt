package com.cloudzone.service.impl;

import com.cloudzone.common.entity.ComLottery;
import com.cloudzone.common.entity.ComLotteryExample;
import com.cloudzone.mapper.ComLotteryMapper;
import com.cloudzone.service.ComLotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@Service
public class ComLotteryServiceImpl implements ComLotteryService {
    @Autowired
    private ComLotteryMapper mapper;

    @Override
    public long countByExample(ComLotteryExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ComLotteryExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ComLottery record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(ComLottery record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<ComLottery> selectByExample(ComLotteryExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public ComLottery selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ComLottery record, ComLotteryExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ComLottery record, ComLotteryExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ComLottery record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ComLottery record) {
        return mapper.updateByPrimaryKey(record);
    }
}
