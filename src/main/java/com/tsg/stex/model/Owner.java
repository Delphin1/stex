package com.tsg.stex.model;

/**
 * Created by tsg on 11.04.2016.
 */
public class Owner {
    long reputation;
    long user_id;
    String user_type;
    long accept_rate;
    String profile_image;
    String display_name;
    String link;

    public Owner() {
    }

    public Owner(long reputation, long user_id, String user_type, long accept_rate, String profile_image, String display_name, String link) {
        this.reputation = reputation;
        this.user_id = user_id;
        this.user_type = user_type;
        this.accept_rate = accept_rate;
        this.profile_image = profile_image;
        this.display_name = display_name;
        this.link = link;
    }

    public long getReputation() {
        return reputation;
    }

    public void setReputation(long reputation) {
        this.reputation = reputation;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public long getAccept_rate() {
        return accept_rate;
    }

    public void setAccept_rate(long accept_rate) {
        this.accept_rate = accept_rate;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
