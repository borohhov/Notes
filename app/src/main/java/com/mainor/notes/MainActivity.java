package com.mainor.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mainor.notes.dummy.NotesContent;
import com.mainor.notes.entities.Note;


public class MainActivity extends AppCompatActivity implements NotesFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainactivity_notes_list, new NotesFragment()).commit();

    }

    @Override
    public void onListFragmentInteraction(Note item) {

    }
}
