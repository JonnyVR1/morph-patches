package com.p069ss.bytertc.engine.loader;

import com.p069ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes13.dex */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    private static final String TAG = "RtcNativeLibraryLoaderListener";

    @Override // com.p069ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        LogUtil.m80903i(TAG, "onLoadAlready : " + str);
    }

    @Override // com.p069ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadError(String str) {
        LogUtil.m80903i(TAG, "onLoadError : " + str);
    }

    @Override // com.p069ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        LogUtil.m80903i(TAG, "onLoadSuccess : " + str);
    }
}
