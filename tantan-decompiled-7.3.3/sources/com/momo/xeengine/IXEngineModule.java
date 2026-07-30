package com.momo.xeengine;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IXEngineModule {
    void engineDidCreated(IXEngine iXEngine);

    void engineWillCreate();

    void engineWillDestroy(IXEngine iXEngine);
}
