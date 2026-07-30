package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.p074ss.bytertc.engine.data.ReturnStatus;
import com.p074ss.bytertc.engine.handler.NativeWTNStreamEventHandler;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.IVideoSink;
import com.p074ss.bytertc.engine.video.RemoteVideoSinkConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes11.dex */
public class WTNStream implements IWTNStream {
    private static final String TAG = "WTNStream";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    NativeWTNStreamEventHandler mNativeHandler;
    private long mNativeWTNStream;
    private final ReentrantReadWriteLock mReadWriteLock;
    private WeakReference<IWTNStreamEventHandler> mWTNStreamEventHandler;

    public WTNStream(long j) {
        this.mNativeWTNStream = 0L;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeWTNStream = j;
        this.mNativeHandler = new NativeWTNStreamEventHandler(this);
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            this.mNativeWTNStream = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public IWTNStreamEventHandler getWTNStreamEventHandler() {
        return this.mWTNStreamEventHandler.get();
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int setWTNRemoteAudioPlaybackVolume(String str, int i) {
        int iNativeSetWTNRemoteAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, setWTNRemoteAudioPlaybackVolume failed.");
                iNativeSetWTNRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "setWTNRemoteAudioPlaybackVolume...public stream id: " + str + ", volume: " + i);
                iNativeSetWTNRemoteAudioPlaybackVolume = NativeWTNStreamFunctions.nativeSetWTNRemoteAudioPlaybackVolume(this.mNativeWTNStream, str, i);
            }
            return iNativeSetWTNRemoteAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int setWTNRemoteVideoCanvas(String str, VideoCanvas videoCanvas) {
        int iNativeSetWTNRemoteVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, setWTNRemoteVideoCanvas failed.");
                iNativeSetWTNRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "setWTNRemoteVideoCanvas...public stream id: " + str);
                iNativeSetWTNRemoteVideoCanvas = NativeWTNStreamFunctions.nativeSetWTNRemoteVideoCanvas(this.mNativeWTNStream, str, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor, videoCanvas.renderRotation.value());
            }
            return iNativeSetWTNRemoteVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int setWTNRemoteVideoSink(String str, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig) {
        int iNativeSetWTNRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native engine is invalid, setWTNRemoteVideoSink failed.");
                iNativeSetWTNRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "setWTNRemoteVideoSink...public stream id: " + str);
                iNativeSetWTNRemoteVideoSink = NativeWTNStreamFunctions.nativeSetWTNRemoteVideoSink(this.mNativeWTNStream, str, iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, remoteVideoSinkConfig.pixelFormat.value(), remoteVideoSinkConfig.position.getValue(), remoteVideoSinkConfig.applyRotation.getValue(), remoteVideoSinkConfig.mirrorType.getValue());
            }
            return iNativeSetWTNRemoteVideoSink;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int setWTNStreamEventHandler(IWTNStreamEventHandler iWTNStreamEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native WTNStream is invalid, setWTNStreamEventHandler failed.");
                return -1;
            }
            this.mWTNStreamEventHandler = new WeakReference<>(iWTNStreamEventHandler);
            long j = this.mNativeWTNStream;
            return iWTNStreamEventHandler == null ? NativeWTNStreamFunctions.nativeSetWTNStreamEventHandler(j, null) : NativeWTNStreamFunctions.nativeSetWTNStreamEventHandler(j, this.mNativeHandler);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int subscribeWTNAudioStream(String str, boolean z) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native WTNStream is invalid, subscribeWTNAudioStream failed.");
                return -1;
            }
            LogUtil.m82083d(TAG, "subscribeWTNAudioStream...public stream id: " + str + ", subscribe: " + z);
            return NativeWTNStreamFunctions.nativeSubscribeWTNAudioStream(this.mNativeWTNStream, str, z);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.IWTNStream
    public int subscribeWTNVideoStream(String str, boolean z) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeWTNStream == 0) {
                LogUtil.m82084e(TAG, "native WTNStream is invalid, subscribeWTNVideoStream failed.");
                return -1;
            }
            LogUtil.m82083d(TAG, "subscribeWTNVideoStream...public stream id: " + str + ", subscribe: " + z);
            return NativeWTNStreamFunctions.nativeSubscribeWTNVideoStream(this.mNativeWTNStream, str, z);
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
