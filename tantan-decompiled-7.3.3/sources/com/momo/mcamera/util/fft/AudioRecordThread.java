package com.momo.mcamera.util.fft;

import android.content.Context;
import android.os.Handler;
import com.momo.mcamera.mask.LightningEngineFilter;
import com.momo.mcamera.mask.SoundInputFilter;

/* JADX INFO: loaded from: classes8.dex */
public class AudioRecordThread extends Thread {
    private LightningEngineFilter lightningEngineFilter;
    private int mAccuracy;
    private Context mContext;
    private Handler mHandler;
    private SoundInputFilter mSoundInputFilter;
    private boolean thread_running = true;
    private AudioRecorder mAudioRecorder = new AudioRecorder();
    private Spectrum mSpectrum = new Spectrum();
    private String textureName = "";
    private int textureWidth = 0;
    private int textureHeight = 0;
    private int index = 0;

    public AudioRecordThread(Context context, Handler handler, int i) {
        this.mContext = context;
        this.mHandler = handler;
        this.mAccuracy = i;
    }

    private void getFreqByFFT(FFT fft, short[] sArr) {
        int i;
        float band;
        float[] fArr = new float[this.mAccuracy];
        int i2 = this.index;
        while (true) {
            int bufferReadResult = this.mAudioRecorder.getBufferReadResult();
            i = this.index;
            if (i2 >= bufferReadResult + i) {
                break;
            }
            fArr[i2 - i] = sArr[i2 - i] / 32767.0f;
            i2++;
        }
        int bufferReadResult2 = i + this.mAudioRecorder.getBufferReadResult();
        this.index = bufferReadResult2;
        if (bufferReadResult2 >= this.mAccuracy) {
            this.index = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.mAccuracy;
                band = 0.0f;
                if (i3 >= i4 / 2) {
                    break;
                }
                float fCos = (float) ((Math.cos((((double) i3) * 3.141592653589793d) / ((double) (i4 / 2))) * 0.5d) + 0.5d);
                int i5 = this.mAccuracy;
                if (i3 <= i5 / 2) {
                    band = fCos;
                }
                int i6 = (i5 / 2) + i3;
                fArr[i6] = fArr[i6] * band;
                int i7 = (i5 / 2) - i3;
                fArr[i7] = fArr[i7] * band;
                i3++;
            }
            fArr[0] = 0.0f;
            fft.forward(fArr);
            float[] fArr2 = new float[fft.specSize()];
            int[] iArr = new int[fft.specSize()];
            int i8 = 0;
            for (int i9 = 0; i9 < fft.specSize(); i9++) {
                fArr2[i9] = (float) Math.log10(fft.getBand(i9) + 1.0f);
                iArr[i9] = Math.round(i9 * (44100.0f / this.mAccuracy));
                if (fft.getBand(i9) > band) {
                    band = fft.getBand(i9);
                    i8 = i9;
                }
            }
            Math.round(i8 * (44100.0f / this.mAccuracy));
            try {
                byte[] bArr = new byte[2048];
                for (int i10 = 0; i10 < 2; i10++) {
                    for (int i11 = 0; i11 < 256; i11++) {
                        float f = fArr2[(i10 * 256) + i11] * 128.0f;
                        int i12 = f > 255.0f ? 255 : (int) f;
                        int i13 = (i10 * 1024) + (i11 * 4);
                        bArr[i13] = (byte) (i12 & 255);
                        bArr[i13 + 1] = (byte) ((i12 >> 8) & 255);
                        bArr[i13 + 2] = (byte) (255 & (i12 >> 16));
                        bArr[i13 + 3] = (byte) (i12 >> 24);
                    }
                }
                SoundInputFilter soundInputFilter = this.mSoundInputFilter;
                if (soundInputFilter != null) {
                    soundInputFilter.setSoundBytes(bArr);
                }
                LightningEngineFilter lightningEngineFilter = this.lightningEngineFilter;
                if (lightningEngineFilter != null) {
                    lightningEngineFilter.setTextureData(this.textureName, bArr, this.textureWidth, this.textureHeight);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void restartThread() {
        this.mAudioRecorder.startRecorder();
        this.thread_running = true;
        if (isAlive() || !isInterrupted()) {
            return;
        }
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.thread_running) {
            this.mAudioRecorder.setAccuracy(this.mAccuracy);
            this.mAudioRecorder.startRecorder();
            short[] samples = this.mAudioRecorder.getSamples();
            this.mSpectrum.setSignalSamples(samples);
            getFreqByFFT(new FFT(this.mAccuracy, 44100.0f), samples);
        }
    }

    public void setLightningFilter(String str, int i, int i2, LightningEngineFilter lightningEngineFilter) {
        this.textureName = str;
        this.lightningEngineFilter = lightningEngineFilter;
        this.textureWidth = i;
        this.textureHeight = i2;
    }

    public void setSoundInputFilter(SoundInputFilter soundInputFilter) {
        this.mSoundInputFilter = soundInputFilter;
    }

    public void stopThread() {
        this.mAudioRecorder.stopRecorder();
        this.thread_running = false;
        if (!isAlive() || isInterrupted()) {
            return;
        }
        interrupt();
    }
}
