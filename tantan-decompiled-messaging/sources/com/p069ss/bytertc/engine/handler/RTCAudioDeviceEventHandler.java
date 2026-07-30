package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;

/* JADX INFO: loaded from: classes13.dex */
public class RTCAudioDeviceEventHandler {
    private static final String TAG = "RtcAudioDeviceEventHandler";

    @CalledByNative
    public void OnLoopbackAudioVolumeIndication(int i) {
    }

    @CalledByNative
    public void onRecordingAudioVolumeIndication(int i) {
        IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler audioDeviceManagerEvent = RTCEngineImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i);
        }
    }
}
