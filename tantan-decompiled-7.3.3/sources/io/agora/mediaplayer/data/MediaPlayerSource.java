package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;
import io.agora.mediaplayer.IMediaPlayerCustomDataProvider;

/* JADX INFO: loaded from: classes2.dex */
public class MediaPlayerSource {
    Boolean isAgoraSource;
    Boolean isLiveSource;
    long startPos = 0;
    boolean enableCache = false;
    boolean enableMultiAudioTrack = false;
    String url = null;
    String uri = null;
    boolean autoPlay = true;
    IMediaPlayerCustomDataProvider provider = null;

    public void enableAgoraSource(boolean z) {
        this.isAgoraSource = Boolean.valueOf(z);
    }

    public void enableLiveSource(boolean z) {
        this.isLiveSource = Boolean.valueOf(z);
    }

    @CalledByNative
    public IMediaPlayerCustomDataProvider getProvider() {
        return this.provider;
    }

    @CalledByNative
    public long getStartPos() {
        return this.startPos;
    }

    @CalledByNative
    public String getUri() {
        return this.uri;
    }

    @CalledByNative
    public String getUrl() {
        return this.url;
    }

    @CalledByNative
    public Boolean isAgoraSource() {
        return this.isAgoraSource;
    }

    @CalledByNative
    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    @CalledByNative
    public boolean isEnableCache() {
        return this.enableCache;
    }

    @CalledByNative
    public boolean isEnableMultiAudioTrack() {
        return this.enableMultiAudioTrack;
    }

    @CalledByNative
    public Boolean isLiveSource() {
        return this.isLiveSource;
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public void setEnableCache(boolean z) {
        this.enableCache = z;
    }

    public void setEnableMultiAudioTrack(boolean z) {
        this.enableMultiAudioTrack = z;
    }

    public void setProvider(IMediaPlayerCustomDataProvider iMediaPlayerCustomDataProvider) {
        this.provider = iMediaPlayerCustomDataProvider;
    }

    public void setStartPos(long j) {
        this.startPos = j;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaPlayerSource{url='");
        sb.append(this.url);
        sb.append("', uri='");
        sb.append(this.uri);
        sb.append("', startPos=");
        sb.append(this.startPos);
        sb.append(", enableCache=");
        sb.append(this.enableCache);
        sb.append(", autoPlay=");
        sb.append(this.autoPlay);
        sb.append(", enableMultiAudioTrack=");
        sb.append(this.enableMultiAudioTrack);
        sb.append(", isLiveSource=");
        Boolean bool = this.isLiveSource;
        Boolean bool2 = null;
        if (bool != null) {
            bool.booleanValue();
        } else {
            bool = null;
        }
        sb.append(bool);
        sb.append(", isAgoraSource=");
        Boolean bool3 = this.isAgoraSource;
        if (bool3 != null) {
            bool3.booleanValue();
            bool2 = bool3;
        }
        sb.append(bool2);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append('}');
        return sb.toString();
    }
}
