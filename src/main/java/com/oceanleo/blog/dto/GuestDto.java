package com.oceanleo.blog.dto;

import com.oceanleo.blog.domain.Guest;

import java.util.List;

/**
 * @author haiyang.li
 */
public class GuestDto extends Guest {

    //回复的昵称
    private String replyName;

    //回复人是否admin
    private Boolean replyAdmin;

    //留言回复
    private List<GuestDto> children;

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public Boolean getReplyAdmin() {
        return replyAdmin;
    }

    public void setReplyAdmin(Boolean replyAdmin) {
        this.replyAdmin = replyAdmin;
    }

    public List<GuestDto> getChildren() {
        return children;
    }

    public void setChildren(List<GuestDto> children) {
        this.children = children;
    }
}
