package com.draw4u.domain;

import com.draw4u.domain.diary.MemberDiary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member{

    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String userId;

    private String password;

    private String email;

    @OneToMany(mappedBy = "member")
    private List<MemberGroup> memberGroupList = new ArrayList<MemberGroup>();

    @OneToMany(mappedBy = "member")
    private List<MemberDiary> memberDiaryList = new ArrayList<MemberDiary>();
}
