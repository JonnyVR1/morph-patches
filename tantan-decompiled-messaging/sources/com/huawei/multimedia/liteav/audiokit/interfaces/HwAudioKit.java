package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.multimedia.liteav.audioengine.IHwAudioEngine;
import com.huawei.multimedia.liteav.audiokit.config.Version;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HwAudioKit {
    private static final List<Integer> DEFAULT_FEATURE_LIST = new ArrayList(0);
    private static final String ENGINE_CLASS_NAME = "com.huawei.multimedia.audioengine.HwAudioEngineService";
    private static final String TAG = "HwAudioKit.HwAudioKit";
    private Context mContext;
    private FeatureKitManager mFeatureKitManager;
    private IHwAudioEngine mIHwAudioEngine = null;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKit.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HwAudioKit.this.mIHwAudioEngine = IHwAudioEngine.Stub.asInterface(iBinder);
            TXCLog.m82969i(HwAudioKit.TAG, "onServiceConnected");
            if (HwAudioKit.this.mIHwAudioEngine != null) {
                HwAudioKit.this.mIsServiceConnected = true;
                TXCLog.m82969i(HwAudioKit.TAG, "onServiceConnected, mIHwAudioEngine is not null");
                HwAudioKit.this.mFeatureKitManager.onCallBack(0);
                HwAudioKit hwAudioKit = HwAudioKit.this;
                hwAudioKit.serviceInit(hwAudioKit.mContext.getPackageName(), Version.SDK_VERSION_NAME);
                HwAudioKit.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TXCLog.m82969i(HwAudioKit.TAG, "onServiceDisconnected");
            HwAudioKit.this.mIHwAudioEngine = null;
            HwAudioKit.this.mIsServiceConnected = false;
            HwAudioKit.this.mFeatureKitManager.onCallBack(4);
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKit.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            HwAudioKit.this.mService.unlinkToDeath(HwAudioKit.this.mDeathRecipient, 0);
            HwAudioKit.this.mFeatureKitManager.onCallBack(6);
            TXCLog.m82966e(HwAudioKit.TAG, "service binder died");
            HwAudioKit.this.mService = null;
        }
    };

    public enum FeatureType {
        HWAUDIO_FEATURE_KARAOKE(1);

        private int mFeatureType;

        FeatureType(int i) {
            this.mFeatureType = i;
        }

        public int getFeatureType() {
            return this.mFeatureType;
        }
    }

    public HwAudioKit(Context context, IAudioKitCallback iAudioKitCallback) {
        this.mContext = null;
        FeatureKitManager featureKitManager = FeatureKitManager.getInstance();
        this.mFeatureKitManager = featureKitManager;
        featureKitManager.setCallBack(iAudioKitCallback);
        this.mContext = context;
    }

    private void bindService(Context context) {
        TXCLog.m82970i(TAG, "bindService, mIsServiceConnected = %b", Boolean.valueOf(this.mIsServiceConnected));
        FeatureKitManager featureKitManager = this.mFeatureKitManager;
        if (featureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        featureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str, String str2) {
        TXCLog.m82969i(TAG, "serviceInit");
        try {
            IHwAudioEngine iHwAudioEngine = this.mIHwAudioEngine;
            if (iHwAudioEngine == null || !this.mIsServiceConnected) {
                return;
            }
            iHwAudioEngine.init(str, str2);
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "isFeatureSupported,RemoteException ex : %s", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (RemoteException unused) {
                this.mFeatureKitManager.onCallBack(5);
                TXCLog.m82966e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public <T extends AudioFeaturesKit> T createFeature(FeatureType featureType) {
        FeatureKitManager featureKitManager = this.mFeatureKitManager;
        if (featureKitManager == null || featureType == null) {
            return null;
        }
        return (T) featureKitManager.createFeatureKit(featureType.getFeatureType(), this.mContext);
    }

    public void destroy() {
        TXCLog.m82970i(TAG, "destroy, mIsServiceConnected = %b", Boolean.valueOf(this.mIsServiceConnected));
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public List<Integer> getSupportedFeatures() {
        TXCLog.m82969i(TAG, "getSupportedFeatures");
        try {
            IHwAudioEngine iHwAudioEngine = this.mIHwAudioEngine;
            if (iHwAudioEngine != null && this.mIsServiceConnected) {
                return iHwAudioEngine.getSupportedFeatures();
            }
        } catch (RemoteException unused) {
            TXCLog.m82966e(TAG, "getSupportedFeatures, createFeature,wait bind service fail");
        }
        TXCLog.m82969i(TAG, "getSupportedFeatures, service not bind");
        return DEFAULT_FEATURE_LIST;
    }

    public void initialize() {
        TXCLog.m82969i(TAG, "initialize");
        Context context = this.mContext;
        if (context == null) {
            TXCLog.m82969i(TAG, "mContext is null");
            this.mFeatureKitManager.onCallBack(7);
        } else if (this.mFeatureKitManager.isAudioKitSupport(context)) {
            bindService(this.mContext);
        } else {
            TXCLog.m82969i(TAG, "not install AudioKitEngine");
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isFeatureSupported(FeatureType featureType) {
        if (featureType == null) {
            return false;
        }
        TXCLog.m82970i(TAG, "isFeatureSupported, type = %d", Integer.valueOf(featureType.getFeatureType()));
        try {
            IHwAudioEngine iHwAudioEngine = this.mIHwAudioEngine;
            if (iHwAudioEngine != null && this.mIsServiceConnected) {
                return iHwAudioEngine.isFeatureSupported(featureType.getFeatureType());
            }
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "isFeatureSupported,RemoteException ex : %s", e.getMessage());
        }
        return false;
    }
}
