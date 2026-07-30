package com.clevertap.android.sdk;

import com.tencent.liteav.TXLiteAVCode;
import p149l.nul;

/* JADX INFO: loaded from: classes.dex */
public final class Logger implements nul {
    private int debugLevel;

    public Logger(int i) {
        this.debugLevel = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m5865d(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    private int getDebugLevel() {
        return this.debugLevel;
    }

    private static int getStaticDebugLevel() {
        return CleverTapAPI.m5751I();
    }

    /* JADX INFO: renamed from: i */
    public static void m5869i(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5873v(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p149l.nul
    public void debug(String str, String str2) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.INFO.intValue() || str2.length() <= 4000) {
            return;
        }
        str2.substring(0, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        debug(str, str2.substring(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
    }

    public void info(String str) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    public void setDebugLevel(int i) {
        this.debugLevel = i;
    }

    @Override // p149l.nul
    public void verbose(String str, String str2) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue() || str2.length() <= 4000) {
            return;
        }
        str2.substring(0, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        verbose(str, str2.substring(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
    }

    /* JADX INFO: renamed from: d */
    public static void m5866d(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5870i(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5874v(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p149l.nul
    public void info(String str, String str2) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: d */
    public static void m5867d(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5871i(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5875v(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    public void info(String str, String str2, Throwable th) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: d */
    public static void m5868d(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5872i(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5876v(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    public void info(String str, Throwable th) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p149l.nul
    public void debug(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p149l.nul
    public void verbose(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p149l.nul
    public void debug(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p149l.nul
    public void verbose(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p149l.nul
    public void debug(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p149l.nul
    public void verbose(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }
}
