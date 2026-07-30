package com.momo.xengine.media;

import android.text.TextUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class VideoBgmUtilImpl implements IVideoBgmUtil, Runnable {
    private VideoBgmChangerConfig config;
    private long pointer = 0;
    private IVideoBgmUtil.ProgressCallback progressCallback;

    private static boolean isFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private native long nativeInit(String str, String str2, String str3, float f);

    private native void nativeRelease(long j);

    private native void nativeSetProgressCallback(long j, IVideoBgmUtil.ProgressCallback progressCallback);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    @Override // com.momo.xengine.media.IVideoBgmUtil
    public boolean init(VideoBgmChangerConfig videoBgmChangerConfig) {
        if (videoBgmChangerConfig == null || videoBgmChangerConfig.getVideoPath() == null || videoBgmChangerConfig.getVideoPath().isEmpty() || videoBgmChangerConfig.getBgmPath() == null || videoBgmChangerConfig.getBgmPath().isEmpty() || videoBgmChangerConfig.getOutputPath() == null || videoBgmChangerConfig.getOutputPath().isEmpty() || !isFileExists(videoBgmChangerConfig.getVideoPath()) || !isFileExists(videoBgmChangerConfig.getBgmPath())) {
            return false;
        }
        this.config = videoBgmChangerConfig;
        return true;
    }

    @Override // com.momo.xengine.media.IVideoBgmUtil
    public void release() {
        long j = this.pointer;
        if (j == 0) {
            return;
        }
        nativeRelease(j);
        this.pointer = 0L;
    }

    @Override // java.lang.Runnable
    public void run() {
        VideoBgmChangerConfig videoBgmChangerConfig = this.config;
        if (videoBgmChangerConfig != null && this.progressCallback != null) {
            long jNativeInit = nativeInit(videoBgmChangerConfig.getVideoPath(), this.config.getBgmPath(), this.config.getOutputPath(), this.config.getVolumeRate());
            this.pointer = jNativeInit;
            if (jNativeInit == 0) {
                this.progressCallback.onResult(false);
            }
            nativeSetProgressCallback(this.pointer, new IVideoBgmUtil.ProgressCallback() { // from class: com.momo.xengine.media.VideoBgmUtilImpl.1
                @Override // com.momo.xengine.media.IVideoBgmUtil.ProgressCallback
                public void onProcess(float f) {
                    VideoBgmUtilImpl.this.progressCallback.onProcess(f);
                }

                @Override // com.momo.xengine.media.IVideoBgmUtil.ProgressCallback
                public void onResult(boolean z) {
                    VideoBgmUtilImpl.this.progressCallback.onResult(z);
                }
            });
        }
        nativeStart(this.pointer);
    }

    @Override // com.momo.xengine.media.IVideoBgmUtil
    public void setProgressCallback(@NotNull IVideoBgmUtil.ProgressCallback progressCallback) {
        this.progressCallback = progressCallback;
    }

    @Override // com.momo.xengine.media.IVideoBgmUtil
    public void start() {
        new Thread(this).start();
    }

    @Override // com.momo.xengine.media.IVideoBgmUtil
    public void stop() {
        long j = this.pointer;
        if (j == 0) {
            return;
        }
        nativeStop(j);
    }
}
