package io.agora.pushrtmpvideosource;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class VideoPreProcessing {
    static {
        System.loadLibrary("apm-plugin-video-preprocessing");
    }

    public native void enablePreProcessing(boolean z);

    public native byte[] getPcmData();

    public native byte[] getYuvData(ByteBuffer byteBuffer, int i, int i2, int i3, boolean z);
}
