package com.azhar.bengali;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> word) {
        super(context, 0, word);
    }
//    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
//        super(context, 0, words);
//        mColorResourceId = colorResourceId;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView bengaliTextView =  listItemView.findViewById(R.id.bengaliTv);

        bengaliTextView.setText(currentWord.getmBanglaTranslation());

        TextView defaultTextView =  listItemView.findViewById(R.id.defaultTv);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

//        // Check if an image is provided for this word or not
//        if (currentWord.hasImage()) {
//            // If an image is available, display the provided image based on the resource ID
//            imageView.setImageResource(currentWord.getImageResourceId());
//            // Make sure the view is visible
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            imageView.setVisibility(View.GONE);
//        }
//
//        // Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.text_container);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
