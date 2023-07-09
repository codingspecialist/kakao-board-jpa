package com.example.kakaoboardjpa.reply;

import com.example.kakaoboardjpa.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Board, Integer> {
}
