package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Record.InterfaceC14153c;
import com.tencent.liteav.audio.impl.Record.RunnableC14151a;
import com.tencent.liteav.audio.impl.Record.TXCAudioSysRecord;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXCAudioUGCRecorder implements InterfaceC14153c {
    private static final TXCAudioUGCRecorder INSTANCE;
    private static final String TAG = "AudioCenter:TXCAudioUGCRecorder";
    protected Context mContext;
    private WeakReference<InterfaceC14148f> mWeakRecordListener;
    private final int AAC_SAMPLE_NUM = 1024;
    protected AtomicInteger mSampleRate = new AtomicInteger(48000);
    protected int mChannels = 1;
    protected int mBits = 16;
    protected int mAACFrameLength = (1024 * 16) / 8;
    protected int mReverbType = 0;
    protected int mVoiceChangerType = 0;
    protected int mAECType = 0;
    protected boolean mIsEarphoneOn = false;
    private long mLastPTS = 0;
    private float mVolume = 1.0f;
    private RunnableC14151a mBGMRecorder = null;
    private boolean mEnableBGMRecord = false;
    private int mShouldClearAACDataCnt = 0;
    private boolean mCurBGMRecordFlag = false;
    private AtomicReference<Float> mSpeedRate = new AtomicReference<>(Float.valueOf(1.0f));
    private boolean mIsRunning = false;
    private boolean mIsPause = false;
    private boolean mIsMute = false;
    private final List<byte[]> mEncodedAudioList = new ArrayList();

    static {
        C14215f.m84239f();
        INSTANCE = new TXCAudioUGCRecorder();
    }

    private TXCAudioUGCRecorder() {
        TXCAudioSysRecord.getInstance();
        nativeClassInit();
    }

    public static TXCAudioUGCRecorder getInstance() {
        return INSTANCE;
    }

    private native void nativeClassInit();

    private native void nativeEnableMixMode(boolean z);

    private native void nativeSetChangerType(int i);

    private native void nativeSetReverbType(int i);

    private native void nativeSetSpeedRate(float f);

    private native void nativeSetVolume(float f);

    private native void nativeStartAudioRecord(int i, int i2, int i3);

    private native void nativeStopAudioRecord();

    private synchronized void updateAudioEffector() {
        try {
            boolean z = true;
            if (!this.mEnableBGMRecord && this.mAECType != 1) {
                z = false;
            }
            if (!z) {
                nativeSetReverbType(this.mReverbType);
                nativeSetChangerType(this.mVoiceChangerType);
                if (this.mIsMute) {
                    nativeSetVolume(0.0f);
                } else {
                    nativeSetVolume(this.mVolume);
                }
            }
            if (z) {
                nativeSetVolume(0.0f);
            }
            nativeEnableMixMode(z);
            nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearCache() {
        TXCLog.m84152i(TAG, "clearCache");
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
    }

    public void enableBGMRecord(boolean z) {
        TXCLog.m84152i(TAG, "enableBGMRecord: " + z);
        if (this.mEnableBGMRecord != z && !z) {
            this.mShouldClearAACDataCnt = 2;
        }
        this.mEnableBGMRecord = z;
        updateAudioEffector();
    }

    public int getChannels() {
        return this.mChannels;
    }

    public InterfaceC14148f getListener() {
        WeakReference<InterfaceC14148f> weakReference = this.mWeakRecordListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getSampleRate() {
        return this.mSampleRate.get();
    }

    public boolean isPaused() {
        return this.mIsPause;
    }

    public boolean isRecording() {
        return this.mIsRunning;
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC14153c
    public void onAudioRecordError(int i, String str) {
        TXCLog.m84149e(TAG, "sys audio record error: " + i + ", " + str);
        InterfaceC14148f listener = getListener();
        if (listener != null) {
            listener.onRecordError(i, str);
        }
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC14153c
    public void onAudioRecordPCM(byte[] bArr, int i, long j) {
        byte[] bArr2;
        long j2 = this.mLastPTS;
        if (j2 >= j) {
            j = 2 + j2;
        }
        long jFloatValue = j;
        do {
            synchronized (this.mEncodedAudioList) {
                try {
                    if (this.mEncodedAudioList.isEmpty() || this.mIsPause) {
                        bArr2 = null;
                    } else {
                        byte[] bArr3 = this.mEncodedAudioList.get(0);
                        this.mEncodedAudioList.remove(0);
                        int i2 = this.mShouldClearAACDataCnt;
                        if (i2 > 0) {
                            this.mShouldClearAACDataCnt = i2 - 1;
                            bArr2 = null;
                        } else {
                            bArr2 = bArr3;
                        }
                    }
                    if (bArr2 != null) {
                        this.mLastPTS = jFloatValue;
                        InterfaceC14148f listener = getListener();
                        if (listener != null) {
                            listener.onRecordEncData(bArr2, jFloatValue, this.mSampleRate.get(), this.mChannels, this.mBits);
                        } else {
                            TXCLog.m84149e(TAG, "onAudioRecordPCM listener is null");
                        }
                        int i3 = this.mSampleRate.get();
                        if (i3 > 0) {
                            jFloatValue += (long) ((this.mSpeedRate.get().floatValue() * 1024000.0f) / i3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (bArr2 != null);
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC14153c
    public void onAudioRecordStart() {
        TXCLog.m84152i(TAG, "sys audio record start");
    }

    @Override // com.tencent.liteav.audio.impl.Record.InterfaceC14153c
    public void onAudioRecordStop() {
        TXCLog.m84152i(TAG, "sys audio record stop");
    }

    public void onEncodedData(byte[] bArr) {
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.add(bArr);
        }
    }

    public void pause() {
        TXCLog.m84152i(TAG, "pause");
        TXCAudioEngine.getInstance().pauseLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = true;
        }
    }

    public void resume() {
        TXCLog.m84152i(TAG, "resume");
        TXCAudioEngine.getInstance().resumeLocalAudio();
        synchronized (this.mEncodedAudioList) {
            this.mIsPause = false;
        }
        nativeEnableMixMode(this.mEnableBGMRecord);
        if (this.mIsMute || this.mEnableBGMRecord) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public void setAECType(int i, Context context) {
        TXCLog.m84152i(TAG, "setAECType: " + i);
        this.mAECType = i;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public synchronized void setChangerType(int i) {
        TXCLog.m84152i(TAG, "setChangerType: " + i);
        this.mVoiceChangerType = i;
        nativeSetChangerType(i);
    }

    public void setChannels(int i) {
        TXCLog.m84152i(TAG, "setChannels: " + i);
        this.mChannels = i;
    }

    public synchronized void setListener(InterfaceC14148f interfaceC14148f) {
        try {
            if (interfaceC14148f == null) {
                this.mWeakRecordListener = null;
            } else {
                this.mWeakRecordListener = new WeakReference<>(interfaceC14148f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setMute(boolean z) {
        TXCLog.m84152i(TAG, "setMute: " + z);
        this.mIsMute = z;
        if (z) {
            nativeSetVolume(0.0f);
        } else {
            nativeSetVolume(this.mVolume);
        }
    }

    public synchronized void setReverbType(int i) {
        TXCLog.m84152i(TAG, "setReverbType: " + i);
        this.mReverbType = i;
        nativeSetReverbType(i);
    }

    public void setSampleRate(int i) {
        TXCLog.m84152i(TAG, "setSampleRate: " + i);
        this.mSampleRate.set(i);
    }

    public synchronized void setSpeedRate(float f) {
        TXCLog.m84152i(TAG, "setSpeedRate: " + f);
        this.mSpeedRate.set(Float.valueOf(f));
        nativeSetSpeedRate(this.mSpeedRate.get().floatValue());
    }

    public synchronized void setVolume(float f) {
        try {
            TXCLog.m84152i(TAG, "setVolume: " + f);
            this.mVolume = f;
            if (this.mIsMute) {
                nativeSetVolume(0.0f);
            } else {
                nativeSetVolume(f);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int startRecord(Context context) {
        TXCLog.m84152i(TAG, "startRecord");
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        updateAudioEffector();
        TXCAudioSysRecord.getInstance().setAudioRecordListener(this);
        nativeStartAudioRecord(this.mSampleRate.get(), this.mChannels, this.mBits);
        this.mIsRunning = true;
        this.mLastPTS = 0L;
        return 0;
    }

    public int stopRecord() {
        TXCLog.m84152i(TAG, "stopRecord");
        TXCAudioSysRecord.getInstance().setAudioRecordListener(null);
        RunnableC14151a runnableC14151a = this.mBGMRecorder;
        if (runnableC14151a != null) {
            runnableC14151a.m83862a();
            this.mBGMRecorder = null;
        }
        nativeStopAudioRecord();
        nativeEnableMixMode(false);
        nativeSetVolume(1.0f);
        synchronized (this.mEncodedAudioList) {
            this.mEncodedAudioList.clear();
        }
        this.mIsRunning = false;
        this.mLastPTS = 0L;
        this.mIsPause = false;
        this.mIsMute = false;
        this.mShouldClearAACDataCnt = 0;
        return 0;
    }
}
