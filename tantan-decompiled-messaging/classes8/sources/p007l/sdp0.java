package p007l;

import android.text.TextUtils;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.RTCEngineEx;
import com.ss.bytertc.engine.RTCRoomEx;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EngineConfig;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class sdp0 {

    /* JADX INFO: renamed from: d */
    private static volatile sdp0 f4134d;

    /* JADX INFO: renamed from: a */
    private RTCEngineEx f4135a;

    /* JADX INFO: renamed from: b */
    private String f4136b;

    /* JADX INFO: renamed from: c */
    private RTCRoomEx f4137c;

    private sdp0() {
    }

    /* JADX INFO: renamed from: b */
    public static sdp0 m10650b() {
        if (f4134d == null) {
            synchronized (sdp0.class) {
                try {
                    if (f4134d == null) {
                        f4134d = new sdp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4134d;
    }

    /* JADX INFO: renamed from: a */
    public void m10651a(boolean z) {
        RTCEngineEx rTCEngineEx = this.f4135a;
        if (rTCEngineEx == null) {
            return;
        }
        if (z) {
            RTCEngineEx.destroyRTCEngineEx();
            this.f4135a = null;
            return;
        }
        rTCEngineEx.setRtcVideoEventHandler((IRTCEngineEventHandler) null);
        this.f4135a.setRtcVideoEventHandlerEx((IRTCEngineEventHandlerEx) null);
        this.f4135a.setPlaybackVolume(100);
        this.f4135a.registerAudioFrameObserver((IAudioFrameObserver) null);
        this.f4135a.setAudioProfile(AudioProfileType.AUDIO_PROFILE_DEFAULT);
        this.f4135a.setAudioScenario(AudioScenarioType.DEFAULT);
        this.f4135a.setCaptureVolume(100);
        AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
        AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
        this.f4135a.disableAudioFrameCallback(audioFrameCallbackMethod);
        this.f4135a.disableAudioProcessor(audioProcessorMethod);
        this.f4135a.registerAudioFrameObserver((IAudioFrameObserver) null);
        this.f4135a.registerAudioProcessor((IAudioFrameProcessor) null);
        this.f4135a.enableAudioPropertiesReport(new AudioPropertiesConfig(0));
        this.f4135a.setEarMonitorMode(EarMonitorMode.EAR_MONITOR_MODE_OFF);
        this.f4135a.setEarMonitorVolume(100);
        this.f4135a.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_DEFAULT);
        this.f4135a.stopAudioCapture();
    }

    /* JADX INFO: renamed from: c */
    public RTCEngineEx m10652c(EngineConfig engineConfig, String str, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx, boolean z) {
        if (this.f4135a != null && (z || !TextUtils.equals(this.f4136b, str))) {
            RTCRoomEx rTCRoomEx = this.f4137c;
            if (rTCRoomEx != null) {
                rTCRoomEx.leaveRoom();
                this.f4137c.destroy();
                this.f4137c = null;
            }
            RTCEngineEx.destroyRTCEngineEx();
            this.f4135a = null;
        }
        if (this.f4135a == null) {
            this.f4135a = RTCEngineEx.createRTCEngineEx(engineConfig, iRTCEngineEventHandler, iRTCEngineEventHandlerEx);
        } else {
            RTCRoomEx rTCRoomEx2 = this.f4137c;
            if (rTCRoomEx2 != null) {
                rTCRoomEx2.leaveRoom();
                this.f4137c.destroy();
                this.f4137c = null;
            }
            this.f4135a.setRtcVideoEventHandler(iRTCEngineEventHandler);
            this.f4135a.setRtcVideoEventHandlerEx(iRTCEngineEventHandlerEx);
        }
        this.f4136b = str;
        return this.f4135a;
    }

    /* JADX INFO: renamed from: d */
    public void m10653d(RTCRoomEx rTCRoomEx) {
        this.f4137c = rTCRoomEx;
    }
}
