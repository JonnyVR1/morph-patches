package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.handler.RTCAudioEffectPlayerEventHandler;

/* JADX INFO: loaded from: classes11.dex */
public class NativeAudioEffectPlayerFunctions {
    public static native int nativeGetDuration(long j, int i);

    public static native int nativeGetPosition(long j, int i);

    public static native int nativeGetVolume(long j, int i);

    public static native int nativePause(long j, int i);

    public static native int nativePauseAll(long j);

    public static native int nativePreload(long j, int i, String str);

    public static native int nativeResume(long j, int i);

    public static native int nativeResumeAll(long j);

    public static native int nativeSetEventHandler(long j, long j2, RTCAudioEffectPlayerEventHandler rTCAudioEffectPlayerEventHandler);

    public static native int nativeSetPosition(long j, int i, int i2);

    public static native int nativeSetVolume(long j, int i, int i2);

    public static native int nativeSetVolumeAll(long j, int i);

    public static native int nativeStart(long j, int i, String str, int i2, int i3, int i4, int i5);

    public static native int nativeStop(long j, int i);

    public static native int nativeStopAll(long j);

    public static native int nativeUnload(long j, int i);

    public static native int nativeUnloadAll(long j);
}
