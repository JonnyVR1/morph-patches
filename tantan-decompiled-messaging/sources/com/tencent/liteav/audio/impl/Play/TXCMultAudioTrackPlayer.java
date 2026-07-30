package com.tencent.liteav.audio.impl.Play;

import android.content.Context;
import android.media.AudioTrack;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class TXCMultAudioTrackPlayer {
    private static final String TAG = "AudioCenter:".concat(TXCMultAudioTrackPlayer.class.getSimpleName());
    private int mAudioMode;
    private AudioTrackThread mAudioThread;
    private volatile boolean mAudioTrackStarted;
    private int mBits;
    private int mChannel;
    private Context mContext;
    private volatile boolean mIsStarted;
    private boolean mMute;
    private int mSampleRate;

    public class AudioTrackThread extends Thread {
        volatile boolean mIsLooping;

        public AudioTrackThread(String str) {
            super(str);
            this.mIsLooping = false;
        }

        public void startLoop() {
            this.mIsLooping = true;
        }

        public void stopLoop() {
            this.mIsLooping = false;
        }
    }

    public static class TXCMultAudioTrackPlayerHolder {
        private static TXCMultAudioTrackPlayer instance = new TXCMultAudioTrackPlayer();

        private TXCMultAudioTrackPlayerHolder() {
        }

        public static TXCMultAudioTrackPlayer getInstance() {
            return instance;
        }
    }

    private TXCMultAudioTrackPlayer() {
        this.mAudioThread = null;
        this.mMute = false;
        this.mIsStarted = false;
        this.mAudioTrackStarted = false;
        this.mContext = null;
        this.mAudioMode = 0;
        this.mSampleRate = 48000;
        this.mChannel = 2;
        this.mBits = 16;
        nativeClassInit();
    }

    public static TXCMultAudioTrackPlayer getInstance() {
        return TXCMultAudioTrackPlayerHolder.getInstance();
    }

    private native void nativeClassInit();

    /* JADX INFO: Access modifiers changed from: private */
    public native byte[] nativeGetMixedTracksDataToAudioTrack();

    public boolean isPlaying() {
        return this.mIsStarted;
    }

    public synchronized void setAudioMode(Context context, int i) {
        try {
            this.mContext = context;
            this.mAudioMode = i;
            if (this.mAudioTrackStarted) {
                TXCLog.m82973w(TAG, "mult-track-player setAudioRoute~");
            } else {
                TXCLog.m82973w(TAG, "mult-track-player do'not setAudioRoute~");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMute(boolean z) {
        this.mMute = z;
    }

    public void start() {
        String str = TAG;
        TXCLog.m82973w(str, "mult-track-player start!");
        if (this.mIsStarted) {
            TXCLog.m82966e(str, "mult-track-player can not start because of has started!");
            return;
        }
        if (this.mSampleRate == 0 || this.mChannel == 0) {
            TXCLog.m82966e(str, "strat mult-track-player failed with invalid audio info , samplerate:" + this.mSampleRate + ", channels:" + this.mChannel);
            return;
        }
        this.mIsStarted = true;
        if (this.mAudioThread == null) {
            AudioTrackThread audioTrackThread = new AudioTrackThread("AUDIO_TRACK") { // from class: com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        int i = TXCMultAudioTrackPlayer.this.mChannel == 1 ? 2 : 3;
                        int i2 = TXCMultAudioTrackPlayer.this.mBits == 8 ? 3 : 2;
                        int minBufferSize = AudioTrack.getMinBufferSize(TXCMultAudioTrackPlayer.this.mSampleRate, i, i2);
                        AudioTrack audioTrack = new AudioTrack(3, TXCMultAudioTrackPlayer.this.mSampleRate, i, i2, minBufferSize, 1);
                        TXCLog.m82969i(TXCMultAudioTrackPlayer.TAG, "create audio track, samplerate:" + TXCMultAudioTrackPlayer.this.mSampleRate + ", channels:" + TXCMultAudioTrackPlayer.this.mChannel + ", bits:" + TXCMultAudioTrackPlayer.this.mBits + " mMinBufferLength:" + minBufferSize);
                        try {
                            audioTrack.play();
                            TXCMultAudioTrackPlayer.this.mAudioTrackStarted = true;
                            TXCMultAudioTrackPlayer tXCMultAudioTrackPlayer = TXCMultAudioTrackPlayer.this;
                            tXCMultAudioTrackPlayer.setAudioMode(tXCMultAudioTrackPlayer.mContext, TXCMultAudioTrackPlayer.this.mAudioMode);
                            int i3 = 100;
                            int length = 0;
                            while (this.mIsLooping) {
                                byte[] bArrNativeGetMixedTracksDataToAudioTrack = TXCMultAudioTrackPlayer.this.nativeGetMixedTracksDataToAudioTrack();
                                if (bArrNativeGetMixedTracksDataToAudioTrack == null || bArrNativeGetMixedTracksDataToAudioTrack.length <= 0) {
                                    try {
                                        Thread.sleep(5L);
                                    } catch (InterruptedException unused) {
                                    }
                                } else {
                                    TXCAudioEngine.onCorePlayPcmData(bArrNativeGetMixedTracksDataToAudioTrack, 0L, TXCMultAudioTrackPlayer.this.mSampleRate, TXCMultAudioTrackPlayer.this.mChannel);
                                    if (TXCMultAudioTrackPlayer.this.mMute) {
                                        Arrays.fill(bArrNativeGetMixedTracksDataToAudioTrack, (byte) 0);
                                    }
                                    if (i3 != 0 && length < 800) {
                                        int length2 = bArrNativeGetMixedTracksDataToAudioTrack.length / 2;
                                        short[] sArr = new short[length2];
                                        ByteBuffer.wrap(bArrNativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                                        for (int i4 = 0; i4 < length2; i4++) {
                                            sArr[i4] = (short) (sArr[i4] / i3);
                                        }
                                        ByteBuffer.wrap(bArrNativeGetMixedTracksDataToAudioTrack).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
                                        length += bArrNativeGetMixedTracksDataToAudioTrack.length / ((TXCMultAudioTrackPlayer.this.mSampleRate * 2) / 1000);
                                        i3 = (i3 * (800 - length)) / 800;
                                    }
                                    audioTrack.write(bArrNativeGetMixedTracksDataToAudioTrack, 0, bArrNativeGetMixedTracksDataToAudioTrack.length);
                                }
                            }
                            try {
                                audioTrack.pause();
                                audioTrack.flush();
                                audioTrack.stop();
                                audioTrack.release();
                            } catch (Exception e) {
                                TXCLog.m82967e(TXCMultAudioTrackPlayer.TAG, "stop AudioTrack failed.", e);
                            }
                            TXCLog.m82966e(TXCMultAudioTrackPlayer.TAG, "mult-player thread stop finish!");
                        } catch (Exception e2) {
                            TXCLog.m82967e(TXCMultAudioTrackPlayer.TAG, "start play failed.", e2);
                        }
                    } catch (Exception e3) {
                        TXCLog.m82967e(TXCMultAudioTrackPlayer.TAG, "create AudioTrack failed.", e3);
                    }
                }
            };
            this.mAudioThread = audioTrackThread;
            audioTrackThread.startLoop();
            this.mAudioThread.start();
        }
        TXCLog.m82973w(str, "mult-track-player thread start finish!");
    }

    public void stop() {
        String str = TAG;
        TXCLog.m82973w(str, "mult-track-player stop!");
        if (!this.mIsStarted) {
            TXCLog.m82973w(str, "mult-track-player can not stop because of not started yet!");
            return;
        }
        AudioTrackThread audioTrackThread = this.mAudioThread;
        if (audioTrackThread != null) {
            audioTrackThread.stopLoop();
            this.mAudioThread = null;
        }
        this.mAudioMode = 0;
        this.mContext = null;
        this.mAudioTrackStarted = false;
        this.mIsStarted = false;
        TXCLog.m82973w(str, "mult-track-player stop finish!");
    }
}
