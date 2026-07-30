package com.tencent.liteav.audio.impl.earmonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKit;
import com.huawei.multimedia.liteav.audiokit.interfaces.IAudioKitCallback;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC14217h;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiAudioKit implements IAudioKitCallback, TXSystemAudioKit, HandlerC14217h.a {
    private static final int BACKGROUND_CHECK_INTERVAL = 1000;
    private static final String TAG = "HuaweiAudioKit";
    private InterfaceC14163a mAudioKitCallback;
    private HandlerC14217h mBackgroundCheckTimer;
    private HwAudioKit mHwAudioKit;
    private HwAudioKaraokeFeatureKit mKaraokeKit;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());
    private boolean mIsAudioKitIniting = false;
    private boolean mIsEarMonitoringEnabled = false;
    private boolean mIsBackgroundWhenLastCheck = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithAudioKitResultInternal(int i) {
        InterfaceC14163a interfaceC14163a;
        TXCLog.m84153i(TAG, "on audio kit callback: %d", Integer.valueOf(i));
        if (i == 0) {
            this.mIsAudioKitIniting = false;
            InterfaceC14163a interfaceC14163a2 = this.mAudioKitCallback;
            if (interfaceC14163a2 != null) {
                interfaceC14163a2.onAudioKitInitFinished(this, true);
            }
            HwAudioKit hwAudioKit = this.mHwAudioKit;
            HwAudioKit.FeatureType featureType = HwAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE;
            if (hwAudioKit.isFeatureSupported(featureType)) {
                this.mKaraokeKit = (HwAudioKaraokeFeatureKit) this.mHwAudioKit.createFeature(featureType);
                return;
            }
            InterfaceC14163a interfaceC14163a3 = this.mAudioKitCallback;
            if (interfaceC14163a3 != null) {
                interfaceC14163a3.onEarMonitoringInitialized(this, false);
                return;
            }
            return;
        }
        if (i == 1000) {
            InterfaceC14163a interfaceC14163a4 = this.mAudioKitCallback;
            if (interfaceC14163a4 != null) {
                interfaceC14163a4.onEarMonitoringInitialized(this, true);
                return;
            }
            return;
        }
        if (i == 1805 || (interfaceC14163a = this.mAudioKitCallback) == null) {
            return;
        }
        if (!this.mIsAudioKitIniting) {
            interfaceC14163a.onAudioKitError(this);
        } else {
            interfaceC14163a.onAudioKitInitFinished(this, false);
            this.mIsAudioKitIniting = false;
        }
    }

    private boolean isAppInBackground() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance != 100;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemEarMonitoringVolumeInternal(int i) {
        TXCLog.m84153i(TAG, "setSystemEarMonitoringVolumeInternal: %d, kit: %s", Integer.valueOf(i), this.mKaraokeKit);
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit != null) {
            int parameter = hwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i);
            if (parameter == 1806 || parameter == -2) {
                dealWithAudioKitResultInternal(-2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemEarMonitoringInternal() {
        TXCLog.m84153i(TAG, "startSystemEarMonitoring kit: %s", this.mKaraokeKit);
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit == null) {
            return;
        }
        int iEnableKaraokeFeature = hwAudioKaraokeFeatureKit.enableKaraokeFeature(true);
        if (iEnableKaraokeFeature == 0 || iEnableKaraokeFeature == 1805) {
            this.mIsEarMonitoringEnabled = true;
        } else {
            dealWithAudioKitResultInternal(1003);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        if (this.mBackgroundCheckTimer != null) {
            return;
        }
        TXCLog.m84152i(TAG, "start background checking timer");
        HandlerC14217h handlerC14217h = new HandlerC14217h(Looper.getMainLooper(), this);
        this.mBackgroundCheckTimer = handlerC14217h;
        handlerC14217h.m84248a(0, BACKGROUND_CHECK_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopSystemEarMonitoringInternal() {
        TXCLog.m84152i(TAG, "stopSystemEarMonitoring");
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mKaraokeKit;
        if (hwAudioKaraokeFeatureKit != null) {
            hwAudioKaraokeFeatureKit.enableKaraokeFeature(false);
            this.mIsEarMonitoringEnabled = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimer() {
        if (this.mBackgroundCheckTimer != null) {
            TXCLog.m84152i(TAG, "stop background checking timer");
            this.mBackgroundCheckTimer.m84247a();
            this.mBackgroundCheckTimer = null;
        }
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void initialize(final Context context, final InterfaceC14163a interfaceC14163a) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.1
            @Override // java.lang.Runnable
            public void run() {
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    TXCLog.m84149e(HuaweiAudioKit.TAG, "it's already initialized.");
                    return;
                }
                TXCLog.m84152i(HuaweiAudioKit.TAG, "start initialize audio kit");
                HuaweiAudioKit.this.mIsAudioKitIniting = true;
                HuaweiAudioKit.this.mAudioKitCallback = interfaceC14163a;
                HuaweiAudioKit.this.mHwAudioKit = new HwAudioKit(context.getApplicationContext(), HuaweiAudioKit.this);
                HuaweiAudioKit.this.mHwAudioKit.initialize();
            }
        });
    }

    @Override // com.huawei.multimedia.liteav.audiokit.interfaces.IAudioKitCallback
    public void onResult(final int i) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.6
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.dealWithAudioKitResultInternal(i);
            }
        });
    }

    @Override // com.tencent.liteav.basic.util.HandlerC14217h.a
    public void onTimeout() {
        boolean zIsAppInBackground = isAppInBackground();
        if (this.mIsEarMonitoringEnabled && this.mIsBackgroundWhenLastCheck && !zIsAppInBackground) {
            stopSystemEarMonitoringInternal();
            startSystemEarMonitoringInternal();
        } else if (zIsAppInBackground && !this.mIsBackgroundWhenLastCheck) {
            TXCLog.m84152i(TAG, "app has gone to background.");
        }
        this.mIsBackgroundWhenLastCheck = zIsAppInBackground;
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void setSystemEarMonitoringVolume(final int i) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.5
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.setSystemEarMonitoringVolumeInternal(i);
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void startSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.3
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.startTimer();
                HuaweiAudioKit.this.startSystemEarMonitoringInternal();
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void stopSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.4
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.stopTimer();
                HuaweiAudioKit.this.stopSystemEarMonitoringInternal();
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void uninitialize() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.2
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m84152i(HuaweiAudioKit.TAG, "uninitialize");
                if (HuaweiAudioKit.this.mKaraokeKit != null) {
                    HuaweiAudioKit.this.mKaraokeKit.destroy();
                    HuaweiAudioKit.this.mKaraokeKit = null;
                }
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    HuaweiAudioKit.this.mHwAudioKit.destroy();
                    HuaweiAudioKit.this.mHwAudioKit = null;
                }
                HuaweiAudioKit.this.mIsAudioKitIniting = false;
            }
        });
    }
}
