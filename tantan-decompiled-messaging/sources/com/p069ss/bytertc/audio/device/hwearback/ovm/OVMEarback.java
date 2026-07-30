package com.p069ss.bytertc.audio.device.hwearback.ovm;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import com.p069ss.bytertc.audio.device.base.ManufacturerChecker;
import com.p069ss.bytertc.audio.device.hwearback.BaseEarback;
import com.p069ss.bytertc.audio.device.hwearback.SlientPlayer;
import com.p069ss.bytertc.audio.device.hwearback.ovm.OVMEarback;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OVMEarback extends BaseEarback {
    private static final int EVENT_KEY_RECORDING_START = 1100;
    private static final int EVENT_KEY_RECORDING_STOP = 1103;
    private static final String TAG = "OVMEarback";
    private final OVMClient client;
    private boolean isAudioParamsSupported;
    private boolean isRecordingStarted;
    private final SlientPlayer slientPlayer;

    public OVMEarback(Context context, WebRtcAudioEarBack webRtcAudioEarBack) {
        super(context, webRtcAudioEarBack);
        this.isRecordingStarted = true;
        this.isAudioParamsSupported = false;
        this.client = OVMClient.initialize(context);
        this.slientPlayer = new SlientPlayer();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80831a(OVMEarback oVMEarback, int i) {
        oVMEarback.getClass();
        RXLogging.m5690i(TAG, "connection result: " + i);
        if (i != 1001) {
            oVMEarback.onInitResult(false);
            return;
        }
        oVMEarback.client.openKTVDevice();
        oVMEarback.client.resetKTVParamsAndUpdate();
        oVMEarback.webRtcAudioEarBack.onHardwareEarbackSupportParamsGet(oVMEarback.getReportParameters());
        oVMEarback.isAudioParamsSupported = oVMEarback.checkAudioParams();
        oVMEarback.onInitResult(true);
    }

    private boolean checkAudioParams() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        StringBuffer stringBuffer = new StringBuffer("parse params: ");
        String karaokeSupportParameters = this.client.getKaraokeSupportParameters();
        stringBuffer.append(this.client.getKaraokeSupportParameters());
        HardwareEarbackParams hardwareEarbackParams = new DefaultHardwareParamsParser().parse(karaokeSupportParameters);
        if (hardwareEarbackParams == null) {
            z = false;
        } else {
            List<HardwareEarbackParams.Play> list = hardwareEarbackParams.playParamsList;
            if (list != null && list.size() > 0) {
                stringBuffer.append(", playout params size: ");
                stringBuffer.append(hardwareEarbackParams.playParamsList.size());
                z2 = false;
                for (HardwareEarbackParams.Play play : hardwareEarbackParams.playParamsList) {
                    stringBuffer.append("{streamType: ");
                    stringBuffer.append(play.streamType);
                    stringBuffer.append(", sampleRate: ");
                    stringBuffer.append(play.sampleRate);
                    stringBuffer.append(", format: ");
                    stringBuffer.append(play.format);
                    stringBuffer.append(", flags: ");
                    stringBuffer.append(play.flags);
                    stringBuffer.append("}");
                    boolean z3 = play.streamType == 3 && play.format == 2 && ((i2 = play.sampleRate) == 44100 || i2 == 48000);
                    if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.XM || ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.RM) {
                        z3 &= play.version > 0;
                    }
                    z2 |= z3;
                    if (z2) {
                        RXLogging.m5690i(TAG, "updating slientPlayer params: " + play.sampleRate + ", " + play.flags);
                        this.slientPlayer.setSampleRate(play.sampleRate);
                        this.slientPlayer.setRequireDeepBuffer((play.flags & 8) == 8);
                        break;
                    }
                }
            } else {
                stringBuffer.append(", playout params parsed null.");
                z2 = false;
            }
            List<HardwareEarbackParams.Record> list2 = hardwareEarbackParams.recordParamsList;
            if (list2 == null || list2.size() <= 0) {
                stringBuffer.append(", record params parsed null.");
                z = false;
            } else {
                stringBuffer.append(", record params size: ");
                stringBuffer.append(hardwareEarbackParams.recordParamsList.size());
                boolean z4 = false;
                for (HardwareEarbackParams.Record record : hardwareEarbackParams.recordParamsList) {
                    stringBuffer.append("{sampleRate: ");
                    stringBuffer.append(record.sampleRate);
                    stringBuffer.append(", format: ");
                    stringBuffer.append(record.format);
                    stringBuffer.append(", audioSource: ");
                    stringBuffer.append(record.source);
                    stringBuffer.append(", flags: ");
                    stringBuffer.append(record.flags);
                    stringBuffer.append("}");
                    boolean z5 = record.format == 2 && record.sampleRate == 48000 && ((i = record.source) == 1 || i == 0) && (record.flags & 1) == 1;
                    if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.XM || ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.RM) {
                        z5 &= record.version > 0;
                    }
                    z4 |= z5;
                }
                z = z2 & z4;
            }
        }
        stringBuffer.append(", canOpenEarback: ");
        stringBuffer.append(z);
        RXLogging.m5690i(TAG, stringBuffer.toString());
        return z;
    }

    private String getReportParameters() {
        String karaokeSupportParameters = this.client.getKaraokeSupportParameters();
        try {
            JSONObject jSONObject = new JSONObject(karaokeSupportParameters);
            jSONObject.put(WBConstants.AUTH_PARAMS_VERSION, this.client.getVersion());
            return jSONObject.toString();
        } catch (Throwable unused) {
            RXLogging.m5688e(TAG, "parse report params error, not json format");
            return karaokeSupportParameters;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000d, B:16:0x001c, B:14:0x0014, B:17:0x0022), top: B:22:0x0001 }] */
    private synchronized void updatePlayerState() {
        try {
            SlientPlayer slientPlayer = this.slientPlayer;
            if (slientPlayer == null) {
                return;
            }
            if (slientPlayer.isPlaying() && this.isRecordingStarted) {
                this.slientPlayer.play();
            } else if (getState() == BaseEarback.EarbackState.RUNNING) {
                this.slientPlayer.play();
            } else {
                this.slientPlayer.stop();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return -1;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public boolean onClose() {
        this.client.setPlayFeedbackParam(0);
        return true;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i, int i2) {
        if (i == EVENT_KEY_RECORDING_START) {
            this.isRecordingStarted = true;
            updatePlayerState();
        } else if (i == 1103) {
            this.isRecordingStarted = false;
            updatePlayerState();
        }
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public void onInit() {
        this.client.setAuthCallback(new OVMAuthManager.AuthCallback() { // from class: l.e050
            @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
            public final void onResult(int i) {
                OVMEarback.m80831a(this.f88547a, i);
            }
        });
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public boolean onIsSupportCall() {
        return this.client.isSupportedAndAuth() && this.isAudioParamsSupported;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public boolean onOpen() {
        this.client.setPlayFeedbackParam(1);
        return true;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public void onRelease() {
        this.client.setPlayFeedbackParam(0);
        this.client.setMixerSoundType(0);
        this.client.setEqualizerType(0);
        this.client.closeKTVDevice();
        this.client.release();
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.BaseEarback
    public synchronized void onStateChanged(BaseEarback.EarbackState earbackState, BaseEarback.EarbackState earbackState2) {
        super.onStateChanged(earbackState, earbackState2);
        updatePlayerState();
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i) {
        this.client.setMixerSoundType(i);
        return 0;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i) {
        this.client.setEqualizerType(i);
        return 0;
    }

    @Override // com.p069ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i) {
        int i2 = ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP ? 12 : 15;
        this.client.setMicVolParam(Math.max(Math.min((int) ((i / 100.0f) * i2), i2), 0));
        return 0;
    }
}
