package com.momo.mcamera.util.fft;

import android.media.AudioRecord;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes8.dex */
public class AudioRecorder {
    public static final int audioFormat = 2;
    public static final int channelConfig = 16;
    public static final int sampleRate = 44100;
    private int accuracy;
    private short[] buffer;
    private int bufferReadResult;
    private int bufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
    private AudioRecord audioRecorder = new AudioRecord(0, 44100, 16, 2, this.bufferSize * 10);

    public int getBufferReadResult() {
        return this.bufferReadResult;
    }

    public short[] getSamples() {
        int i = this.accuracy;
        short[] sArr = new short[i];
        this.buffer = sArr;
        this.bufferReadResult = this.audioRecorder.read(sArr, 0, i);
        return this.buffer;
    }

    public void setAccuracy(int i) {
        this.accuracy = i;
    }

    public void startRecorder() {
        try {
            this.audioRecorder.startRecording();
        } catch (Exception e) {
            MDLog.m7445e("Recording failed", e.toString());
        }
    }

    public void stopRecorder() {
        try {
            this.audioRecorder.stop();
            this.audioRecorder.release();
        } catch (IllegalStateException e) {
            MDLog.m7445e("Stop failed", e.toString());
        }
    }
}
