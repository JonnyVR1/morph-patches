package com.p069ss.bytertc.ktv;

import androidx.annotation.NonNull;
import com.p069ss.bytertc.engine.NativeKTVPlayerFunctions;
import com.p069ss.bytertc.engine.handler.KTVPlayEventHandler;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.ktv.data.AudioPlayType;
import com.p069ss.bytertc.ktv.data.AudioTrackType;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public class KTVPlayerImpl extends IKTVPlayer {
    private static final String TAG = "KTVPlayerImpl";
    private KTVPlayEventHandler handler;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNativeKTVPlayer;
    private long mNativePlayerEventHandler;
    private final ReentrantReadWriteLock mReadWriteLock;

    public KTVPlayerImpl(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeKTVPlayer = j;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativePlayerEventHandler;
            if (j != 0) {
                NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j);
                this.mNativePlayerEventHandler = 0L;
            }
            this.mNativeKTVPlayer = 0L;
            this.handler = null;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void pauseMusic(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, pauseMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativePauseMusic(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void playMusic(@NonNull String str, @NonNull AudioTrackType audioTrackType, @NonNull AudioPlayType audioPlayType) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, playMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativePlayMusic(j, str, audioTrackType.value(), audioPlayType.value());
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void resumeMusic(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, resumeMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeResumeMusic(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void seekMusic(@NonNull String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, seekMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSeekMusic(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void setMusicPitch(@NonNull String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, setMusicPitch failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSetMusicPitch(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void setMusicVolume(@NonNull String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, setMusicVolume failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSetMusicVolume(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        KTVPlayEventHandler kTVPlayEventHandler = new KTVPlayEventHandler(iKTVPlayerEventHandler);
        this.handler = kTVPlayEventHandler;
        long j = this.mNativePlayerEventHandler;
        this.mNativePlayerEventHandler = NativeKTVPlayerFunctions.nativeSetPlayerEventHandler(this.mNativeKTVPlayer, kTVPlayEventHandler);
        if (j != 0) {
            NativeKTVPlayerFunctions.nativeReleaseKTVPlayerEventHandler(j);
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void stopMusic(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, stopMusic failed.");
            } else {
                NativeKTVPlayerFunctions.nativeStopMusic(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayer
    public void switchAudioTrackType(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVPlayer;
            if (j == 0) {
                LogUtil.m80901e(TAG, "native mNativeKTVPlayer is invalid, switchAudioTrackType failed.");
            } else {
                NativeKTVPlayerFunctions.nativeSwitchAudioTrackType(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
