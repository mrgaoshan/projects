package com.cms.model.bean;

import com.cms.base.bean.BaseAppTO;

import java.util.Date;

public class NewsDetail extends BaseAppTO {
    private Integer id;

    private Integer cateid;

    private Integer navid;

    private String title;

    private String memo;

    private String leadimage;

    private Date createtime;

    private Date modifytime;

    private String editor;

    private Byte releaseflag;

    private Integer readtimes;

    private Integer ordernum;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public Integer getNavid() {
        return navid;
    }

    public void setNavid(Integer navid) {
        this.navid = navid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getLeadimage() {
        return leadimage;
    }

    public void setLeadimage(String leadimage) {
        this.leadimage = leadimage == null ? null : leadimage.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Byte getReleaseflag() {
        return releaseflag;
    }

    public void setReleaseflag(Byte releaseflag) {
        this.releaseflag = releaseflag;
    }

    public Integer getReadtimes() {
        return readtimes;
    }

    public void setReadtimes(Integer readtimes) {
        this.readtimes = readtimes;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}