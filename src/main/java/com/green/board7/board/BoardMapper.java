package com.green.board7.board;

import com.green.board7.board.model.BoardDetailVo;
import com.green.board7.board.model.BoardDto;
import com.green.board7.board.model.BoardInsDto;
import com.green.board7.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto); //내가 영향을 끼친 행 수가 리턴이 된다
    int updBoard(BoardDto dto); //void 하면 아무것도 안된다
    int delBoard(BoardDto dto);
    List<BoardVo> selBoardAll(BoardDto dto);
    BoardDetailVo selBoardById(BoardDto dto);

}
