package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.ktv.IKTVManagerEventHandler;
import com.p074ss.bytertc.ktv.data.DownloadResult;
import com.p074ss.bytertc.ktv.data.HotMusicInfo;
import com.p074ss.bytertc.ktv.data.KTVErrorCode;
import com.p074ss.bytertc.ktv.data.MusicInfo;

/* JADX INFO: loaded from: classes11.dex */
public class KTVManagerEventHandler extends IKTVManagerEventHandler {
    private static final String TAG = "KTVManagerEventHandler";
    private final IKTVManagerEventHandler mHandler;

    public KTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mHandler = iKTVManagerEventHandler;
    }

    public IKTVManagerEventHandler getKTVHandler() {
        return this.mHandler;
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onClearCacheResult(KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onClearCacheResult...errorCode: " + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onClearCacheResult(kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onClearCacheResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadFailed(int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onDownloadFailed...downloadId: " + i + ",errorCode:" + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadFailed(i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onDownloadFailed callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadMusicProgress(int i, int i2) {
        LogUtil.m82083d(TAG, "onDownloadMusicProgress...downloadId: " + i + ",downloadProgress:" + i2);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadMusicProgress(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onDownloadMusicProgress callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadSuccess(int i, DownloadResult downloadResult) {
        LogUtil.m82083d(TAG, "onDownloadSuccess...downloadId: " + i + ",result:" + downloadResult);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadSuccess(i, downloadResult);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onDownloadSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onHotMusicResult...errorCode: " + kTVErrorCode + ",musicsLen:" + hotMusicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onHotMusicResult(hotMusicInfoArr, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onHotMusicResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onMusicDetailResult...errorCode: " + kTVErrorCode + ",music:" + musicInfo);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicDetailResult(musicInfo, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onMusicDetailResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicListResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onMusicListResult...errorCode: " + kTVErrorCode + ",totalSize:" + i + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicListResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onMusicListResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p074ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onSearchMusicResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m82083d(TAG, "onSearchMusicResult...errorCode: " + kTVErrorCode + ",totalSize:" + i + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onSearchMusicResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m82084e(TAG, "onSearchMusicResult callback catch exception.\n" + e.getMessage());
        }
    }
}
