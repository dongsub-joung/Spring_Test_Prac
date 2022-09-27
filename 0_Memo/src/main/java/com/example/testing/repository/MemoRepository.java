package com.example.testing.repository;

import com.example.testing.entity.Member;
import com.example.testing.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByMember(Member member);
}
