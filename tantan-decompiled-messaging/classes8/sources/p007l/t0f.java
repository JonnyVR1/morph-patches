package p007l;

import android.content.Context;
import android.text.TextUtils;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IAudioFrameObserver;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.RtcEngineConfig;
import io.agora.rtc2.video.IVideoFrameObserver;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class t0f {

    /* JADX INFO: renamed from: c */
    private static volatile t0f f4243c;

    /* JADX INFO: renamed from: a */
    private RtcEngine f4244a;

    /* JADX INFO: renamed from: b */
    private String f4245b;

    private t0f() {
    }

    /* JADX INFO: renamed from: b */
    public static t0f m10771b() {
        if (f4243c == null) {
            synchronized (t0f.class) {
                try {
                    if (f4243c == null) {
                        f4243c = new t0f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4243c;
    }

    /* JADX INFO: renamed from: a */
    public void m10772a(IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) {
        if (z) {
            RtcEngine.destroy();
            this.f4244a = null;
            return;
        }
        this.f4244a.removeHandler(iRtcEngineEventHandler);
        this.f4244a.registerAudioFrameObserver((IAudioFrameObserver) null);
        this.f4244a.registerVideoFrameObserver((IVideoFrameObserver) null);
        this.f4244a.setClientRole(2);
        this.f4244a.enableAudioVolumeIndication(0, 3, false);
        this.f4244a.enableDualStreamMode(false);
        this.f4244a.adjustRecordingSignalVolume(100);
        this.f4244a.adjustPlaybackSignalVolume(100);
        this.f4244a.adjustAudioMixingVolume(100);
        this.f4244a.setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_AUTO);
        this.f4244a.setEffectsVolume(100.0d);
        this.f4244a.setAudioEffectPreset(0);
        this.f4244a.muteLocalAudioStream(false);
        this.f4244a.muteLocalVideoStream(false);
        this.f4244a.muteAllRemoteAudioStreams(false);
        this.f4244a.muteAllRemoteVideoStreams(false);
    }

    /* JADX INFO: renamed from: c */
    public RtcEngine m10773c(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) throws Exception {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f4244a != null && (z || !TextUtils.equals(this.f4245b, str))) {
            this.f4244a.leaveChannel();
            RtcEngine.destroy();
            this.f4244a = null;
        }
        RtcEngine rtcEngine = this.f4244a;
        if (rtcEngine == null) {
            RtcEngineConfig rtcEngineConfig = new RtcEngineConfig();
            rtcEngineConfig.mContext = context;
            rtcEngineConfig.mAppId = str;
            rtcEngineConfig.mEventHandler = iRtcEngineEventHandler;
            this.f4244a = RtcEngine.create(rtcEngineConfig);
        } else {
            rtcEngine.leaveChannel();
            this.f4244a.addHandler(iRtcEngineEventHandler);
        }
        this.f4245b = str;
        return this.f4244a;
    }
}
