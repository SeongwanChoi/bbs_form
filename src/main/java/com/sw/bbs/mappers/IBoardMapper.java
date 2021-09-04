package com.sw.bbs.mappers;

import com.sw.bbs.entity.BoardEntity;
import com.sw.bbs.interfaces.IBoard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBoardMapper {
    BoardEntity selectBoard(IBoard board);
}
