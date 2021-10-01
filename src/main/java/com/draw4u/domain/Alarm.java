package com.draw4u.domain;

import com.draw4u.base.AlarmType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Alarm {

    @Id
    @GeneratedValue
    @Column(name = "alarm_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(EnumType.STRING)
    private AlarmType alarmType;
}
