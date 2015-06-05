package com.cms.model.bean;

import com.cms.base.bean.BaseAppTO;

import java.util.Date;

public class NewsCate extends BaseAppTO {
    private Integer id;

    private String catename;

    private Integer navid;

    private String catelink;

    private Integer ordernum;

    private Date createtime;

    private Date modifytime;

    private String editor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename == null ? null : catename.trim();
    }

    public Integer getNavid() {
        return navid;
    }

    public void setNavid(Integer navid) {
        this.navid = navid;
    }

    public String getCatelink() {
        return catelink;
    }

    public void setCatelink(String catelink) {
        this.catelink = catelink == null ? null : catelink.trim();
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
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
}