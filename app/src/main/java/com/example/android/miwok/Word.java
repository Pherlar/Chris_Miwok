package com.example.android.miwok;

public class Word {
    //Default translation for the word /
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    //Create new word object
    public Word (String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
