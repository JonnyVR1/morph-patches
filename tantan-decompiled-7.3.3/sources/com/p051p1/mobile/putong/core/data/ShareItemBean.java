package com.p051p1.mobile.putong.core.data;

import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class ShareItemBean {
    private x20 action;
    private int icon;
    private String name;
    private String tag;

    public ShareItemBean(String str, int i, x20 x20Var) {
        this.name = str;
        this.icon = i;
        this.action = x20Var;
    }

    public x20 getAction() {
        return this.action;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getTag() {
        return this.tag;
    }

    public void setAction(x20 x20Var) {
        this.action = x20Var;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
