package com.debug.steadyjack.mapper;

import com.debug.steadyjack.entity.OrderRecord;
import com.debug.steadyjack.entity.OrderRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRecordMapper {
    long countByExample(OrderRecordExample example);

    int deleteByExample(OrderRecordExample example);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    List<OrderRecord> selectByExample(OrderRecordExample example);

    int updateByExampleSelective(@Param("record") OrderRecord record, @Param("example") OrderRecordExample example);

    int updateByExample(@Param("record") OrderRecord record, @Param("example") OrderRecordExample example);
}