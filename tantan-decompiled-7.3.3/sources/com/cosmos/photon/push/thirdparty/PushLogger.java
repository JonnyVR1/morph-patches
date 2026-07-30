package com.cosmos.photon.push.thirdparty;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class PushLogger {
    public static boolean DEBUG = false;
    private static final String TAG = "MoPush-ThirdNotify";

    /* JADX INFO: renamed from: d */
    public static void m7455d(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static void m7456e(String str) {
        if (DEBUG) {
            Log.e("MoPush-ThirdNotify", str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7458i(String str) {
    }

    public static void printStack(Throwable th) {
        if (DEBUG) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m7459v(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static void m7460w(String str) {
    }

    /* JADX INFO: renamed from: e */
    public static void m7457e(String str, Throwable th) {
        if (DEBUG) {
            Log.e("MoPush-ThirdNotify", str, th);
        }
    }
}
