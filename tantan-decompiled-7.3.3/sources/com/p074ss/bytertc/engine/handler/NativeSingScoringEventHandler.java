package com.p074ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.ISingScoringEventHandler;
import com.p074ss.bytertc.engine.SingScoringManager;
import com.p074ss.bytertc.engine.data.SingScoringRealtimeInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class NativeSingScoringEventHandler {
    private static final String TAG = "NativeSingScoringEventHandler";
    private WeakReference<SingScoringManager> mSingScoringManager;

    public NativeSingScoringEventHandler(SingScoringManager singScoringManager) {
        this.mSingScoringManager = new WeakReference<>(singScoringManager);
    }

    @CalledByNative
    public void onCurrentScoringInfo(SingScoringRealtimeInfo singScoringRealtimeInfo) {
        SingScoringManager singScoringManager;
        ISingScoringEventHandler singScoringEventHandler;
        WeakReference<SingScoringManager> weakReference = this.mSingScoringManager;
        if (weakReference == null || (singScoringManager = weakReference.get()) == null || (singScoringEventHandler = singScoringManager.getSingScoringEventHandler()) == null) {
            return;
        }
        singScoringEventHandler.onCurrentScoringInfo(singScoringRealtimeInfo);
    }
}
