/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.miwok;

/**
 * Created by Tina Taylor on 4/29/18.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Used to determine if the word has an image associated with it
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Image for the Miwok word     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Sound file for the Miwok word
     */
    private int mSoundResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param soundResourceId is the sound file for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     *
     * @param defaultTranslation is the language of the user
     * @param miwokTranslation is the Miwok word
     * @param imageResourceId is the image for the word
     * @param soundResourceId is the sound file for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     *  Get the image for the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /** Determines whether word has an image, resource Ids would be   */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the resource ID for the sound file.
     */
    public int getSoundResourceId() {
        return mSoundResourceId;}
}