package com.mainor.notes.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.mainor.notes.entities.Note;

@Database(entities = {Note.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
