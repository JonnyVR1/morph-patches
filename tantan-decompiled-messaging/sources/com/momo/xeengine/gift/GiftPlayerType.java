package com.momo.xeengine.gift;

/* JADX INFO: loaded from: classes8.dex */
public enum GiftPlayerType {
    Auto("auto"),
    Hardware("hardware"),
    Software("software");

    private final String value;

    GiftPlayerType(String str) {
        this.value = str;
    }

    public static GiftPlayerType fromString(String str) {
        str.getClass();
        if (str.equals("auto")) {
            return Auto;
        }
        return !str.equals("software") ? Hardware : Software;
    }

    public String getValue() {
        return this.value;
    }
}
