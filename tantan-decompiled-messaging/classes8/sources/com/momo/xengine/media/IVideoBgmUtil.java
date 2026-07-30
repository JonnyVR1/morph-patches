package com.momo.xengine.media;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IVideoBgmUtil {

    public interface ProgressCallback {
        void onProcess(float f);

        void onResult(boolean z);
    }

    boolean init(@NotNull VideoBgmChangerConfig videoBgmChangerConfig);

    void release();

    void setProgressCallback(@NotNull ProgressCallback progressCallback);

    void start();

    void stop();
}
