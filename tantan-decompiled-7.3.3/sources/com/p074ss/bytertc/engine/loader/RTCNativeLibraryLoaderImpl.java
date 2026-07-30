package com.p074ss.bytertc.engine.loader;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    private static final String TAG = "RtcNativeLibraryLoaderImpl";

    @Override // com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoader
    public boolean load(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Failed to load native library: " + str, e);
            return false;
        }
    }
}
