package com.mainor.notes.entities;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.RoomDatabase;

import org.joda.time.DateTime;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Note {

    @PrimaryKey
    public int id;

    @Getter
    @Setter
    String title;


    @Getter
    @Setter
    String content;

    @Getter
    @Setter
    long creationDate;

    @Getter
    @Setter
    long updateDate;



}
