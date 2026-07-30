package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.p074ss.bytertc.engine.handler.RTCRoomEventHandlerEx;
import com.p074ss.bytertc.engine.handler.RTCRoomEventHandlerRts;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class NativeRTCRoomFunctions {
    public static native void nativeDestory(long j);

    public static native void nativeDestroyRTSRoom(long j);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native String nativeGetCallId(long j);

    public static native long nativeGetPanoramicVideo(long j);

    public static native long nativeGetRangeAudio(long j);

    public static native String nativeGetRoomId(long j);

    public static native long nativeGetSpatialAudio(long j);

    public static native int nativeJoinRTSRoom(long j, String str, UserInfo userInfo);

    public static native int nativeJoinRoomWithRoomConfig(long j, String str, UserInfo userInfo, boolean z, RTCRoomConfig rTCRoomConfig);

    public static native int nativeLeaveRTSRoom(long j);

    public static native int nativeLeaveRoom(long j);

    public static native int nativePauseAllSubscribedStreamAudio(long j);

    public static native int nativePauseAllSubscribedStreamVideo(long j);

    public static native int nativePauseForwardStreamToAllRooms(long j);

    public static native int nativePublishScreenAudio(long j, boolean z);

    public static native int nativePublishScreenVideo(long j, boolean z);

    public static native int nativePublishStreamAudio(long j, boolean z);

    public static native int nativePublishStreamEx(long j, int i, int i2);

    public static native int nativePublishStreamVideo(long j, boolean z);

    public static native void nativeReleaseRTCRoomEventHandler(long j);

    public static native void nativeReleaseRTCRoomEventHandlerEx(long j);

    public static native void nativeReleaseRTCRoomEventHandlerRts(long j);

    public static native int nativeResumeAllSubscribedStreamAudio(long j);

    public static native int nativeResumeAllSubscribedStreamVideo(long j);

    public static native int nativeResumeForwardStreamToAllRooms(long j);

    public static native long nativeSendRTSRoomBinaryMessage(long j, byte[] bArr);

    public static native long nativeSendRTSRoomMessage(long j, String str);

    public static native long nativeSendRTSUserBinaryMessage(long j, String str, byte[] bArr, int i);

    public static native long nativeSendRTSUserMessage(long j, String str, String str2, int i);

    public static native long nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native long nativeSendRoomMessage(long j, String str);

    public static native long nativeSendUserBinaryMessage(long j, String str, byte[] bArr, int i);

    public static native long nativeSendUserMessage(long j, String str, String str2, int i);

    public static native int nativeSetAudioSelectionConfig(long j, int i);

    public static native int nativeSetMultiDeviceAVSync(long j, String str);

    public static native long nativeSetRTCRoomEventHandler(long j, RTCRoomEventHandler rTCRoomEventHandler);

    public static native long nativeSetRTCRoomEventHandlerEx(long j, RTCRoomEventHandlerEx rTCRoomEventHandlerEx);

    public static native long nativeSetRTCRoomEventHandlerRts(long j, RTCRoomEventHandlerRts rTCRoomEventHandlerRts);

    public static native int nativeSetRemoteRoomAudioPlaybackVolume(long j, int i);

    public static native int nativeSetRemoteSimulcastStreamType(long j, String str, int i);

    public static native int nativeSetRemoteVideoConfigEx(long j, String str, int i, int i2, int i3, int i4);

    public static native long nativeSetRoomExtraInfo(long j, String str, String str2);

    public static native int nativeSetUserVisibility(long j, boolean z);

    public static native int nativeStartForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native int nativeStartSubtitle(long j, int i, String str);

    public static native int nativeStopForwardStreamToRooms(long j);

    public static native int nativeStopSubtitle(long j);

    public static native int nativeSubscribeAllStreamsAudio(long j, boolean z);

    public static native int nativeSubscribeAllStreamsVideo(long j, boolean z);

    public static native int nativeSubscribeScreenAudio(long j, String str, boolean z);

    public static native int nativeSubscribeScreenVideo(long j, String str, boolean z);

    public static native int nativeSubscribeStreamAudio(long j, String str, boolean z);

    public static native int nativeSubscribeStreamEx(long j, String str, int i, int i2);

    public static native int nativeSubscribeStreamVideo(long j, String str, boolean z);

    public static native int nativeUnpublishStreamEx(long j, int i, int i2);

    public static native int nativeUnsubscribeStreamEx(long j, String str, int i, int i2);

    public static native int nativeUpdateForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native int nativeUpdateRTSToken(long j, String str);

    public static native int nativeUpdateToken(long j, String str);
}
