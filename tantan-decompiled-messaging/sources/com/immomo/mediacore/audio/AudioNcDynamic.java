package com.immomo.mediacore.audio;

import com.immomo.mediacore.coninf.MRtcAudioHandler;
import p149l.n8c;

/* JADX INFO: loaded from: classes7.dex */
public class AudioNcDynamic implements MRtcAudioHandler {
    private static final String TAG = "AudioNcDynamic";
    private AudioNcDynamicCallBack audioNcDynamicCallBack;
    private long index;
    private long[] vScoreArray;

    public interface AudioNcDynamicCallBack {
        void onAudioDynamic(int i);
    }

    public static class Sigleton {
        private static AudioNcDynamic sInstance = new AudioNcDynamic();

        private Sigleton() {
        }
    }

    private AudioNcDynamic() {
        this.index = 0L;
        this.vScoreArray = new long[30];
    }

    public static AudioNcDynamic getInstance() {
        return Sigleton.sInstance;
    }

    @Override // com.immomo.mediacore.coninf.MRtcAudioHandler
    public void onAudioVolumeIndication(AudioVolumeWeight[] audioVolumeWeightArr, int i) {
        int i2 = (int) (audioVolumeWeightArr[0].volume * 100.0f);
        long[] jArr = this.vScoreArray;
        if (i2 >= 20) {
            long j = this.index;
            this.index = j + 1;
            jArr[(int) (j % 30)] = 1;
        } else {
            long j2 = this.index;
            this.index = 1 + j2;
            jArr[(int) (j2 % 30)] = 0;
        }
        int i3 = 0;
        for (long j3 : this.vScoreArray) {
            i3 = (int) (((long) i3) + j3);
        }
        int i4 = (i3 * 100) / 30;
        AudioNcDynamicCallBack audioNcDynamicCallBack = this.audioNcDynamicCallBack;
        if (audioNcDynamicCallBack != null) {
            audioNcDynamicCallBack.onAudioDynamic(i4);
        }
        n8c.m158483a(TAG, "onAudioVolumeIndication " + i2 + "/ " + i3 + "/" + i4);
    }

    public void setAudioNcDynamicCallBack(AudioNcDynamicCallBack audioNcDynamicCallBack) {
        if (audioNcDynamicCallBack != null) {
            this.audioNcDynamicCallBack = audioNcDynamicCallBack;
        }
    }
}
