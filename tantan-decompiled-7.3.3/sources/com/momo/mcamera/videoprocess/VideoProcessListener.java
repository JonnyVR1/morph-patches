package com.momo.mcamera.videoprocess;

/* JADX INFO: loaded from: classes8.dex */
public interface VideoProcessListener {
    void onFail(Exception exc);

    void onProcessFinish(String str);

    void onProcessProgress(float f);

    void onStart();
}
