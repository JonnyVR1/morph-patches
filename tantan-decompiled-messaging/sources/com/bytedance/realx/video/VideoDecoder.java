package com.bytedance.realx.video;

import android.view.Surface;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodedFrame(RXVideoFrameInterface rXVideoFrameInterface);

        void onMediaCodecStatus(VideoCodecStatus videoCodecStatus, String str);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public final int directRenderMode;
        public final boolean enableAGFXSurfaceTextureHelper;
        public final boolean enableAsyncMode;
        public final boolean enableBFrameDecode;
        public final boolean enableRecreateByResolution;
        public final boolean enableSmoothOutput;
        public final boolean enableSurfaceTextureReuse;
        public final boolean enableYUVOutput;
        public final int height;
        public final boolean latencyInsensitiveMode;
        public final int numberOfCores;
        public final boolean outputByDts;
        public final EglBase.Context sharedContext;
        public final int texturePlayoutMode;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, EglBase.Context context, boolean z9, int i4, int i5) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.outputByDts = z;
            this.enableSmoothOutput = z2;
            this.enableYUVOutput = z3;
            this.latencyInsensitiveMode = z4;
            this.enableSurfaceTextureReuse = z5;
            this.enableRecreateByResolution = z6;
            this.enableBFrameDecode = z7;
            this.sharedContext = context;
            this.enableAGFXSurfaceTextureHelper = z8;
            this.enableAsyncMode = z9;
            this.directRenderMode = i4;
            this.texturePlayoutMode = i5;
        }
    }

    @CalledByNative
    default long createNativeVideoDecoder() {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage);

    @CalledByNative
    void disableExternalSurface();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    boolean getPrefersLateDecoding();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    void onFrame(RXVideoFrameInterface rXVideoFrameInterface);

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus setDeliverParams(boolean z, int i, float f, float f2, int i2);

    @CalledByNative
    void setExternalSurface(Surface surface);

    @CalledByNative
    VideoCodecStatus setPrivateParam(String str, String str2);

    @CalledByNative
    VideoCodecStatus updateSettings(Settings settings);
}
