package com.p074ss.bytertc.engine;

/* JADX INFO: loaded from: classes11.dex */
public interface IRTCAudioDeviceManager {
    int startAudioDeviceRecordTest(int i);

    int startAudioPlaybackDeviceTest(String str, int i);

    int stopAudioDevicePlayTest();

    int stopAudioDeviceRecordAndPlayTest();

    int stopAudioPlaybackDeviceTest();
}
