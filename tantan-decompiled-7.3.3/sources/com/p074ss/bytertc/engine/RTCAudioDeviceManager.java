package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.ReturnStatus;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes11.dex */
public class RTCAudioDeviceManager implements IRTCAudioDeviceManager {
    private long mAudioDeviceManager;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private final ReentrantReadWriteLock mReadWriteLock;

    public RTCAudioDeviceManager(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mAudioDeviceManager = j;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mAudioDeviceManager = -1L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioDeviceRecordTest(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mAudioDeviceManager;
            return j == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStartAudioDeviceRecordTest(j, i);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IRTCAudioDeviceManager
    public int startAudioPlaybackDeviceTest(String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mAudioDeviceManager;
            return j == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStartAudioPlaybackDeviceTest(j, str, i);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDevicePlayTest() {
        this.mJniReadLock.lock();
        try {
            long j = this.mAudioDeviceManager;
            return j == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioDevicePlayTest(j);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioDeviceRecordAndPlayTest() {
        this.mJniReadLock.lock();
        try {
            long j = this.mAudioDeviceManager;
            return j == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioDeviceRecordAndPlayTest(j);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IRTCAudioDeviceManager
    public int stopAudioPlaybackDeviceTest() {
        this.mJniReadLock.lock();
        try {
            long j = this.mAudioDeviceManager;
            return j == -1 ? ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value() : NativeAudioDeviceManagerFunctions.nativeStopAudioPlaybackDeviceTest(j);
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
