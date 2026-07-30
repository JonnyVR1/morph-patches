package io.agora.rtc2;

/* JADX INFO: loaded from: classes2.dex */
public class RecorderStreamInfo {
    public String channelId;
    public int recorderStreamType;
    public int uid;

    public RecorderStreamInfo() {
        this.uid = 0;
        this.channelId = null;
        this.recorderStreamType = 0;
    }

    public String toString() {
        return "channelId=" + this.channelId;
    }

    public RecorderStreamInfo(String str, int i, int i2) {
        this.uid = i;
        this.channelId = str;
        this.recorderStreamType = i2;
    }
}
