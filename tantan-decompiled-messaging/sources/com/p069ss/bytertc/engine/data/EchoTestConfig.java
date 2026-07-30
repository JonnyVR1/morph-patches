package com.p069ss.bytertc.engine.data;

import android.view.View;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class EchoTestConfig {
    public int audioReportInterval;
    public boolean enableAudio;
    public boolean enableVideo;
    public String roomId;
    public String token;
    public String uid;
    public View view;

    public EchoTestConfig(View view, String str, String str2, String str3, boolean z, boolean z2, int i) {
        this.view = view;
        this.uid = str;
        this.roomId = str2;
        this.token = str3;
        this.enableAudio = z;
        this.enableVideo = z2;
        this.audioReportInterval = i;
    }

    @CalledByNative
    public int getAudioReportInterval() {
        return this.audioReportInterval;
    }

    @CalledByNative
    public boolean getEchoEnabledAudio() {
        return this.enableAudio;
    }

    @CalledByNative
    public boolean getEchoEnabledVideo() {
        return this.enableVideo;
    }

    @CalledByNative
    public View getEchoRenderView() {
        return this.view;
    }

    @CalledByNative
    public String getEchoRoomId() {
        return this.roomId;
    }

    @CalledByNative
    public String getEchoToken() {
        return this.token;
    }

    @CalledByNative
    public String getEchoUid() {
        return this.uid;
    }

    public String toString() {
        return "EchoTestConfig{view='" + this.view + "'uid='" + this.uid + "', roomId='" + this.roomId + "', token='" + this.token + "', enableAudio='" + this.enableAudio + "', enableVideo='" + this.enableVideo + "', audioReportInterval='" + this.audioReportInterval + "'}";
    }
}
