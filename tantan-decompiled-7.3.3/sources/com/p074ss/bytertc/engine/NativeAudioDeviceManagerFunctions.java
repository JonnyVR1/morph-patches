package com.p074ss.bytertc.engine;

/* JADX INFO: loaded from: classes11.dex */
public class NativeAudioDeviceManagerFunctions {
    public static native int nativeStartAudioDeviceRecordTest(long j, int i);

    public static native int nativeStartAudioPlaybackDeviceTest(long j, String str, int i);

    public static native int nativeStopAudioDevicePlayTest(long j);

    public static native int nativeStopAudioDeviceRecordAndPlayTest(long j);

    public static native int nativeStopAudioPlaybackDeviceTest(long j);
}
