package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.ISpatialAudio;
import com.p069ss.bytertc.engine.data.PositionInfo;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class NativeSpatialAudio implements ISpatialAudio {
    private static final String TAG = "NativeSpatialAudio";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNaiveInstance;
    private final ReentrantReadWriteLock mReadWriteLock;

    public NativeSpatialAudio(long j) {
        this.mNaiveInstance = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNaiveInstance = j;
    }

    public static native void nativeDisableRemoteOrientation(long j);

    public static native void nativeEnableSpatialAudio(long j, boolean z);

    public static native int nativeRemoveAllRemotePosition(long j);

    public static native int nativeRemoveRemotePosition(long j, String str);

    public static native int nativeUpdateRemotePosition(long j, String str, PositionInfo positionInfo);

    public static native int nativeUpdateSelfPosition(long j, PositionInfo positionInfo);

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNaiveInstance = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public void disableRemoteOrientation() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native SpatialAudio is invalid, disableRemoteOrientation failed.");
            } else {
                nativeDisableRemoteOrientation(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public void enableSpatialAudio(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native SpatialAudio is invalid, enableSpatialAudio failed.");
            } else {
                nativeEnableSpatialAudio(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public int removeAllRemotePosition() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeRemoveAllRemotePosition(j);
            }
            LogUtil.m80901e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public int removeRemotePosition(String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeRemoveRemotePosition(j, str);
            }
            LogUtil.m80901e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public int updateRemotePosition(String str, PositionInfo positionInfo) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeUpdateRemotePosition(j, str, positionInfo);
            }
            LogUtil.m80901e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISpatialAudio
    public int updateSelfPosition(PositionInfo positionInfo) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNaiveInstance;
            if (j != 0) {
                return nativeUpdateSelfPosition(j, positionInfo);
            }
            LogUtil.m80901e(TAG, "native SpatialAudio is invalid, updatePosition failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
