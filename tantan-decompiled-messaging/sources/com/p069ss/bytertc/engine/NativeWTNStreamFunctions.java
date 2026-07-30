package com.p069ss.bytertc.engine;

import android.view.View;
import com.p069ss.bytertc.engine.handler.NativeWTNStreamEventHandler;
import com.p069ss.bytertc.engine.video.IVideoSink;

/* JADX INFO: loaded from: classes13.dex */
public class NativeWTNStreamFunctions {
    public static native int nativeSetWTNRemoteAudioPlaybackVolume(long j, String str, int i);

    public static native int nativeSetWTNRemoteVideoCanvas(long j, String str, View view, int i, int i2, int i3);

    public static native int nativeSetWTNRemoteVideoSink(long j, String str, IVideoSink iVideoSink, int i, int i2, int i3, int i4);

    public static native int nativeSetWTNStreamEventHandler(long j, NativeWTNStreamEventHandler nativeWTNStreamEventHandler);

    public static native int nativeSubscribeWTNAudioStream(long j, String str, boolean z);

    public static native int nativeSubscribeWTNVideoStream(long j, String str, boolean z);
}
