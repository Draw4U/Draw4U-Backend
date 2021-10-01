package com.draw4u.domain;

import com.draw4u.base.GroupRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
public class MemberGroup {

    @Id
    @GeneratedValue
    @Column(name = "member_group_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private GroupRole role;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "group_id")
    private Group group;
}
