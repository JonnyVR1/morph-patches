package com.momo.xeengine.xnative;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface IXEngineListener {
    void onEngineRelease();

    void postRender();

    void preRender();
}
