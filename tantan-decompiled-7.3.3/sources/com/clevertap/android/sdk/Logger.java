package com.clevertap.android.sdk;

import com.tencent.liteav.TXLiteAVCode;
import p153l.axl;

/* JADX INFO: loaded from: classes.dex */
public final class Logger implements axl {
    private int debugLevel;

    public Logger(int i) {
        this.debugLevel = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m5919d(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    private int getDebugLevel() {
        return this.debugLevel;
    }

    private static int getStaticDebugLevel() {
        return CleverTapAPI.m5805I();
    }

    /* JADX INFO: renamed from: i */
    public static void m5923i(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5927v(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p153l.axl
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

    @Override // p153l.axl
    public void verbose(String str, String str2) {
        if (getStaticDebugLevel() <= CleverTapAPI.LogLevel.DEBUG.intValue() || str2.length() <= 4000) {
            return;
        }
        str2.substring(0, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
        verbose(str, str2.substring(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED));
    }

    /* JADX INFO: renamed from: d */
    public static void m5920d(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5924i(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5928v(String str, String str2) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p153l.axl
    public void info(String str, String str2) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: d */
    public static void m5921d(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5925i(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5929v(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    public void info(String str, String str2, Throwable th) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: d */
    public static void m5922d(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m5926i(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    /* JADX INFO: renamed from: v */
    public static void m5930v(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    public void info(String str, Throwable th) {
        getDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p153l.axl
    public void debug(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p153l.axl
    public void verbose(String str) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p153l.axl
    public void debug(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p153l.axl
    public void verbose(String str, String str2, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }

    @Override // p153l.axl
    public void debug(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.INFO.intValue();
    }

    @Override // p153l.axl
    public void verbose(String str, Throwable th) {
        getStaticDebugLevel();
        CleverTapAPI.LogLevel.DEBUG.intValue();
    }
}
