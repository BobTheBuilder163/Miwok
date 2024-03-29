package com.example.miwokcopy;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words.
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?","minto wuksus"));
        words.add(new Word("What is you name?","tinna oyaaset;na"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michaksas?"));
        words.add(new Word("I'm feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","aanas'aa"));
        words.add(new Word("Yes, I'm coming.","haa'aanam"));
        words.add(new Word("I'm coming","aanam"));
        words.add(new Word("Let's go","yoowutis"));
        words.add(new Word("Come here","anni'nem"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter =
                new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
