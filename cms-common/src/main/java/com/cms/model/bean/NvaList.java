package com.cms.model.bean;

import java.util.Date;

public class NvaList {
    private Integer id;

    private Integer navid;

    private String navname;

    private String navlink;

    private Integer level;

    private Integer parentnavid;

    private Integer ordernum;

    private Byte showflag;

    private Date createtime;

    private Byte showmain;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNavid() {
        return navid;
    }

    public void setNavid(Integer navid) {
        this.navid = navid;
    }

    public String getNavname() {
        return navname;
    }

    public void setNavname(String navname) {
        this.navname = navname == null ? null : navname.trim();
    }

    public String getNavlink() {
        return navlink;
    }

    public void setNavlink(String navlink) {
        this.navlink = navlink == null ? null : navlink.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getParentnavid() {
        return parentnavid;
    }

    public void setParentnavid(Integer parentnavid) {
        this.parentnavid = parentnavid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Byte getShowflag() {
        return showflag;
    }

    public void setShowflag(Byte showflag) {
        this.showflag = showflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getShowmain() {
        return showmain;
    }

    public void setShowmain(Byte showmain) {
        this.showmain = showmain;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}