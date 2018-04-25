package com.cloudzone.mapper;

import com.cloudzone.common.entity.ShopActivity;
import com.cloudzone.common.entity.ShopActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopActivityMapper {
    long countByExample(ShopActivityExample example);

    int deleteByExample(ShopActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopActivity record);

    int insertSelective(ShopActivity record);

    List<ShopActivity> selectByExample(ShopActivityExample example);

    ShopActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopActivity record, @Param("example") ShopActivityExample example);

    int updateByExample(@Param("record") ShopActivity record, @Param("example") ShopActivityExample example);

    int updateByPrimaryKeySelective(ShopActivity record);

    int updateByPrimaryKey(ShopActivity record);
}