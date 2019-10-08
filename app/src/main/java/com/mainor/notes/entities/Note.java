package com.mainor.notes.entities;

import org.joda.time.DateTime;

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
    DateTime creationDate;

    @Getter
    @Setter
    DateTime updateDate;


}
