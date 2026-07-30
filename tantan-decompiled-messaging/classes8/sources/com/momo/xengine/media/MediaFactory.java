package com.momo.xengine.media;

import android.util.Log;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class MediaFactory {
    public static final String LOG_TAG = "XMedia";
    public static final int VERSION_NUM = 100;
    private static boolean loadSOSuccess = false;

    private MediaFactory() {
    }

    @Nullable
    public static IAudioProcessor createAudioProcessor() {
        if (loadSO()) {
            return new AudioProcessorImpl();
        }
        return null;
    }

    @Nullable
    public static IMediaUtil createMediaUtil() {
        if (loadSO()) {
            return new MediaUtilImpl();
        }
        return null;
    }

    @Nullable
    public static IPCMDecoder createPCMDecoder() {
        if (loadSO()) {
            return new PCMDecoderImpl();
        }
        return null;
    }

    @Nullable
    public static ISoundTouch createSoundTouch() {
        if (loadSO()) {
            return new SoundTouchImpl();
        }
        return null;
    }

    @Nullable
    public static IVideoBgmUtil createVideoBgmUtil() {
        if (loadSO()) {
            return new VideoBgmUtilImpl();
        }
        return null;
    }

    @Nullable
    public static IVideoDecoder createVideoDecoder() {
        if (loadSO()) {
            return new VideoDecoderImpl();
        }
        return null;
    }

    @Nullable
    public static IVideoEncoder createVideoEncoder() {
        if (loadSO()) {
            return new VideoEncoderImpl();
        }
        return null;
    }

    @Nullable
    public static IMediacodecSurfaceEncoder createVideoEncoderWithSurface() {
        if (loadSO()) {
            return new MediacodecEncoderWrapper();
        }
        return null;
    }

    @Nullable
    public static IVideoFrameExtractor createVideoFrameExtractor() {
        if (loadSO()) {
            return new VideoFrameExtractorImpl();
        }
        return null;
    }

    @Nullable
    public static IVideoSplicers createVideoSplicers() {
        if (loadSO()) {
            return new VideoSplicersImpl();
        }
        return null;
    }

    @Nullable
    public static IYUVConverter createYUVConverter() {
        if (loadSO()) {
            return new YUVConverterImpl();
        }
        return null;
    }

    public static synchronized boolean loadSO() {
        if (loadSOSuccess) {
            return true;
        }
        try {
            Log.e(LOG_TAG, "加载动态库 开始");
            System.loadLibrary("c++_shared");
            System.loadLibrary("xmedia");
            Log.e(LOG_TAG, "加载动态库 完成");
            if (nativeCheckVersion(100L)) {
                loadSOSuccess = true;
            } else {
                Log.e(LOG_TAG, "动态库版本加载错误");
            }
        } catch (Throwable th) {
            Log.e(LOG_TAG, "动态库加载失败" + th);
        }
        return loadSOSuccess;
    }

    private static native boolean nativeCheckVersion(long j);

    private static native void nativeSetLogEnable(boolean z);

    public static void setLogEnable(boolean z) {
        if (loadSO()) {
            nativeSetLogEnable(z);
        }
    }
}
