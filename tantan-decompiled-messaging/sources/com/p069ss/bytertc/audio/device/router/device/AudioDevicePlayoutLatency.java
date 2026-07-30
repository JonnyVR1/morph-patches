package com.p069ss.bytertc.audio.device.router.device;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.bytedance.realx.base.RXLogging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public class AudioDevicePlayoutLatency {
    private static final String TAG = "AudioDevicePlayoutLatency";
    private AudioTrack mAudioTrack = null;
    private int performanceMode = 2;
    private int playoutChannel = 4;

    public AudioDevicePlayoutLatency() {
        RXLogging.m5688e(TAG, "AudioDevicePlayoutLatency Created");
    }

    public int getPlayoutLatency(int i, int i2, int i3) {
        if (i != 8000 && i != 16000 && i != 32000 && i != 44100 && i != 48000) {
            return 0;
        }
        if (i3 == 1 || i3 != 3) {
            this.performanceMode = 1;
        } else {
            this.performanceMode = 2;
        }
        if (i2 == 1 || i2 != 2) {
            this.playoutChannel = 4;
        } else {
            this.playoutChannel = 12;
        }
        int iCeil = ((int) Math.ceil(((double) i) / 200.0d)) * 2 * i2;
        if (iCeil <= 0) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mAudioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(this.playoutChannel).build()).setTransferMode(1).setBufferSizeInBytes(iCeil).setPerformanceMode(this.performanceMode).build();
            } else {
                this.mAudioTrack = new AudioTrack(3, i, this.playoutChannel, 2, iCeil, 1);
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack == null) {
                return 0;
            }
            try {
                Method declaredMethod = audioTrack.getClass().getDeclaredMethod("getLatency", null);
                declaredMethod.setAccessible(true);
                try {
                    int iMax = Math.max(((Integer) declaredMethod.invoke(this.mAudioTrack, null)).intValue(), 0);
                    this.mAudioTrack.release();
                    return iMax;
                } catch (IllegalAccessException unused) {
                    this.mAudioTrack.release();
                    return 0;
                } catch (InvocationTargetException unused2) {
                    this.mAudioTrack.release();
                    return 0;
                }
            } catch (NoSuchMethodException unused3) {
                this.mAudioTrack.release();
                return 0;
            }
        } catch (Exception unused4) {
        }
    }
}
