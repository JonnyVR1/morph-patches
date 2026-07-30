package com.p074ss.bytertc.ktv;

import androidx.annotation.NonNull;
import com.p074ss.bytertc.engine.BuildConfig;
import com.p074ss.bytertc.engine.NativeKTVManagerFunctions;
import com.p074ss.bytertc.engine.handler.KTVManagerEventHandler;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.ktv.data.DownloadLyricType;
import com.p074ss.bytertc.ktv.data.MusicFilterType;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p153l.wg3;

/* JADX INFO: loaded from: classes11.dex */
public class KTVManagerImpl extends IKTVManager {
    private static final String TAG = "KTVManagerImpl";
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private KTVManagerEventHandler mKTVManagerEventHandler;
    private KTVPlayerImpl mKTVPlayer;
    private long mNativeKTVManager;
    private long mNativeKTVManagerEventHandlerPtr;
    private final ReentrantReadWriteLock mReadWriteLock;

    public KTVManagerImpl(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeKTVManager = j;
    }

    private int calculateMusicFilterValue(MusicFilterType[] musicFilterTypeArr) {
        int length = musicFilterTypeArr == null ? 0 : musicFilterTypeArr.length;
        if (length == 0) {
            return MusicFilterType.NONE.value();
        }
        if (length == 1) {
            return musicFilterTypeArr[0].value();
        }
        int iValue = musicFilterTypeArr[0].value();
        for (MusicFilterType musicFilterType : musicFilterTypeArr) {
            if (iValue == MusicFilterType.NONE.value()) {
                if (BuildConfig.DEBUG) {
                    wg3.m206174a("types contains 'MUSIC_FILTER_TYPE_NONE' and other");
                    return 0;
                }
                LogUtil.m82084e(TAG, "types contains 'MUSIC_FILTER_TYPE_NONE' and other");
                return -1;
            }
            iValue |= musicFilterType.value();
        }
        return iValue;
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void cancelDownload(int i) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, downloadLyric failed.");
            }
            NativeKTVManagerFunctions.nativeCancelDownload(this.mNativeKTVManager, i);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void clearCache() {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, clearCache failed.");
            }
            NativeKTVManagerFunctions.nativeClearCache(this.mNativeKTVManager);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroy() {
        KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
        if (kTVPlayerImpl != null) {
            kTVPlayerImpl.destroy();
            this.mKTVPlayer = null;
        }
        long j = this.mNativeKTVManagerEventHandlerPtr;
        if (j != 0) {
            NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j);
            this.mNativeKTVManagerEventHandlerPtr = 0L;
        }
        this.mKTVManagerEventHandler = null;
        this.mJniWriteLock.lock();
        try {
            this.mNativeKTVManager = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public int downloadLyric(@NonNull String str, @NonNull DownloadLyricType downloadLyricType) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVManager;
            if (j != 0) {
                return NativeKTVManagerFunctions.nativeDownloadLyric(j, str, downloadLyricType.value());
            }
            LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, downloadLyric failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public int downloadMidi(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVManager;
            if (j != 0) {
                return NativeKTVManagerFunctions.nativeDownloadMidi(j, str);
            }
            LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, downloadMidi failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public int downloadMusic(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVManager;
            if (j != 0) {
                return NativeKTVManagerFunctions.nativeDownloadMusic(j, str);
            }
            LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, downloadMusic failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IKTVManagerEventHandler getHandler() {
        return this.mKTVManagerEventHandler.getKTVHandler();
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void getHotMusic(@NonNull List<String> list, @NonNull MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, getHotMusic failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                if (iCalculateMusicFilterValue != -1) {
                    String[] strArr = new String[list.size()];
                    list.toArray(strArr);
                    NativeKTVManagerFunctions.nativeGetHotMusic(this.mNativeKTVManager, strArr, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public IKTVPlayer getKTVPlayer() {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, getKTVPlayer failed.");
            }
            KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
            if (kTVPlayerImpl == null) {
                long jNativeGetKTVPlayer = NativeKTVManagerFunctions.nativeGetKTVPlayer(this.mNativeKTVManager);
                if (jNativeGetKTVPlayer == 0) {
                    LogUtil.m82084e(TAG, "native nativeKTVPlayer is invalid, getKTVPlayer failed.");
                    return null;
                }
                kTVPlayerImpl = new KTVPlayerImpl(jNativeGetKTVPlayer);
                this.mKTVPlayer = kTVPlayerImpl;
            }
            return kTVPlayerImpl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void getMusicDetail(@NonNull String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVManager;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, getMusicDetail failed.");
            } else {
                NativeKTVManagerFunctions.nativeGetMusicDetail(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void getMusicList(int i, int i2, @NonNull MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, getMusicList failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                if (iCalculateMusicFilterValue != -1) {
                    NativeKTVManagerFunctions.nativeGetMusicList(this.mNativeKTVManager, i, i2, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void searchMusic(@NonNull String str, int i, int i2, @NonNull MusicFilterType[] musicFilterTypeArr) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, searchMusic failed.");
            } else {
                int iCalculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
                if (iCalculateMusicFilterValue != -1) {
                    NativeKTVManagerFunctions.nativeSearchMusic(this.mNativeKTVManager, str, i, i2, iCalculateMusicFilterValue);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeKTVManager == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, setKTVManagerEventHandler failed.");
            } else {
                KTVManagerEventHandler kTVManagerEventHandler = new KTVManagerEventHandler(iKTVManagerEventHandler);
                this.mKTVManagerEventHandler = kTVManagerEventHandler;
                long j = this.mNativeKTVManagerEventHandlerPtr;
                this.mNativeKTVManagerEventHandlerPtr = NativeKTVManagerFunctions.nativeSetKTVManagerEventHandler(this.mNativeKTVManager, kTVManagerEventHandler);
                if (j != 0) {
                    NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j);
                }
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManager
    public void setMaxCacheSize(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeKTVManager;
            if (j == 0) {
                LogUtil.m82084e(TAG, "native KTVManagerImpl is invalid, setMaxCacheSize failed.");
            } else {
                NativeKTVManagerFunctions.nativeSetMaxCacheSize(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
