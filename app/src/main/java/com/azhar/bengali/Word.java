package com.azhar.bengali;

public class Word {
//    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultTranslation;
    private String mBanglaTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String banglaTranslation){
        mDefaultTranslation = defaultTranslation;
        mBanglaTranslation = banglaTranslation;
    }

    public Word(String defaultTranslation, String banglaTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mBanglaTranslation = banglaTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmBanglaTranslation(){
        return mBanglaTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

//    public boolean hasImage() {
//        return mImageResourceId != NO_IMAGE_PROVIDED;
//    }
}
