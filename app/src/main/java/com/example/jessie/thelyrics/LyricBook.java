package com.example.jessie.thelyrics;

import java.util.Random;

/**
 * Created by Jessie on 7/2/2017.
 */

public class LyricBook {

    // Create artist and lyric array
    String[] mSongs = {
            "[Maroon 5][My broken pieces, you pick'em up. Don't leave me hangin, hangin come give me some.]",
            "[Bruno Mars][You deserve it baby, you deserve it allll...]",
            "[Post Malone][If you fuck with winning put your lighters to the sky.]",
            "[The Chainsmokers][Im not looking for somebody with some superhuman gifts...]",
            "[Jason Derulo][Shimmie shimmie ya shimmie ya shimmia ahh, drank, swal-la la laa..]",
            "[Gorillaz][I was gone with the self of the day, gone...]",
            "[Lecrae][They say don't get bitter, get better...]",
            "[Major Lazer][wild ones, like we fresh out the cage...]",
            "[Jhené Aiko][I should stop drinking, I should stop smoking, I need to focus.]",
            "[Chamillionaire][Her drank starts empying while she spilling out her life to me...]"
    };

    // Method - pull a random song from the array and send it out
    public String getSong(){
        Random mRgen = new Random();
        int randomNumber = mRgen.nextInt(mSongs.length);
        String line = mSongs[randomNumber];

        return line;
    }
}
