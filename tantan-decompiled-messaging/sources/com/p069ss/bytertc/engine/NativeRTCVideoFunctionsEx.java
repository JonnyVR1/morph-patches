package com.p069ss.bytertc.engine;

import android.content.Context;
import com.bytedance.realx.video.EglBase;
import com.p069ss.bytertc.engine.data.VideoFrameData;
import com.p069ss.bytertc.engine.handler.RTCVideoEventHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class NativeRTCVideoFunctionsEx {
    public static native long nativeCreateRTCVideoEx(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3);

    public static native long nativeCreateRTCVideoExMulti(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3);

    public static native void nativeDestroyRTCVideoEx(long j);

    public static native void nativeDestroyRTCVideoExMulti(long j);

    public static native int nativePushExternalVideoFrame(long j, int i, VideoFrameData videoFrameData);

    public static native int nativeSetAudioContentType(long j, int i, boolean z, boolean z2, boolean z3);

    public static native int nativeSetAudioEncodeConfig(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public static native int nativeSetAudioSourceVolume(long j, int i, int i2);

    public static native int nativeSetCaptureVolume(long j, int i);

    public static native int nativeSetLocalStreamPriority(long j, int i, int i2);

    public static native int nativeSetScreenCaptureVolume(long j, int i);

    public static native int nativeSetVideoCaptureConfig(long j, int i, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoEncoderConfig(long j, int i, List<InternalVideoEncoderConfig> list);

    public static native int nativeSetVideoSource(long j, int i, int i2, int i3);

    public static native int nativeStartVideoCapture(long j, int i, String str);

    public static native int nativeStopVideoCapture(long j, int i);
}
