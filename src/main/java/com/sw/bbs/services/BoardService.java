package com.sw.bbs.services;

import com.sw.bbs.entity.BoardEntity;
import com.sw.bbs.mappers.IBoardMapper;
import com.sw.bbs.vos.ListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final IBoardMapper boardMapper;

    @Autowired
    public BoardService(IBoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public void list(ListVo listVo) {
        BoardEntity boardEntity = this.boardMapper.selectBoard(listVo);
        listVo.setCode(boardEntity.getCode());
        listVo.setName(boardEntity.getName());

    }
}
