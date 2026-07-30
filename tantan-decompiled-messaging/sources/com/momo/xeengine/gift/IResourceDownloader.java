package com.momo.xeengine.gift;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IResourceDownloader {

    @Keep
    public interface Callback {
        void onComplete(boolean z, String str);
    }

    void downloadResourceWithURL(String str, Callback callback);
}
