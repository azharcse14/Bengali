package com.azhar.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PharsesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharses);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "আপনি কোথায় যাচ্ছেন?"));
        words.add(new Word("What is your name?", "আপনার নাম কি?"));
        words.add(new Word("My name is...", "আমার নাম..."));
        words.add(new Word("How are you feeling?", "কেমন লাগছে?"));
        words.add(new Word("I’m feeling good.", "আমার ভালো লাগছে"));
        words.add(new Word("Are you coming?", "তুমি কি আসছ?"));
        words.add(new Word("Yes, I’m coming.", "হ্যাঁ, আমি আসছি ।"));
        words.add(new Word("I’m coming.", "আমি আসছি।"));
        words.add(new Word("Let’s go.", "চলো যাই."));
        words.add(new Word("Come here.", "এখানে এসো"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}