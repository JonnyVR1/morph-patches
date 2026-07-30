package com.p074ss.bytertc.ktv;

import androidx.annotation.NonNull;
import com.p074ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.p074ss.bytertc.ktv.data.PlayState;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IKTVPlayerEventHandler {
    public abstract void onPlayProgress(@NonNull String str, long j);

    public abstract void onPlayStateChanged(@NonNull String str, @NonNull PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode);
}
