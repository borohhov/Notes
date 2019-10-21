package com.mainor.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mainor.notes.entities.Note;


public class MainActivity extends AppCompatActivity implements NotesFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainactivity_notes_list, new NotesFragment()).commit();
        findViewById(R.id.mainactivity_btn_new_note).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),NoteEditActivity.class));
            }
        });
    }

    @Override
    public void onListFragmentInteraction(Note item) {

    }
}
