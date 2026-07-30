package io.agora.rtc2;

import android.view.SurfaceView;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class EchoTestConfiguration {
    public String channelId;
    public boolean enableAudio;
    public boolean enableVideo;
    public int intervalInSeconds;
    public String token;
    public SurfaceView view;

    @CalledByNative
    public EchoTestConfiguration() {
        this.intervalInSeconds = 2;
        this.view = null;
        this.enableAudio = true;
        this.enableVideo = true;
        this.token = null;
        this.channelId = null;
    }

    @CalledByNative
    public EchoTestConfiguration(SurfaceView surfaceView, boolean z, boolean z2, String str, String str2) {
        this(surfaceView, z, z2, str, str2, 10);
    }

    @CalledByNative
    public EchoTestConfiguration(SurfaceView surfaceView, boolean z, boolean z2, String str, String str2, int i) {
        this.view = surfaceView;
        this.enableAudio = z;
        this.enableVideo = z2;
        this.token = str;
        this.channelId = str2;
        this.intervalInSeconds = i;
    }
}
