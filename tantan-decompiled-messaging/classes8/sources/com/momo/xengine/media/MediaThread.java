package com.momo.xengine.media;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class MediaThread extends Thread {
    private final long pointer;

    public MediaThread(long j) {
        this.pointer = j;
    }

    private native void nativeCallFunc(long j);

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        nativeCallFunc(this.pointer);
    }
}
