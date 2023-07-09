package com.example.kakaoboardjpa.user;

import com.example.kakaoboardjpa.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Board, Integer> {
}
