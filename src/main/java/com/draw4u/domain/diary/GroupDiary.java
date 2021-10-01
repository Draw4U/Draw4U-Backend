package com.draw4u.domain.diary;

import com.draw4u.domain.Group;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("G")
@Getter
@Setter
public class GroupDiary extends Diary{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;
}
