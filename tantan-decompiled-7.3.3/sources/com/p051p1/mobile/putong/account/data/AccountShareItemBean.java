package com.p051p1.mobile.putong.account.data;

import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountShareItemBean {
    private x20 action;
    private int icon;
    private String name;

    public AccountShareItemBean(String str, int i, x20 x20Var) {
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

    public void setAction(x20 x20Var) {
        this.action = x20Var;
    }

    public void setIcon(int i) {
        this.icon = i;
    }

    public void setName(String str) {
        this.name = str;
    }
}
