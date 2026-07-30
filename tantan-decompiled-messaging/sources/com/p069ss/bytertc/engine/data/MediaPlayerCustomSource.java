package com.p069ss.bytertc.engine.data;

import com.p069ss.bytertc.engine.IMediaPlayerCustomSourceProvider;

/* JADX INFO: loaded from: classes13.dex */
public class MediaPlayerCustomSource {
    public MediaPlayerCustomSourceMode mode;
    public IMediaPlayerCustomSourceProvider provider;
    public MediaPlayerCustomSourceStreamType type;

    public MediaPlayerCustomSource(IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider, MediaPlayerCustomSourceMode mediaPlayerCustomSourceMode, MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType) {
        this.provider = null;
        this.mode = MediaPlayerCustomSourceMode.PUSH;
        MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType2 = MediaPlayerCustomSourceStreamType.RAW;
        this.mode = mediaPlayerCustomSourceMode;
        this.type = mediaPlayerCustomSourceStreamType;
        this.provider = iMediaPlayerCustomSourceProvider;
    }

    public String toString() {
        return "MediaPlayerCustomSource{provider='" + this.provider + "', MediaPlayerCustomSourceMode='" + this.mode + "', MediaPlayerCustomSourceStreamType='" + this.type + "'}";
    }

    public MediaPlayerCustomSource() {
        this.provider = null;
        this.mode = MediaPlayerCustomSourceMode.PUSH;
        this.type = MediaPlayerCustomSourceStreamType.RAW;
    }
}
