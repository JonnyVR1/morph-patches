package com.momo.xeengine.game;

import android.view.View;
import androidx.annotation.Keep;
import com.momo.xeengine.IXEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface XEGameViewCallback {
    void onEngineDynamicLinkLibraryDownloadProcess(int i, double d);

    void onRenderSizeChanged(int i, int i2);

    void onRenderViewCreate(@NotNull View view);

    void onStart(@NotNull IXEngine iXEngine);

    void onStartFailed(@NotNull String str);
}
