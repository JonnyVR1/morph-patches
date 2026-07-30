package com.tantanapp.foxstatistics.entity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public enum EventNameEnum {
    PAGE_VIEW("PV"),
    PAGE_DISAPPEAR("PD"),
    MODULE_CLICK("MC"),
    MODULE("ME"),
    MODULE_VIEW("MV"),
    MODULE_VIEW_LIST("ML"),
    MODULE_SLIDER("MS"),
    APPSTART("AS"),
    APPQUIT("AQ"),
    APPEXIT("AE"),
    APPCRASH("AC"),
    BIZ_ORDER("BO"),
    BIZ_PAY("BP"),
    SYS_CHECK("SC"),
    USER_BEHAVIOR_COMPLEMENT("UBC"),
    DEFAULT("DF");

    private String name;

    EventNameEnum(String str) {
        this.name = str;
    }

    public boolean equals(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(this.name);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
