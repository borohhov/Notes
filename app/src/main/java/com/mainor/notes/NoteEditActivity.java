package com.mainor.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.mainor.notes.entities.Note;

public class NoteEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);

        Note newNote = new Note();

        EditText titleEditText = findViewById(R.id.noteEditActivity_et_title);
        TextView dateTextView = findViewById(R.id.noteEditActivity_et_creationDate);
        EditText contentEditText = findViewById(R.id.noteEditActivity_et_content);
    }
}
