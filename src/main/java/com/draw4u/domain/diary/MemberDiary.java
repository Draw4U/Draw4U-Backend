package com.draw4u.domain.diary;

import com.draw4u.domain.Member;
import com.draw4u.domain.diary.Diary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
@Getter
@Setter
public class MemberDiary extends Diary {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
