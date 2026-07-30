package com.p069ss.bytertc.engine.handler;

import androidx.annotation.NonNull;
import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.ktv.IKTVPlayerEventHandler;
import com.p069ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.p069ss.bytertc.ktv.data.PlayState;

/* JADX INFO: loaded from: classes13.dex */
public class KTVPlayEventHandler extends IKTVPlayerEventHandler {
    private static final String TAG = "KTVPlayEventHandler";
    private final IKTVPlayerEventHandler mHandler;

    public KTVPlayEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        this.mHandler = iKTVPlayerEventHandler;
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayerEventHandler
    @CalledByNative
    public void onPlayProgress(@NonNull String str, long j) {
        LogUtil.m80900d(TAG, "onPlayProgress...musicId: " + str + ",progress:" + j);
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayProgress(str, j);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onPlayProgress callback catch exception.\n" + e.getMessage());
        }
    }

    @Override // com.p069ss.bytertc.ktv.IKTVPlayerEventHandler
    @CalledByNative
    public void onPlayStateChanged(@NonNull String str, @NonNull PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode) {
        LogUtil.m80900d(TAG, "onPlayStateChanged...musicId: " + str + ",playState:" + playState.toString());
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayStateChanged(str, playState, kTVPlayerErrorCode);
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onPlayStateChanged callback catch exception.\n" + e.getMessage());
        }
    }
}
