package com.momo.xeengine.xnative;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class XEThread extends Thread {
    private final long pointer;

    public XEThread(long j) {
        this.pointer = j;
    }

    private native void nativeCallFunc(long j);

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        nativeCallFunc(this.pointer);
    }
}
