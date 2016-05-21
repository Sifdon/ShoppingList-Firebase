package com.eliamyro.shoppinglist.utils;

/**
 * Created by Elias Myronidis on 21/5/16.
 */

import com.eliamyro.shoppinglist.BuildConfig;

/**
 * Constants class store most important strings and paths of the app
 */
public final class Constants {

    /**
     * Constants related to locations in Firebase, such as the name of the node
     * where active lists are stored (ie "activeLists")
     */


    /**
     * Constants for Firebase object properties
     */
    public static final String FIREBASE_PROPERTY_LISTNAME = "listName";
    public static final String FIREBASE_PROPERTY_TIMESTAMP = "timestamp";

    /**
     * Constants for Firebase URL
     */
    public static final String FIREBASE_URL = BuildConfig.UNIQUE_FIREBASE_ROOT_URL;

    /**
     * Constants for bundles, extras and shared preferences keys
     */
    public static final String KEY_LAYOUT_RESOURCE = "LAYOUT_RESOURCE";
}
