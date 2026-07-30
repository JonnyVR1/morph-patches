package p149l;

import android.content.Context;
import android.text.TextUtils;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.RtcEngineConfig;

/* JADX INFO: loaded from: classes8.dex */
public class t0f {

    /* JADX INFO: renamed from: c */
    private static volatile t0f f167176c;

    /* JADX INFO: renamed from: a */
    private RtcEngine f167177a;

    /* JADX INFO: renamed from: b */
    private String f167178b;

    private t0f() {
    }

    /* JADX INFO: renamed from: b */
    public static t0f m186855b() {
        if (f167176c == null) {
            synchronized (t0f.class) {
                try {
                    if (f167176c == null) {
                        f167176c = new t0f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f167176c;
    }

    /* JADX INFO: renamed from: a */
    public void m186856a(IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) {
        if (z) {
            RtcEngine.destroy();
            this.f167177a = null;
            return;
        }
        this.f167177a.removeHandler(iRtcEngineEventHandler);
        this.f167177a.registerAudioFrameObserver(null);
        this.f167177a.registerVideoFrameObserver(null);
        this.f167177a.setClientRole(2);
        this.f167177a.enableAudioVolumeIndication(0, 3, false);
        this.f167177a.enableDualStreamMode(false);
        this.f167177a.adjustRecordingSignalVolume(100);
        this.f167177a.adjustPlaybackSignalVolume(100);
        this.f167177a.adjustAudioMixingVolume(100);
        this.f167177a.setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_AUTO);
        this.f167177a.setEffectsVolume(100.0d);
        this.f167177a.setAudioEffectPreset(0);
        this.f167177a.muteLocalAudioStream(false);
        this.f167177a.muteLocalVideoStream(false);
        this.f167177a.muteAllRemoteAudioStreams(false);
        this.f167177a.muteAllRemoteVideoStreams(false);
    }

    /* JADX INFO: renamed from: c */
    public RtcEngine m186857c(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, boolean z) throws Exception {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f167177a != null && (z || !TextUtils.equals(this.f167178b, str))) {
            this.f167177a.leaveChannel();
            RtcEngine.destroy();
            this.f167177a = null;
        }
        RtcEngine rtcEngine = this.f167177a;
        if (rtcEngine == null) {
            RtcEngineConfig rtcEngineConfig = new RtcEngineConfig();
            rtcEngineConfig.mContext = context;
            rtcEngineConfig.mAppId = str;
            rtcEngineConfig.mEventHandler = iRtcEngineEventHandler;
            this.f167177a = RtcEngine.create(rtcEngineConfig);
        } else {
            rtcEngine.leaveChannel();
            this.f167177a.addHandler(iRtcEngineEventHandler);
        }
        this.f167178b = str;
        return this.f167177a;
    }
}
