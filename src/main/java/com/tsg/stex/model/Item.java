package com.tsg.stex.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsg on 11.04.2016.
 */
public class Item {
    List<String> tags = new ArrayList<String>();
    Owner owner;
    Boolean is_answered;
    long view_count;
    long answer_count;
    long score;
    long last_activity_date; //date
    long creation_date;      //date
    long question_id;
    String link;
    String title;


    public Item() {
    }

    public Item(List<String> tags, Owner owner, Boolean is_answered, long view_count, long answer_count, long score, long last_activity_date, long creation_date, long question_id, String link, String title) {
        this.tags = tags;
        this.owner = owner;
        this.is_answered = is_answered;
        this.view_count = view_count;
        this.answer_count = answer_count;
        this.score = score;
        this.last_activity_date = last_activity_date;
        this.creation_date = creation_date;
        this.question_id = question_id;
        this.link = link;
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIs_answered() {
        return is_answered;
    }

    public void setIs_answered(Boolean is_answered) {
        this.is_answered = is_answered;
    }

    public long getView_count() {
        return view_count;
    }

    public void setView_count(long view_count) {
        this.view_count = view_count;
    }

    public long getAnswer_count() {
        return answer_count;
    }

    public void setAnswer_count(long answer_count) {
        this.answer_count = answer_count;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getLast_activity_date() {
        return last_activity_date;
    }

    public void setLast_activity_date(long last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public long getCreation_date() {
        return creation_date;
    }

    public String getCreation_dateStr(String format) {
        java.util.Date time=new java.util.Date((long)creation_date*1000);
        DateFormat df = new SimpleDateFormat(format);
        return df.format(time);
    }

    public String getCreation_dateStr() {
        return getCreation_dateStr("dd.MM.yyyy HH:mm:ss");
    }

    public void setCreation_date(long creation_date) {
        this.creation_date = creation_date;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
