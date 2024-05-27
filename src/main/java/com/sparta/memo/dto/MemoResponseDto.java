package com.sparta.memo.dto;

import com.sparta.memo.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.username = memo.getUsername();
        this.contents = memo.getContents();
    }
}

// Memo entity와 매우 유사함에도 Dto로 따로 분리하는 이유는 DB와 소통하는 클래스는 다룰때 매우 조심스럽기 때문

// JPA
