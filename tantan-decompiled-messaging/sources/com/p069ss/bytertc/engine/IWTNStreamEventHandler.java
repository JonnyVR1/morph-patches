package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.DataMessageSourceType;
import com.p069ss.bytertc.engine.data.VideoFrameInfo;
import com.p069ss.bytertc.engine.data.WTNSubscribeState;
import com.p069ss.bytertc.engine.data.WTNSubscribeStateChangeReason;
import com.p069ss.bytertc.engine.type.RemoteAudioStats;
import com.p069ss.bytertc.engine.type.RemoteVideoStats;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface IWTNStreamEventHandler {
    void onWTNAudioSubscribeStateChanged(String str, WTNSubscribeState wTNSubscribeState, WTNSubscribeStateChangeReason wTNSubscribeStateChangeReason);

    void onWTNDataMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType);

    void onWTNFirstRemoteAudioFrame(String str);

    void onWTNFirstRemoteVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo);

    void onWTNRemoteAudioStats(String str, RemoteAudioStats remoteAudioStats);

    void onWTNRemoteVideoStats(String str, RemoteVideoStats remoteVideoStats);

    void onWTNSEIMessageReceived(String str, int i, ByteBuffer byteBuffer);

    void onWTNVideoSubscribeStateChanged(String str, WTNSubscribeState wTNSubscribeState, WTNSubscribeStateChangeReason wTNSubscribeStateChangeReason);
}
