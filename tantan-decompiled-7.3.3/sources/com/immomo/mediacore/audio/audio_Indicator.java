package com.immomo.mediacore.audio;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.csx;
import p153l.t9c;

/* JADX INFO: loaded from: classes7.dex */
public class audio_Indicator {
    private static final String TAG = "audio_Indicator";
    private volatile Handler mHandler;
    private volatile HandlerThread mHandlerThread;
    private short abs_max_ = 0;
    private short count_ = 0;
    private char current_level_ = 0;
    private short kUpdateFrequency = 0;
    private LinkedBlockingQueue<short[]> mAudioFrames = new LinkedBlockingQueue<>();
    private MRtcAudioHandler mRtcAudioEventHandler = null;
    private int mInterval = 100;
    private int mUserID = 0;
    private boolean mMute = false;
    private Object mNotifySync = new Object();
    int[] kPermutation = {0, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    protected Set<MRtcAudioHandler> mRtcAudioHandlerCallbackSet = new CopyOnWriteArraySet();

    public class AudioIndicatorHT extends Handler {
        public AudioIndicatorHT(audio_Indicator audio_indicator, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 100) {
                t9c.m189745c(audio_Indicator.TAG, "Unknown message type " + message.what);
            } else {
                audio_Indicator.this.notifyVolumeIndication();
                audio_Indicator.this.mHandler.removeMessages(100);
                audio_Indicator.this.mHandler.sendMessageDelayed(audio_Indicator.this.mHandler.obtainMessage(100, 0, 0, 0), audio_Indicator.this.mInterval);
            }
        }
    }

    public audio_Indicator() {
        this.mHandlerThread = null;
        this.mHandler = null;
        if (this.mHandlerThread == null) {
            this.mHandlerThread = new HandlerThread(TAG, -4);
            this.mHandlerThread.start();
        }
        if (this.mHandler == null) {
            this.mHandler = new AudioIndicatorHT(this, this.mHandlerThread.getLooper());
        }
        if (csx.m112235R().m112394w0() && csx.m112235R().m112397x0() == 1) {
            addMRtcAudioHandler(AudioNcDynamic.getInstance());
            this.mHandler.sendMessage(this.mHandler.obtainMessage(100, 0, 0, 0));
        }
    }

    private void ComputeLevel(short[] sArr, int i) {
        short sWebRtcSpl_MaxAbsValueW16 = WebRtcSpl_MaxAbsValueW16(sArr, i);
        if (sWebRtcSpl_MaxAbsValueW16 > this.abs_max_) {
            this.abs_max_ = sWebRtcSpl_MaxAbsValueW16;
        }
        short s = this.count_;
        this.count_ = (short) (s + 1);
        if (s == this.kUpdateFrequency) {
            this.count_ = (short) 0;
            short s2 = this.abs_max_;
            int i2 = s2 / 1000;
            if (i2 == 0 && s2 > 250) {
                i2 = 1;
            }
            this.current_level_ = (char) this.kPermutation[i2];
            this.abs_max_ = (short) (s2 >> 2);
        }
    }

    private short WebRtcSpl_MaxAbsValueW16(short[] sArr, int i) {
        short s = Short.MIN_VALUE;
        if (sArr != null && i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                short s2 = sArr[i2];
                if (s2 > s) {
                    s = s2;
                }
            }
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVolumeIndication() {
        int size = this.mAudioFrames.size();
        for (int i = 0; i < size; i++) {
            short[] sArrTake = take();
            if (sArrTake != null) {
                ComputeLevel(sArrTake, sArrTake.length);
            }
        }
        synchronized (this.mNotifySync) {
            if (size > 0) {
                try {
                    if (!this.mRtcAudioHandlerCallbackSet.isEmpty()) {
                        AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[1];
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        audioVolumeWeight.uid = this.mUserID;
                        if (this.mMute) {
                            audioVolumeWeight.volume = 0.0f;
                        } else {
                            audioVolumeWeight.volume = (this.current_level_ * 1.0f) / 9.0f;
                        }
                        audioVolumeWeightArr[0] = audioVolumeWeight;
                        Iterator<MRtcAudioHandler> it = this.mRtcAudioHandlerCallbackSet.iterator();
                        while (it.hasNext()) {
                            it.next().onAudioVolumeIndication(audioVolumeWeightArr, 1);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private short[] take() {
        try {
            LinkedBlockingQueue<short[]> linkedBlockingQueue = this.mAudioFrames;
            if (linkedBlockingQueue != null) {
                return linkedBlockingQueue.take();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        synchronized (this.mNotifySync) {
            try {
                this.mRtcAudioHandlerCallbackSet.add(mRtcAudioHandler);
                if (this.mRtcAudioHandlerCallbackSet.isEmpty() && this.mHandler != null) {
                    this.mHandler.removeMessages(100);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void enableAudioVolumeIndication(int i, int i2) {
        this.mInterval = i;
        if (this.mHandler == null || this.mHandlerThread == null) {
            return;
        }
        this.mHandler.removeMessages(100);
        this.mHandler.sendMessage(this.mHandler.obtainMessage(100, 0, 0, 0));
    }

    public void muteAudio(boolean z) {
        this.mMute = z;
        Log.e(TAG, "muteAudio: " + z);
    }

    public void putAudioData(byte[] bArr) {
        synchronized (this.mNotifySync) {
            if (!this.mRtcAudioHandlerCallbackSet.isEmpty() && this.mAudioFrames.size() <= 10) {
                short[] sArr = new short[bArr.length / 2];
                ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
                try {
                    this.mAudioFrames.offer(sArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void release() {
        synchronized (this.mNotifySync) {
            this.mRtcAudioEventHandler = null;
            this.mRtcAudioHandlerCallbackSet.clear();
        }
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler.removeCallbacks(null);
        }
        if (this.mHandlerThread != null) {
            this.mHandlerThread.quit();
        }
        try {
            this.mAudioFrames.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUserID(int i) {
        this.mUserID = i;
    }
}
