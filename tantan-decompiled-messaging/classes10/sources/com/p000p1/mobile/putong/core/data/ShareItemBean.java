package com.p000p1.mobile.putong.core.data;

import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ShareItemBean {
    private d30 action;
    private int icon;
    private String name;
    private String tag;

    public ShareItemBean(String str, int i, d30 d30Var) {
        this.name = str;
        this.icon = i;
        this.action = d30Var;
    }

    public d30 getAction() {
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

    public void setAction(d30 d30Var) {
        this.action = d30Var;
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
