package p149l;

import android.text.TextUtils;
import com.p069ss.bytertc.engine.RTCEngineEx;
import com.p069ss.bytertc.engine.RTCRoomEx;
import com.p069ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p069ss.bytertc.engine.data.AudioProcessorMethod;
import com.p069ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p069ss.bytertc.engine.data.AudioRoute;
import com.p069ss.bytertc.engine.data.EarMonitorMode;
import com.p069ss.bytertc.engine.data.EngineConfig;
import com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p069ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p069ss.bytertc.engine.type.AudioProfileType;
import com.p069ss.bytertc.engine.type.AudioScenarioType;

/* JADX INFO: loaded from: classes8.dex */
public class sdp0 {

    /* JADX INFO: renamed from: d */
    private static volatile sdp0 f163867d;

    /* JADX INFO: renamed from: a */
    private RTCEngineEx f163868a;

    /* JADX INFO: renamed from: b */
    private String f163869b;

    /* JADX INFO: renamed from: c */
    private RTCRoomEx f163870c;

    private sdp0() {
    }

    /* JADX INFO: renamed from: b */
    public static sdp0 m183522b() {
        if (f163867d == null) {
            synchronized (sdp0.class) {
                try {
                    if (f163867d == null) {
                        f163867d = new sdp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f163867d;
    }

    /* JADX INFO: renamed from: a */
    public void m183523a(boolean z) {
        RTCEngineEx rTCEngineEx = this.f163868a;
        if (rTCEngineEx == null) {
            return;
        }
        if (z) {
            RTCEngineEx.destroyRTCEngineEx();
            this.f163868a = null;
            return;
        }
        rTCEngineEx.setRtcVideoEventHandler(null);
        this.f163868a.setRtcVideoEventHandlerEx(null);
        this.f163868a.setPlaybackVolume(100);
        this.f163868a.registerAudioFrameObserver(null);
        this.f163868a.setAudioProfile(AudioProfileType.AUDIO_PROFILE_DEFAULT);
        this.f163868a.setAudioScenario(AudioScenarioType.DEFAULT);
        this.f163868a.setCaptureVolume(100);
        AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
        AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
        this.f163868a.disableAudioFrameCallback(audioFrameCallbackMethod);
        this.f163868a.disableAudioProcessor(audioProcessorMethod);
        this.f163868a.registerAudioFrameObserver(null);
        this.f163868a.registerAudioProcessor(null);
        this.f163868a.enableAudioPropertiesReport(new AudioPropertiesConfig(0));
        this.f163868a.setEarMonitorMode(EarMonitorMode.EAR_MONITOR_MODE_OFF);
        this.f163868a.setEarMonitorVolume(100);
        this.f163868a.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_DEFAULT);
        this.f163868a.stopAudioCapture();
    }

    /* JADX INFO: renamed from: c */
    public RTCEngineEx m183524c(EngineConfig engineConfig, String str, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx, boolean z) {
        if (this.f163868a != null && (z || !TextUtils.equals(this.f163869b, str))) {
            RTCRoomEx rTCRoomEx = this.f163870c;
            if (rTCRoomEx != null) {
                rTCRoomEx.leaveRoom();
                this.f163870c.destroy();
                this.f163870c = null;
            }
            RTCEngineEx.destroyRTCEngineEx();
            this.f163868a = null;
        }
        if (this.f163868a == null) {
            this.f163868a = RTCEngineEx.createRTCEngineEx(engineConfig, iRTCEngineEventHandler, iRTCEngineEventHandlerEx);
        } else {
            RTCRoomEx rTCRoomEx2 = this.f163870c;
            if (rTCRoomEx2 != null) {
                rTCRoomEx2.leaveRoom();
                this.f163870c.destroy();
                this.f163870c = null;
            }
            this.f163868a.setRtcVideoEventHandler(iRTCEngineEventHandler);
            this.f163868a.setRtcVideoEventHandlerEx(iRTCEngineEventHandlerEx);
        }
        this.f163869b = str;
        return this.f163868a;
    }

    /* JADX INFO: renamed from: d */
    public void m183525d(RTCRoomEx rTCRoomEx) {
        this.f163870c = rTCRoomEx;
    }
}
