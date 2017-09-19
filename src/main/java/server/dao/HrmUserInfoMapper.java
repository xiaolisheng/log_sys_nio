package server.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import server.model.HrmUserInfo;
import server.model.HrmUserInfoExample;

public interface HrmUserInfoMapper {
    long countByExample(HrmUserInfoExample example);

    int deleteByExample(HrmUserInfoExample example);

    int insert(HrmUserInfo record);

    int insertSelective(HrmUserInfo record);

    List<HrmUserInfo> selectByExample(HrmUserInfoExample example);

    int updateByExampleSelective(@Param("record") HrmUserInfo record, @Param("example") HrmUserInfoExample example);

    int updateByExample(@Param("record") HrmUserInfo record, @Param("example") HrmUserInfoExample example);
}