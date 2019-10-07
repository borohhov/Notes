package com.mainor.notes;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mainor.notes.entities.Note;

import org.joda.time.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NoteEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);

        final Note newNote = new Note();
        newNote.setCreationDate(DateTime.now());

        final EditText titleEditText = findViewById(R.id.noteEditActivity_et_title);
        TextView dateTextView = findViewById(R.id.noteEditActivity_et_creationDate);
        final EditText contentEditText = findViewById(R.id.noteEditActivity_et_content);
        ImageButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newNote.setTitle(titleEditText.getText().toString());
                newNote.setContent(contentEditText.getText().toString());
            }
        });
    }


}
