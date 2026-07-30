package io.agora.rtc2;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionInfo {
    public String channelId;
    public int localUid;
    public Constants.MediaSourceType mediaSourceType;
    public int remoteUid;

    public ExtensionInfo() {
        this.mediaSourceType = Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE;
        this.remoteUid = 0;
        this.channelId = null;
        this.localUid = 0;
    }

    public ExtensionInfo(Constants.MediaSourceType mediaSourceType, int i, String str, int i2) {
        this.mediaSourceType = mediaSourceType;
        this.remoteUid = i;
        this.channelId = str;
        this.localUid = i2;
    }
}
