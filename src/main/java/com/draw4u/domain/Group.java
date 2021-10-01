package com.draw4u.domain;

import com.draw4u.domain.diary.GroupDiary;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private Long id;

    private String groupName;

    private String code;

    @OneToMany(mappedBy = "group")
    private List<MemberGroup> memberGroupList = new ArrayList<MemberGroup>();

    @OneToMany(mappedBy = "group")
    private List<GroupDiary> groupDiaryList = new ArrayList<GroupDiary>();
}
