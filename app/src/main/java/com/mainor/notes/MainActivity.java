package com.mainor.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mainor.notes.dummy.DummyContent;


public class MainActivity extends AppCompatActivity implements NotesFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.mainactivity_notes_list, new NotesFragment()).commit();
        //Intent intentToNoteEdit = new Intent(this, NoteEditActivity.class);
        //startActivity(intentToNoteEdit);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
