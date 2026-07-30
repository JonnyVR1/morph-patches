package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class RemoteAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public RemoteStreamKey streamKey;

    public RemoteAudioPropertiesInfo(RemoteStreamKey remoteStreamKey, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamKey = remoteStreamKey;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    @CalledByNative
    private static RemoteAudioPropertiesInfo create(String str, String str2, int i, int i2, int i3, float[] fArr, int i4) {
        return new RemoteAudioPropertiesInfo(new RemoteStreamKey(str, str2, StreamIndex.fromId(i)), new AudioPropertiesInfo(i2, i3, fArr, i4));
    }

    public String toString() {
        return "RemoteAudioPropertiesInfo{user_id='" + this.streamKey.getUserId() + "'room_id='" + this.streamKey.getUserId() + "'stream_index='" + this.streamKey.getStreamIndex() + "'audioPropertiesInfo ['linear_volume='" + this.audioPropertiesInfo.linearVolume + "'nonlinear_volume='" + this.audioPropertiesInfo.nonlinearVolume + "']}";
    }
}
