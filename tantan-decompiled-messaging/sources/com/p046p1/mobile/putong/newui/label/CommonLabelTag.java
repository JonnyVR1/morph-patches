package com.p046p1.mobile.putong.newui.label;

import p149l.ltl;

/* JADX INFO: loaded from: classes11.dex */
public enum CommonLabelTag implements ltl {
    SEX_AGE_FEMALE("女性-年龄", 0),
    SEX_AGE_MALE("男性-年龄", 1);

    private int index;
    private String tag;

    CommonLabelTag(String str, int i) {
        this.tag = str;
        this.index = i;
    }

    public String getLabelTag() {
        return this.tag;
    }

    @Override // p149l.ltl
    public int labelIndex() {
        return this.index;
    }
}
