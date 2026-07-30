package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMediaInfo {
    public String channelName;
    public String token;
    public int uid;

    public ChannelMediaInfo(String str, String str2, int i) {
        this.channelName = str;
        this.token = str2;
        this.uid = i;
    }

    @CalledByNative
    public String getChannelName() {
        return this.channelName;
    }

    @CalledByNative
    public String getToken() {
        return this.token;
    }

    @CalledByNative
    public int getUid() {
        return this.uid;
    }
}
