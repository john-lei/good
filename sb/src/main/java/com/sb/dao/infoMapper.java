package com.sb.dao;

import com.sb.bean.info;
import com.sb.bean.infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface infoMapper {
    long countByExample(infoExample example);

    int deleteByExample(infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(info record);

    int insertSelective(info record);

    List<info> selectByExample(infoExample example);

    info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") info record, @Param("example") infoExample example);

    int updateByExample(@Param("record") info record, @Param("example") infoExample example);

    int updateByPrimaryKeySelective(info record);

    int updateByPrimaryKey(info record);

    info selectByUsernameAndPassword(info myinfo);
}