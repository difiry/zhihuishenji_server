package com.sj.base;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * Created by chenguang on 2019/11/8.
 */
public interface BaseMapper<T> extends Mapper<T>, IdsMapper<T>, MySqlMapper<T> {

    /**
     * 查询
     *
     * @param bean
     * @param <Bean>
     * @return
     */
    <Bean extends BaseSearchBean> List<T> selectBySearchBean(@Param("bean") Bean bean);
}
