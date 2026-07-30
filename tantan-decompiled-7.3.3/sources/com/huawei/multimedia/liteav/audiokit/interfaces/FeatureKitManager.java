package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: loaded from: classes7.dex */
public class FeatureKitManager {
    private static final String ENGINE_PACKAGE_NAME = "com.huawei.multimedia.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final String TAG = "HwAudioKit.FeatureKitManager";
    private static FeatureKitManager sInstance;
    private IAudioKitCallback mCallBack = null;
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    public static FeatureKitManager getInstance() {
        FeatureKitManager featureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new FeatureKitManager();
                }
                featureKitManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return featureKitManager;
    }

    public void bindService(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (BIND_SERVICE_LOCK) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(ENGINE_PACKAGE_NAME, str);
                try {
                    TXCLog.m84152i(TAG, "bindService");
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e) {
                    TXCLog.m84151e(TAG, "bindService, SecurityException, %s", e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T extends AudioFeaturesKit> T createFeatureKit(int i, Context context) {
        TXCLog.m84153i(TAG, "createFeatureKit, type = %d", Integer.valueOf(i));
        if (context == null) {
            return null;
        }
        if (i != 1) {
            TXCLog.m84152i(TAG, "createFeatureKit, type error");
            return null;
        }
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = new HwAudioKaraokeFeatureKit(context);
        hwAudioKaraokeFeatureKit.initialize(context);
        return hwAudioKaraokeFeatureKit;
    }

    public IAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    public boolean isAudioKitSupport(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            if (packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0) != null) {
                return true;
            }
            TXCLog.m84152i(TAG, "packageInfo is null");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            TXCLog.m84149e(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    public void onCallBack(int i) {
        TXCLog.m84153i(TAG, "onCallBack, result = %d", Integer.valueOf(i));
        synchronized (SET_CALL_BACK_LOCK) {
            try {
                if (getCallBack() != null) {
                    getCallBack().onResult(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCallBack(IAudioKitCallback iAudioKitCallback) {
        this.mCallBack = iAudioKitCallback;
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        TXCLog.m84152i(TAG, "unbindService");
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
