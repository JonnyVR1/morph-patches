package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import android.media.AudioRecord;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class TXCAudioSysRecord implements Runnable {
    private static final String TAG = "AudioCenter:".concat(TXCAudioSysRecord.class.getSimpleName());
    private static TXCAudioSysRecord instance = null;
    private Context mContext;
    private AudioRecord mMic;
    private WeakReference<InterfaceC14153c> mWeakRefListener;
    private int mSampleRate = 48000;
    private int mChannels = 1;
    private int mBits = 16;
    private int mAECType = 0;
    private byte[] mRecordBuffer = null;
    private Thread mRecordThread = null;
    private boolean mIsRunning = false;
    private boolean mIsCapFirstFrame = false;
    private boolean mSendMuteData = false;
    private AtomicBoolean mPause = new AtomicBoolean(false);
    private Object threadMutex = new Object();

    private TXCAudioSysRecord() {
        nativeClassInit();
    }

    public static TXCAudioSysRecord getInstance() {
        if (instance == null) {
            synchronized (TXCAudioSysRecord.class) {
                try {
                    if (instance == null) {
                        instance = new TXCAudioSysRecord();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void init() {
        int i = this.mSampleRate;
        int i2 = this.mChannels;
        int i3 = this.mBits;
        int i4 = this.mAECType;
        String str = TAG;
        TXCLog.m84152i(str, String.format("audio record sampleRate = %d, channels = %d, bits = %d, aectype = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        int i5 = i2 == 1 ? 16 : 12;
        int i6 = i3 == 8 ? 3 : 2;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i5, i6);
        try {
            TXCLog.m84152i(str, "audio record type: system normal");
            this.mMic = new AudioRecord(1, i, i5, i6, minBufferSize * 2);
        } catch (IllegalArgumentException e) {
            TXCLog.m84150e(TAG, "create AudioRecord failed.", e);
        }
        AudioRecord audioRecord = this.mMic;
        if (audioRecord == null || audioRecord.getState() != 1) {
            TXCLog.m84149e(TAG, "audio record: initialize the mic failed.");
            uninit();
            onRecordError(-1, "microphone permission denied!");
            return;
        }
        int i7 = ((i2 * 1024) * i3) / 8;
        if (i7 > minBufferSize) {
            this.mRecordBuffer = new byte[minBufferSize];
        } else {
            this.mRecordBuffer = new byte[i7];
        }
        TXCLog.m84152i(TAG, String.format("audio record: mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(minBufferSize), Integer.valueOf(this.mRecordBuffer.length), Integer.valueOf(this.mMic.getState())));
        AudioRecord audioRecord2 = this.mMic;
        if (audioRecord2 != null) {
            try {
                audioRecord2.startRecording();
            } catch (Exception e2) {
                TXCLog.m84150e(TAG, "mic startRecording failed.", e2);
                onRecordError(-1, "start recording failed!");
            }
        }
    }

    private native void nativeClassInit();

    private native void nativeSendSysRecordAudioData(byte[] bArr, int i, int i2, int i3, int i4);

    private void onRecordError(int i, String str) {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.mWeakRefListener;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordError(i, str);
        } else {
            TXCLog.m84149e(TAG, "onRecordError:no callback");
        }
    }

    private void onRecordPcmData(byte[] bArr, int i, long j) {
        WeakReference<InterfaceC14153c> weakReference = this.mWeakRefListener;
        InterfaceC14153c interfaceC14153c = weakReference != null ? weakReference.get() : null;
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordPCM(bArr, i, j);
        } else {
            TXCLog.m84149e(TAG, "onRecordPcmData:no callback");
        }
    }

    private void onRecordStart() {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.mWeakRefListener;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordStart();
        } else {
            TXCLog.m84149e(TAG, "onRecordStart:no callback");
        }
    }

    private void onRecordStop() {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.mWeakRefListener;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordStop();
        } else {
            TXCLog.m84149e(TAG, "onRecordStop:no callback");
        }
    }

    private void uninit() {
        if (this.mMic != null) {
            TXCLog.m84152i(TAG, "stop mic");
            try {
                this.mMic.setRecordPositionUpdateListener(null);
                this.mMic.stop();
                this.mMic.release();
            } catch (Exception e) {
                TXCLog.m84150e(TAG, "stop AudioRecord failed.", e);
            }
        }
        this.mMic = null;
        this.mRecordBuffer = null;
        this.mIsCapFirstFrame = false;
    }

    public synchronized boolean isRecording() {
        return this.mIsRunning;
    }

    public void pause(boolean z) {
        TXCLog.m84152i(TAG, "system audio record pause");
        this.mPause.set(true);
        this.mSendMuteData = z;
    }

    public void resume() {
        TXCLog.m84152i(TAG, "system audio record resume");
        this.mPause.set(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        TXCAudioSysRecord tXCAudioSysRecord;
        if (!this.mIsRunning) {
            TXCLog.m84156w(TAG, "audio record: abandom start audio sys record thread!");
            return;
        }
        onRecordStart();
        TXCLog.m84152i(TAG, "start capture audio data ...,mIsRunning:" + this.mIsRunning + " Thread.interrupted:" + Thread.interrupted() + " mMic:" + this.mMic);
        init();
        int i = 0;
        int i2 = 0;
        while (this.mIsRunning && !Thread.interrupted() && this.mMic != null && i <= 5) {
            System.currentTimeMillis();
            AudioRecord audioRecord = this.mMic;
            byte[] bArr = this.mRecordBuffer;
            int i3 = audioRecord.read(bArr, i2, bArr.length - i2);
            if (i3 == this.mRecordBuffer.length - i2) {
                if (!this.mIsCapFirstFrame) {
                    this.onRecordError(-6, "First frame captured#");
                    this.mIsCapFirstFrame = true;
                }
                if (this.mSendMuteData) {
                    Arrays.fill(this.mRecordBuffer, (byte) 0);
                }
                if (!this.mPause.get() || this.mSendMuteData) {
                    byte[] bArr2 = this.mRecordBuffer;
                    this.onRecordPcmData(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
                    byte[] bArr3 = this.mRecordBuffer;
                    tXCAudioSysRecord = this;
                    tXCAudioSysRecord.nativeSendSysRecordAudioData(bArr3, bArr3.length, this.mSampleRate, this.mChannels, this.mBits);
                } else {
                    tXCAudioSysRecord = this;
                }
                i = 0;
                i2 = 0;
                this = tXCAudioSysRecord;
            } else if (i3 <= 0) {
                TXCLog.m84149e(TAG, "read pcm error, len =" + i3);
                i++;
            } else {
                i2 += i3;
            }
        }
        TXCAudioSysRecord tXCAudioSysRecord2 = this;
        TXCLog.m84147d(TAG, "stop capture audio data ...,mIsRunning:" + tXCAudioSysRecord2.mIsRunning + " mMic:" + tXCAudioSysRecord2.mMic + " nFailedCount:" + i);
        tXCAudioSysRecord2.uninit();
        if (i > 5) {
            tXCAudioSysRecord2.onRecordError(-1, "read data failed!");
        } else {
            tXCAudioSysRecord2.onRecordStop();
        }
    }

    public synchronized void setAudioRecordListener(InterfaceC14153c interfaceC14153c) {
        try {
            if (interfaceC14153c == null) {
                this.mWeakRefListener = null;
            } else {
                this.mWeakRefListener = new WeakReference<>(interfaceC14153c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void start(int i, int i2, int i3) {
        String str = TAG;
        TXCLog.m84152i(str, "start");
        synchronized (this.threadMutex) {
            stop();
            this.mSampleRate = i;
            this.mChannels = i2;
            this.mBits = i3;
            this.mIsRunning = true;
            Thread thread = new Thread(this, "AudioSysRecord Thread");
            this.mRecordThread = thread;
            thread.start();
        }
        TXCLog.m84152i(str, "start ok");
    }

    public void stop() {
        String str;
        TXCLog.m84152i(TAG, "stop");
        synchronized (this.threadMutex) {
            this.mIsRunning = false;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Thread thread = this.mRecordThread;
            if (thread == null || !thread.isAlive() || Thread.currentThread().getId() == this.mRecordThread.getId()) {
                str = TAG;
                TXCLog.m84152i(str, "stop ok,stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
                this.mRecordThread = null;
            } else {
                try {
                    this.mRecordThread.join();
                } catch (Exception e) {
                    TXCLog.m84149e(TAG, "record stop Exception: " + e.getMessage());
                }
                str = TAG;
                TXCLog.m84152i(str, "stop ok,stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
                this.mRecordThread = null;
            }
            throw th;
        }
        TXCLog.m84152i(str, "stop ok");
    }
}
