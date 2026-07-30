package com.p074ss.bytertc.engine.loader;

import com.p074ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    private static final String TAG = "RtcNativeLibraryLoaderListener";

    @Override // com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        LogUtil.m82086i(TAG, "onLoadAlready : " + str);
    }

    @Override // com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadError(String str) {
        LogUtil.m82086i(TAG, "onLoadError : " + str);
    }

    @Override // com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        LogUtil.m82086i(TAG, "onLoadSuccess : " + str);
    }
}
