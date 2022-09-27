package com.example.testing.entity;

import com.example.testing.dto.requestDto.MemoRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Memo extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @Column
    private String roomName;

    @Column
    private String content;

    @Column
    private String category;


    public Memo(MemoRequestDto dto) {
        this.roomName = dto.getRoomName();
        this.content = dto.getContent();
        this.category = dto.getCategory();
        super.getCreatedAt();
    }

//    For test
    public Memo(Long id, Member member, String roomName, String content, String category) {
        this.id = id;
        this.member = member;
        this.roomName = roomName;
        this.content = content;
        this.category = category;
    }

    public void update(String content){
        this.content= content;
    }

}