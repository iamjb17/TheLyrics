package com.example.jessie.thelyrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    // Create instance variables
    private TextView mArtistTextView;
    private TextView mLyricTextView;
    private Button mNextLyricButton;
    private LyricBook mLyricBook = new LyricBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate variables
        mArtistTextView = (TextView) findViewById(R.id.artistTextView);
        mLyricTextView = (TextView) findViewById(R.id.lyricTextView);
        mNextLyricButton = (Button) findViewById(R.id.nextLyricButton);


        // Create listener for my button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the random entry from the array
                String line = mLyricBook.getSong();

                // Parse the entry by artist and lyric
                String part = line.substring(line.indexOf("["),line.indexOf("]"));
                String mArtist = line.substring(line.indexOf("[")+1, line.indexOf("]"));
                String mLyric = line.substring(part.length()+2,line.length()-1);

                // Set the views to the new text
                mArtistTextView.setText(mArtist);
                mLyricTextView.setText(mLyric);
            }
        };
        // Connect the listener to the button
        mNextLyricButton.setOnClickListener(listener);
    }

    /* Will try something different, like creating(hard coding) an array and using
    indexOf to pull out and display different segments of the elements of that array at some
    point when I have time.
    Same data though.
     */

/*
    //// tried to use scanner class but I dont think it works in android
    // method-Read the file and fill the hashmap
    private void createHashMap() throws FileNotFoundException {
        File file = new File("lyrics.txt");
        Scanner input;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()){
               String line = input.nextLine();
                mArtist = line.substring(line.indexOf("[")+1, line.indexOf("]"));

                Log.d("funfact", mArtist);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        }

    }
*/

}
