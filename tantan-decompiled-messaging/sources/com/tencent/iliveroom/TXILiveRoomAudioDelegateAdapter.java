package com.tencent.iliveroom;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXILiveRoomAudioDelegateAdapter {
    public void onEffectPlayError(int i, int i2) {
    }

    public void onEffectPlayFinish(int i) {
    }

    public void onMusicPlayBegin() {
    }

    public void onMusicPlayError(int i) {
    }

    public void onMusicPlayFinish() {
    }

    public boolean onPlayPcmData(long j, TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame) {
        return true;
    }

    public boolean onPlaybackAudioFrame(TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame) {
        return true;
    }

    public boolean onRecordAudioFrame(TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame) {
        return true;
    }

    public void onReportAudioVolumeIndicationOfSpeakers(List<TXIAudioVolumeInfo> list) {
    }
}
