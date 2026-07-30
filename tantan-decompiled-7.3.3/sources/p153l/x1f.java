package p153l;

import android.content.Context;
import android.text.TextUtils;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.RtcEngineConfig;

/* JADX INFO: loaded from: classes8.dex */
public class x1f {

    /* JADX INFO: renamed from: c */
    private static volatile x1f f192052c;

    /* JADX INFO: renamed from: a */
    private RtcEngine f192053a;

    /* JADX INFO: renamed from: b */
    private String f192054b;

    private x1f() {
    }

    /* JADX INFO: renamed from: b */
    public static x1f m209047b() {
        if (f192052c == null) {
            synchronized (x1f.class) {
                try {
                    if (f192052c == null) {
                        f192052c = new x1f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192052c;
    }

    /* JADX INFO: renamed from: a */
    public void m209048a(IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) {
        if (z) {
            RtcEngine.destroy();
            this.f192053a = null;
            return;
        }
        this.f192053a.removeHandler(iRtcEngineEventHandler);
        this.f192053a.registerAudioFrameObserver(null);
        this.f192053a.registerVideoFrameObserver(null);
        this.f192053a.setClientRole(2);
        this.f192053a.enableAudioVolumeIndication(0, 3, false);
        this.f192053a.enableDualStreamMode(false);
        this.f192053a.adjustRecordingSignalVolume(100);
        this.f192053a.adjustPlaybackSignalVolume(100);
        this.f192053a.adjustAudioMixingVolume(100);
        this.f192053a.setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_AUTO);
        this.f192053a.setEffectsVolume(100.0d);
        this.f192053a.setAudioEffectPreset(0);
        this.f192053a.muteLocalAudioStream(false);
        this.f192053a.muteLocalVideoStream(false);
        this.f192053a.muteAllRemoteAudioStreams(false);
        this.f192053a.muteAllRemoteVideoStreams(false);
    }

    /* JADX INFO: renamed from: c */
    public RtcEngine m209049c(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) throws Exception {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f192053a != null && (z || !TextUtils.equals(this.f192054b, str))) {
            this.f192053a.leaveChannel();
            RtcEngine.destroy();
            this.f192053a = null;
        }
        RtcEngine rtcEngine = this.f192053a;
        if (rtcEngine == null) {
            RtcEngineConfig rtcEngineConfig = new RtcEngineConfig();
            rtcEngineConfig.mContext = context;
            rtcEngineConfig.mAppId = str;
            rtcEngineConfig.mEventHandler = iRtcEngineEventHandler;
            this.f192053a = RtcEngine.create(rtcEngineConfig);
        } else {
            rtcEngine.leaveChannel();
            this.f192053a.addHandler(iRtcEngineEventHandler);
        }
        this.f192054b = str;
        return this.f192053a;
    }
}
