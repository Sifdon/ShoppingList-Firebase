package com.eliamyro.shoppinglist.model;

import com.eliamyro.shoppinglist.utils.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;

import java.util.HashMap;

/**
 * Created by Elias Myronidis on 21/5/16.
 */
public class ShoppingList {
    String listName;
    String owner;
    HashMap<String, Object> timestampLastChanged;

    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;

        //Date last changed will always be set to ServerValue.TIMESTAMP
        HashMap<String, Object> timestampLastChangedObj = new HashMap<>();
        timestampLastChangedObj.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        timestampLastChanged = timestampLastChangedObj;
    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }

    public HashMap<String, Object> getTimestampLastChanged() {
        return timestampLastChanged;
    }


    // Use the method described in http://stackoverflow.com/questions/25500138/android-chat-crashes-on-datasnapshot-getvalue-for-timestamp/25512747#25512747
    // to get the long values from the date object.
    @JsonIgnore
    public long getTimestampLastChangedLong() {

        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }
}
