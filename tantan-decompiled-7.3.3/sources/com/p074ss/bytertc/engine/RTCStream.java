package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.data.StreamIndex;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class RTCStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public StreamIndex streamIndex;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public RTCStream(String str, StreamIndex streamIndex, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.userId = str;
        this.streamIndex = streamIndex;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    @CalledByNative
    private static RTCStream create(String str, StreamIndex streamIndex, boolean z, boolean z2, boolean z3) {
        return new RTCStream(str, streamIndex, z, z2, z3, null);
    }

    @CalledByNative
    private static RTCStream createWithStreamDescriptions(String str, StreamIndex streamIndex, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new RTCStream(str, streamIndex, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
    }

    public String toString() {
        return "RTCStream{ userId='" + this.userId + "', isScreen=" + this.isScreen + ", hasVideo=" + this.hasVideo + ", hasAudio=" + this.hasAudio + ", videoStreamDescriptions=" + this.videoStreamDescriptions + '}';
    }

    public RTCStream() {
    }
}
