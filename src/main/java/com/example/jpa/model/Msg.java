package com.example.jpa.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author A-team Eva
 * @date 2018-05-16
 */
public class Msg {

    private String title;
    private String content;
    private String extraInfo;

    public Msg() {
    }

    public Msg(String title, String content, String extraInfo) {
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
}
