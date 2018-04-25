package com.cloudzone.mapper;

import com.cloudzone.common.entity.ComLottery;
import com.cloudzone.common.entity.ComLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComLotteryMapper {
    long countByExample(ComLotteryExample example);

    int deleteByExample(ComLotteryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComLottery record);

    int insertSelective(ComLottery record);

    List<ComLottery> selectByExample(ComLotteryExample example);

    ComLottery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComLottery record, @Param("example") ComLotteryExample example);

    int updateByExample(@Param("record") ComLottery record, @Param("example") ComLotteryExample example);

    int updateByPrimaryKeySelective(ComLottery record);

    int updateByPrimaryKey(ComLottery record);
}