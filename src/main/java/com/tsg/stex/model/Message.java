package com.tsg.stex.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsg on 11.04.2016.
 */
public class Message {
    private Integer backoff;
    private Integer error;
    private String error_message;
    private String error_name;
    private boolean has_more;
    private List<Item> items = new ArrayList<Item>();;
    private Integer quota_max;
    private Integer quota_remaining;

    public Message() {
    }

    public Message(Integer backoff, Integer error, String error_message, String error_name, boolean has_more, List<Item> items, Integer quota_max, Integer quota_remaining) {
        this.backoff = backoff;
        this.error = error;
        this.error_message = error_message;
        this.error_name = error_name;
        this.has_more = has_more;
        this.items = items;
        this.quota_max = quota_max;
        this.quota_remaining = quota_remaining;
    }

    public Integer getBackoff() {
        return backoff;
    }

    public void setBackoff(Integer backoff) {
        this.backoff = backoff;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getError_name() {
        return error_name;
    }

    public void setError_name(String error_name) {
        this.error_name = error_name;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getQuota_max() {
        return quota_max;
    }

    public void setQuota_max(Integer quota_max) {
        this.quota_max = quota_max;
    }

    public Integer getQuota_remaining() {
        return quota_remaining;
    }

    public void setQuota_remaining(Integer quota_remaining) {
        this.quota_remaining = quota_remaining;
    }
}
