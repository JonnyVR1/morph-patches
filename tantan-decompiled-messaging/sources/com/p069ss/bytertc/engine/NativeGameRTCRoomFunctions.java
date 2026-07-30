package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.handler.RTCRoomEventHandler;

/* JADX INFO: loaded from: classes13.dex */
public class NativeGameRTCRoomFunctions {
    public static native void nativeDestory(long j);

    public static native int nativeEnableAudioReceive(long j, String str, boolean z);

    public static native int nativeEnableAudioSend(long j, boolean z);

    public static native int nativeEnableMicrophone(long j, boolean z);

    public static native int nativeEnableSpeakerphone(long j, boolean z);

    public static native long nativeGetRangeAudio(long j);

    public static native int nativeJoinRoom(long j, String str, UserInfo userInfo);

    public static native int nativeLeaveRoom(long j);

    public static native void nativeReleaseRTCRoomEventHandler(long j);

    public static native long nativeSetRTCRoomEventHandler(long j, RTCRoomEventHandler rTCRoomEventHandler);

    public static native int nativeSetRemoteRoomAudioPlaybackVolume(long j, int i);

    public static native int nativeUpdateToken(long j, String str);
}
