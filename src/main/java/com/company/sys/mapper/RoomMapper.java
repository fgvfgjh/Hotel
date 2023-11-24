package com.company.sys.mapper;

import com.company.sys.pojo.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 房间管理
 */
@Mapper
public interface RoomMapper {
    /**
     * 查询全部房间数据
     *
     * @return 包含全部房间数据的列表
     */
    @Select("select * from Room")
    List<Room> list();
}
