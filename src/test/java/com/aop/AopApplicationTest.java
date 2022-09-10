package com.aop;

import com.aop.board.BoardService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AopApplicationTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void findBoards() throws Exception {
        for(int i = 1; i <= 100; i++)
            boardService.setBoard(i);
        assertEquals(boardService.getBoards().size(), 100);
    }
}