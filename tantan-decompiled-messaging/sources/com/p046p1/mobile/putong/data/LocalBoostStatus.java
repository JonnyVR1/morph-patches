package com.p046p1.mobile.putong.data;

/* JADX INFO: loaded from: classes12.dex */
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
