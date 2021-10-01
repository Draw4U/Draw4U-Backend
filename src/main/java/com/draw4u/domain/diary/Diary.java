package com.draw4u.domain.diary;

import com.draw4u.base.WeatherType;
import com.draw4u.domain.DiaryCategory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Diary {

    @Id
    @GeneratedValue
    @Column(name = "diary_id")
    private String id;

    private String title;

    private String keyword;

    private String thumbnail;

    @Enumerated(EnumType.STRING)
    private WeatherType weather;

    @Enumerated(EnumType.STRING)
    private String emotion;

    @OneToMany(mappedBy = "diary")
    private List<DiaryCategory> diaryCategoryList = new ArrayList<DiaryCategory>();
}
