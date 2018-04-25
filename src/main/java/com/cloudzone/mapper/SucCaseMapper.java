package com.cloudzone.mapper;

import com.cloudzone.common.entity.SucCase;
import com.cloudzone.common.entity.SucCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SucCaseMapper {
    long countByExample(SucCaseExample example);

    int deleteByExample(SucCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SucCase record);

    int insertSelective(SucCase record);

    List<SucCase> selectByExample(SucCaseExample example);

    SucCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SucCase record, @Param("example") SucCaseExample example);

    int updateByExample(@Param("record") SucCase record, @Param("example") SucCaseExample example);

    int updateByPrimaryKeySelective(SucCase record);

    int updateByPrimaryKey(SucCase record);
}