package com.cloudzone.service;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
public interface BaseService<T, E> {
    long countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(Integer id);

    int insert(E record);

    int insertSelective(E record);

    List<E> selectByExample(T example);

    E selectByPrimaryKey(Integer id);

    int updateByExampleSelective(E record, T example);

    int updateByExample(E record, T example);

    int updateByPrimaryKeySelective(E record);

    int updateByPrimaryKey(E record);
}
