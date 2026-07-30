package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.audio.ISingScoringManager;
import com.p069ss.bytertc.engine.data.SingScoringConfig;
import com.p069ss.bytertc.engine.data.StandardPitchInfo;
import com.p069ss.bytertc.engine.handler.NativeSingScoringEventHandler;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class SingScoringManager extends ISingScoringManager {
    private static final String TAG = "SingScoringManager";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    NativeSingScoringEventHandler mNativeHandler;
    private long mNativeRTCVideoEngine;
    private long mNativeSingScoringManager;
    private final ReentrantReadWriteLock mReadWriteLock;
    private WeakReference<ISingScoringEventHandler> mSingScoringEventHandler;

    public SingScoringManager(long j, long j2) {
        this.mNativeSingScoringManager = 0L;
        this.mNativeRTCVideoEngine = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRTCVideoEngine = j;
        this.mNativeSingScoringManager = j2;
        this.mNativeHandler = new NativeSingScoringEventHandler(this);
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNativeSingScoringManager = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int getAverageScore() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeGetAverageScore(j);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, getAverageScore failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int getLastSentenceScore() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeGetLastSentenceScore(j);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, getLastSentenceScore failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public ISingScoringEventHandler getSingScoringEventHandler() {
        return this.mSingScoringEventHandler.get();
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public List<StandardPitchInfo> getStandardPitchInfo(String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return Arrays.asList(NativeSingScoringManagerFunctions.nativeGetStandardPitchInfo(j, str));
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, getStandardPitchInfo failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int getTotalScore() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeGetTotalScore(j);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, getTotalScore failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int initSingScoring(String str, String str2, ISingScoringEventHandler iSingScoringEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeSingScoringManager == 0) {
                LogUtil.m80901e(TAG, "native SingScoringManager is invalid, initSingScoring failed.");
                return -1;
            }
            this.mSingScoringEventHandler = new WeakReference<>(iSingScoringEventHandler);
            long j = this.mNativeRTCVideoEngine;
            return iSingScoringEventHandler == null ? NativeSingScoringManagerFunctions.nativeInitSingScoring(j, this.mNativeSingScoringManager, str, str2, null) : NativeSingScoringManagerFunctions.nativeInitSingScoring(j, this.mNativeSingScoringManager, str, str2, this.mNativeHandler);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int setSingScoringConfig(SingScoringConfig singScoringConfig) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeSetSingScoringConfig(j, singScoringConfig.sampleRate.value(), singScoringConfig.mode.value(), singScoringConfig.lyricsFilepath, singScoringConfig.midiFilepath);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, setSingScoringConfig failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int startSingScoring(int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeStartSingScoring(j, i, i2);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, startSingScoring failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.engine.audio.ISingScoringManager
    public int stopSingScoring() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeSingScoringManager;
            if (j != 0) {
                return NativeSingScoringManagerFunctions.nativeStopSingScoring(j);
            }
            LogUtil.m80901e(TAG, "native SingScoringManager is invalid, stopSingScoring failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
