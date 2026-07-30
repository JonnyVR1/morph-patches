package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.ktv.IKTVManagerEventHandler;
import com.p069ss.bytertc.ktv.data.DownloadResult;
import com.p069ss.bytertc.ktv.data.HotMusicInfo;
import com.p069ss.bytertc.ktv.data.KTVErrorCode;
import com.p069ss.bytertc.ktv.data.MusicInfo;

/* JADX INFO: loaded from: classes13.dex */
public class KTVManagerEventHandler extends IKTVManagerEventHandler {
    private static final String TAG = "KTVManagerEventHandler";
    private final IKTVManagerEventHandler mHandler;

    public KTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mHandler = iKTVManagerEventHandler;
    }

    public IKTVManagerEventHandler getKTVHandler() {
        return this.mHandler;
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onClearCacheResult(KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onClearCacheResult...errorCode: " + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onClearCacheResult(kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onClearCacheResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadFailed(int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onDownloadFailed...downloadId: " + i + ",errorCode:" + kTVErrorCode);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadFailed(i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onDownloadFailed callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadMusicProgress(int i, int i2) {
        LogUtil.m80900d(TAG, "onDownloadMusicProgress...downloadId: " + i + ",downloadProgress:" + i2);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadMusicProgress(i, i2);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onDownloadMusicProgress callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onDownloadSuccess(int i, DownloadResult downloadResult) {
        LogUtil.m80900d(TAG, "onDownloadSuccess...downloadId: " + i + ",result:" + downloadResult);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadSuccess(i, downloadResult);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onDownloadSuccess callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onHotMusicResult...errorCode: " + kTVErrorCode + ",musicsLen:" + hotMusicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onHotMusicResult(hotMusicInfoArr, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onHotMusicResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onMusicDetailResult...errorCode: " + kTVErrorCode + ",music:" + musicInfo);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicDetailResult(musicInfo, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onMusicDetailResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onMusicListResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onMusicListResult...errorCode: " + kTVErrorCode + ",totalSize:" + i + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicListResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onMusicListResult callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVManagerEventHandler
    @CalledByNative
    public void onSearchMusicResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        LogUtil.m80900d(TAG, "onSearchMusicResult...errorCode: " + kTVErrorCode + ",totalSize:" + i + ",musicsLen:" + musicInfoArr.length);
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onSearchMusicResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onSearchMusicResult callback catch exception.\n" + e.getMessage());
        }
    }
}
