package com.p051p1.mobile.android.p053ui.label;

/* JADX INFO: loaded from: classes8.dex */
public enum LabelModule {
    UNKNOWN(-1),
    COMMON(0),
    CORE(1),
    LIVE(2),
    FEED(3),
    ACCOUNT(4);

    private int moduleKey;

    LabelModule(int i) {
        this.moduleKey = i;
    }

    public static LabelModule getLabel(int i) {
        if (i == 0) {
            return COMMON;
        }
        if (i == 1) {
            return CORE;
        }
        if (i == 2) {
            return LIVE;
        }
        if (i == 3) {
            return FEED;
        }
        return i == 4 ? ACCOUNT : UNKNOWN;
    }

    public int getModuleKey() {
        return this.moduleKey;
    }
}
