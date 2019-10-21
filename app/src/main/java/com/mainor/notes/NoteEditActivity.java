package com.mainor.notes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mainor.notes.entities.Note;
//import com.mainor.notes.persistence.NotePersistence;

import org.joda.time.DateTime;

public class NoteEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);

        final Note newNote = new Note();
        newNote.setCreationDate(DateTime.now().getMillis());

        final EditText titleEditText = findViewById(R.id.noteEditActivity_et_title);
        TextView dateTextView = findViewById(R.id.noteEditActivity_et_creationDate);
        final EditText contentEditText = findViewById(R.id.noteEditActivity_et_content);
        ImageButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                newNote.setTitle(titleEditText.getText().toString());
                newNote.setContent(contentEditText.getText().toString());
                /*Runnable target = new Runnable() {
                    @Override
                    public void run() {
                        NotePersistence.getDb(view.getContext()).noteDao().insert(newNote);
                    }
                };
                Thread t = new Thread(target);
                t.start();*/

            }
        });
    }


}
