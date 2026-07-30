package com.momo.xengine.media;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IVideoSplicers {

    public interface SplicersCallback {
        void onProcess(float f);

        void onResult(boolean z);
    }

    List<String> getList();

    boolean init(@NotNull String str);

    void setSplicersCallback(@NotNull SplicersCallback splicersCallback);

    void start();
}
