package com.example.testing.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class Member {
    @Id
    private Long id;

    @ManyToOne
    private Memo memo;

    public Member(Long id, Memo memo) {
        this.id = id;
        this.memo = memo;
    }
}
