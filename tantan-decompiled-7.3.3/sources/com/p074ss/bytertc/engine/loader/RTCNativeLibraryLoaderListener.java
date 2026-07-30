package com.p074ss.bytertc.engine.loader;

/* JADX INFO: loaded from: classes11.dex */
public interface RTCNativeLibraryLoaderListener {
    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
