package com.mainor.notes.entities;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Note {

    @Getter
    @Setter
    String title;


    @Getter
    @Setter
    String content;

    @Getter
    @Setter
    LocalDateTime creationDate;

    @Getter
    @Setter
    LocalDateTime updateDate;


}
