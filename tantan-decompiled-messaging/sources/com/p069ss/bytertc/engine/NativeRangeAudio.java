package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.IRangeAudio;
import com.p069ss.bytertc.engine.data.Position;
import com.p069ss.bytertc.engine.data.ReceiveRange;
import com.p069ss.bytertc.engine.type.AttenuationType;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class NativeRangeAudio implements IRangeAudio {
    private static final String TAG = "NativeRangeAudio";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNaiveInstance;
    private final ReentrantReadWriteLock mReadWriteLock;

    public NativeRangeAudio(long j) {
        this.mNaiveInstance = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNaiveInstance = j;
    }

    public static native void nativeEnableRangeAudio(long j, boolean z);

    public static native int nativeSetAttenuationType(long j, int i, float f);

    public static native void nativeSetNoAttenuationFlags(long j, String[] strArr);

    public static native int nativeUpdatePosition(long j, float f, float f2, float f3);

    public static native int nativeUpdateReceiveRange(long j, int i, int i2);

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNaiveInstance = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.IRangeAudio
    public void enableRangeAudio(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native RangeAudio is invalid, enableRangeAudio failed.");
            } else {
                nativeEnableRangeAudio(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.IRangeAudio
    public int setAttenuationModel(AttenuationType attenuationType, float f) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeSetAttenuationType(j, attenuationType.value(), f);
            }
            LogUtil.m80901e(TAG, "native range audio is invalid, setAttenuationModel failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.IRangeAudio
    public void setNoAttenuationFlags(List<String> list) {
        this.mJniReadLock.lock();
        try {
            if (this.mNaiveInstance == 0) {
                LogUtil.m80901e(TAG, "native range audio is invalid, setNoAttenuationFlags failed.");
            } else {
                String[] strArr = new String[list.size()];
                list.toArray(strArr);
                nativeSetNoAttenuationFlags(this.mNaiveInstance, strArr);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.IRangeAudio
    public int updatePosition(Position position) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeUpdatePosition(j, position.f55621x, position.f55622y, position.f55623z);
            }
            LogUtil.m80901e(TAG, "native RangeAudio is invalid, updatePosition failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.IRangeAudio
    public int updateReceiveRange(ReceiveRange receiveRange) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeUpdateReceiveRange(j, receiveRange.min, receiveRange.max);
            }
            LogUtil.m80901e(TAG, "native RangeAudio is invalid, updateReceiveRange failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
