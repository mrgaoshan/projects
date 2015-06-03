package com.cms.model.bean;

public class NavWorkbook {
    private Integer id;

    private String navtype;

    private String navlink;

    private String navattr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNavtype() {
        return navtype;
    }

    public void setNavtype(String navtype) {
        this.navtype = navtype == null ? null : navtype.trim();
    }

    public String getNavlink() {
        return navlink;
    }

    public void setNavlink(String navlink) {
        this.navlink = navlink == null ? null : navlink.trim();
    }

    public String getNavattr() {
        return navattr;
    }

    public void setNavattr(String navattr) {
        this.navattr = navattr == null ? null : navattr.trim();
    }
}