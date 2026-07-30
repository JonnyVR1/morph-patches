package com.p074ss.bytertc.engine.handler;

import com.p074ss.bytertc.engine.SubscribeConfig;
import com.p074ss.bytertc.engine.data.AVSyncEvent;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamKey;
import com.p074ss.bytertc.engine.type.MediaStreamType;
import com.p074ss.bytertc.engine.type.StreamRemoveReason;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IRTCRoomEventHandlerEx {
    public void onAVSyncEvent(StreamKey streamKey, AVSyncEvent aVSyncEvent) {
    }

    public void onStreamPublishSuccess(String str, StreamIndex streamIndex, boolean z) {
    }

    public void onStreamStateChanged(StreamKey streamKey, int i, String str) {
    }

    public void onStreamSubscribed(int i, String str, StreamIndex streamIndex, SubscribeConfig subscribeConfig) {
    }

    public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z, MediaStreamType mediaStreamType) {
    }

    public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }
}
