package com.gdfp.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.gdfp.notekeeper.ORIGIANL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.gdfp.notekeeper.ORIGIANL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.gdfp.notekeeper.ORIGIANL_NOTE_TEXT";

    public String mOriginals;
    public String mOriginalTitle;
    public String mOriginalText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginals);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalText);
    }

    public void restoreState(Bundle inState) {
        mOriginals = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalText = inState.getString(ORIGINAL_NOTE_TITLE);
    }
}
