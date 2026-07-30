package com.momo.xeengine;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface IXEngineModule {
    void engineDidCreated(IXEngine iXEngine);

    void engineWillCreate();

    void engineWillDestroy(IXEngine iXEngine);
}
