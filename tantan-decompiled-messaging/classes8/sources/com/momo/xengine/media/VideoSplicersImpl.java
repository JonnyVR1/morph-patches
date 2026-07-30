package com.momo.xengine.media;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class VideoSplicersImpl implements IVideoSplicers, Runnable {
    private final List<String> videoList = new ArrayList();
    private long pointer = 0;
    private String outputPath = null;
    private IVideoSplicers.SplicersCallback splicersCallback = null;

    private static boolean isFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private native long nativeInit(String str, List<String> list);

    private native void nativeRelease(long j);

    private native void nativeSetCallback(long j, IVideoSplicers.SplicersCallback splicersCallback);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        long j = this.pointer;
        if (j != 0) {
            nativeRelease(j);
            this.pointer = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        long j = this.pointer;
        if (j != 0) {
            nativeStop(j);
        }
    }

    @Override // com.momo.xengine.media.IVideoSplicers
    public List<String> getList() {
        return this.videoList;
    }

    @Override // com.momo.xengine.media.IVideoSplicers
    public boolean init(@NotNull String str) {
        if (!str.isEmpty() && !this.videoList.isEmpty()) {
            this.outputPath = str;
            int i = 0;
            while (true) {
                int size = this.videoList.size();
                List<String> list = this.videoList;
                if (i >= size) {
                    long jNativeInit = nativeInit(str, list);
                    this.pointer = jNativeInit;
                    if (jNativeInit != 0) {
                        return true;
                    }
                } else {
                    if (list.get(i).isEmpty() || !isFileExists(this.videoList.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (this.splicersCallback != null && (str = this.outputPath) != null && !str.isEmpty() && !this.videoList.isEmpty()) {
            long j = this.pointer;
            if (j != 0) {
                nativeSetCallback(j, new IVideoSplicers.SplicersCallback() { // from class: com.momo.xengine.media.VideoSplicersImpl.1
                    @Override // com.momo.xengine.media.IVideoSplicers.SplicersCallback
                    public void onProcess(float f) {
                        VideoSplicersImpl.this.splicersCallback.onProcess(f);
                    }

                    @Override // com.momo.xengine.media.IVideoSplicers.SplicersCallback
                    public void onResult(boolean z) {
                        VideoSplicersImpl.this.stop();
                        VideoSplicersImpl.this.release();
                        VideoSplicersImpl.this.splicersCallback.onResult(z);
                    }
                });
            }
        }
        nativeStart(this.pointer);
    }

    @Override // com.momo.xengine.media.IVideoSplicers
    public void setSplicersCallback(@NotNull IVideoSplicers.SplicersCallback splicersCallback) {
        this.splicersCallback = splicersCallback;
    }

    @Override // com.momo.xengine.media.IVideoSplicers
    public void start() {
        new Thread(this).start();
    }
}
