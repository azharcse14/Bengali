package com.azhar.bengali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

//        Word word = new Word("One","Ek");
//        words.add(word);

        words.add(new Word("One","এক", R.drawable.number_one));
        words.add(new Word("Two", "দুই", R.drawable.number_two));
        words.add(new Word("Three","তিন", R.drawable.number_three));
        words.add(new Word("Four", "চার", R.drawable.number_four));
        words.add(new Word("Five", "পাঁচ", R.drawable.number_five));
        words.add(new Word("Six","ছয়", R.drawable.number_six));
        words.add(new Word("Seven","সাত", R.drawable.number_seven));
        words.add(new Word("Eight", "আট", R.drawable.number_eight));
        words.add(new Word("Nine","নয়", R.drawable.number_nine));
        words.add(new Word("Ten","দশ", R.drawable.number_ten));

//        ArrayList<String> words = new ArrayList<String>();
//        words.add("one");
//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");

        WordAdapter adapter = new WordAdapter(this, words);
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView =  findViewById(R.id.list);


        listView.setAdapter(adapter);

//        listView.setAdapter(itemsAdapter);


//         LinearLayout rootView = findViewById(R.id.rootView);

//        for (int index= 0; index<words.size(); index ++){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }

//        int index = 0;
//        while (index<words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//            index ++;
//        }

//        TextView wordView1 = new TextView(this);
//        wordView1.setText(words.get(0));
//        rootView.addView(wordView1);
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(1));
//        rootView.addView(wordView2);
//
//        TextView wordView3 = new TextView(this);
//        wordView3.setText(words.get(2));
//        rootView.addView(wordView3);
    }
}