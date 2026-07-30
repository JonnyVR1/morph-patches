package com.p069ss.bytertc.engine;

/* JADX INFO: loaded from: classes13.dex */
public interface IRTCAudioDeviceManagerEx {

    public interface IRTCAudioDeviceEventHandler {
        void onRecordingAudioVolumeIndication(int i);
    }

    void setEnableSpeakerphone(boolean z);

    int startAudioCaptureDeviceTest(int i);

    int startAudioPlaybackDeviceTest(String str, int i);

    int stopAudioCaptureDeviceTest();

    int stopAudioPlaybackDeviceTest();
}
