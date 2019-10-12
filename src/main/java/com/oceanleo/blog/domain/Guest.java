package com.oceanleo.blog.domain;

import java.util.Date;

public class Guest {

    public static final String ROOT_SERIAL = "0";

    //主键
    private Integer id;

    //姓名(昵称)
    private String name;

    //邮箱
    private String mail;

    //地址
    private String address;

    //内容
    private String content;

    //上级id
    private String parentId;

    //创建时间
    private Date createDate;

    //序号
    private Integer serial;

    //回复id
    private String replyId;

    //是否博主回复
    private Boolean admin;

    //是否删除
    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", parentId='" + parentId + '\'' +
                ", createDate=" + createDate +
                ", serial=" + serial +
                ", replyId='" + replyId + '\'' +
                ", admin=" + admin +
                ", deleted=" + deleted +
                '}';
    }
}