package com.immomo.mediacore.coninf;

/* JADX INFO: loaded from: classes7.dex */
public interface MRtcEventHandler {
    void onAudioMixingFinished();

    void onConnectionLost();

    void onError(int i);

    void onFirstRemoteVideoDecoded(long j, int i, int i2, int i3);

    void onJoinChannelSuccess(String str, long j, int i);

    void onJoinChannelfail(String str, long j, int i);

    void onUserMuteAudio(int i, boolean z);

    void onUserMuteVideo(int i, boolean z);

    void onUserOffline(long j, int i);

    void onWarning(int i);
}
