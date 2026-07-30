package p153l;

import android.text.TextUtils;
import com.p074ss.bytertc.engine.RTCEngineEx;
import com.p074ss.bytertc.engine.RTCRoomEx;
import com.p074ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p074ss.bytertc.engine.data.AudioProcessorMethod;
import com.p074ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p074ss.bytertc.engine.data.AudioRoute;
import com.p074ss.bytertc.engine.data.EarMonitorMode;
import com.p074ss.bytertc.engine.data.EngineConfig;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p074ss.bytertc.engine.type.AudioProfileType;
import com.p074ss.bytertc.engine.type.AudioScenarioType;

/* JADX INFO: loaded from: classes8.dex */
public class wmp0 {

    /* JADX INFO: renamed from: d */
    private static volatile wmp0 f189819d;

    /* JADX INFO: renamed from: a */
    private RTCEngineEx f189820a;

    /* JADX INFO: renamed from: b */
    private String f189821b;

    /* JADX INFO: renamed from: c */
    private RTCRoomEx f189822c;

    private wmp0() {
    }

    /* JADX INFO: renamed from: b */
    public static wmp0 m207117b() {
        if (f189819d == null) {
            synchronized (wmp0.class) {
                try {
                    if (f189819d == null) {
                        f189819d = new wmp0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f189819d;
    }

    /* JADX INFO: renamed from: a */
    public void m207118a(boolean z) {
        RTCEngineEx rTCEngineEx = this.f189820a;
        if (rTCEngineEx == null) {
            return;
        }
        if (z) {
            RTCEngineEx.destroyRTCEngineEx();
            this.f189820a = null;
            return;
        }
        rTCEngineEx.setRtcVideoEventHandler(null);
        this.f189820a.setRtcVideoEventHandlerEx(null);
        this.f189820a.setPlaybackVolume(100);
        this.f189820a.registerAudioFrameObserver(null);
        this.f189820a.setAudioProfile(AudioProfileType.AUDIO_PROFILE_DEFAULT);
        this.f189820a.setAudioScenario(AudioScenarioType.DEFAULT);
        this.f189820a.setCaptureVolume(100);
        AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
        AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
        this.f189820a.disableAudioFrameCallback(audioFrameCallbackMethod);
        this.f189820a.disableAudioProcessor(audioProcessorMethod);
        this.f189820a.registerAudioFrameObserver(null);
        this.f189820a.registerAudioProcessor(null);
        this.f189820a.enableAudioPropertiesReport(new AudioPropertiesConfig(0));
        this.f189820a.setEarMonitorMode(EarMonitorMode.EAR_MONITOR_MODE_OFF);
        this.f189820a.setEarMonitorVolume(100);
        this.f189820a.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_DEFAULT);
        this.f189820a.stopAudioCapture();
    }

    /* JADX INFO: renamed from: c */
    public RTCEngineEx m207119c(EngineConfig engineConfig, String str, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx, boolean z) {
        if (this.f189820a != null && (z || !TextUtils.equals(this.f189821b, str))) {
            RTCRoomEx rTCRoomEx = this.f189822c;
            if (rTCRoomEx != null) {
                rTCRoomEx.leaveRoom();
                this.f189822c.destroy();
                this.f189822c = null;
            }
            RTCEngineEx.destroyRTCEngineEx();
            this.f189820a = null;
        }
        if (this.f189820a == null) {
            this.f189820a = RTCEngineEx.createRTCEngineEx(engineConfig, iRTCEngineEventHandler, iRTCEngineEventHandlerEx);
        } else {
            RTCRoomEx rTCRoomEx2 = this.f189822c;
            if (rTCRoomEx2 != null) {
                rTCRoomEx2.leaveRoom();
                this.f189822c.destroy();
                this.f189822c = null;
            }
            this.f189820a.setRtcVideoEventHandler(iRTCEngineEventHandler);
            this.f189820a.setRtcVideoEventHandlerEx(iRTCEngineEventHandlerEx);
        }
        this.f189821b = str;
        return this.f189820a;
    }

    /* JADX INFO: renamed from: d */
    public void m207120d(RTCRoomEx rTCRoomEx) {
        this.f189822c = rTCRoomEx;
    }
}
