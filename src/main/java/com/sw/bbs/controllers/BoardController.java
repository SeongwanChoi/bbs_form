package com.sw.bbs.controllers;

import com.sw.bbs.services.BoardService;
import com.sw.bbs.vos.ListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping(value = {"/list/{boardCode}","/list/{boardCode}/{boardPage}"},
                    method = RequestMethod.GET,
                    produces = MediaType.TEXT_HTML_VALUE)
    public String listGet(@PathVariable(name = "boardCode") String boardCode,
                          @PathVariable(name = "boardPage") Optional<Integer> boardPage,
                          ListVo listVo) {
        listVo.setCode(boardCode);
        listVo.setPage(boardPage.orElse(1));
        this.boardService.list(listVo);
        return "board/list";
    }
}
