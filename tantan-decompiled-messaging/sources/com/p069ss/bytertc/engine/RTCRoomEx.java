package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.RemoteVideoConfig;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.p069ss.bytertc.engine.type.MediaStreamType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RTCRoomEx extends RTCRoom {
    public abstract int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    public abstract int setRTCRoomEventHandlerEx(IRTCRoomEventHandlerEx iRTCRoomEventHandlerEx);

    public abstract int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig);

    public abstract int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);

    public abstract int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType);

    public abstract int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType);
}
