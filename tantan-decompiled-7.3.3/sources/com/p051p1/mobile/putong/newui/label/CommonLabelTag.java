package com.p051p1.mobile.putong.newui.label;

import p153l.zvl;

/* JADX INFO: loaded from: classes10.dex */
public enum CommonLabelTag implements zvl {
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

    @Override // p153l.zvl
    public int labelIndex() {
        return this.index;
    }
}
