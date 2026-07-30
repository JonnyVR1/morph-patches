package com.p000p1.mobile.putong.data;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LocalBoostStatus {
    private static LocalBoostStatus instance;
    public boolean active;
    public long left;
    public long past;
    public int progress;
    public int totalExposure;

    public static LocalBoostStatus obtain() {
        if (instance == null) {
            instance = new LocalBoostStatus();
        }
        return instance;
    }
}
