package edu.uwp.appfactory.eventsmanagement.model.CalendarAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jeremiah on 6/11/17.
 */

public class Creator {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("self")
    @Expose
    private Boolean self;
    @SerializedName("displayName")
    @Expose
    private String displayName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSelf() {
        return self;
    }

    public void setSelf(Boolean self) {
        this.self = self;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "email='" + email + '\'' +
                ", self=" + self +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}