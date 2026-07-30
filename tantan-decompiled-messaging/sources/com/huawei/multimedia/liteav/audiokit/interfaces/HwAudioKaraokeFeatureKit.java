package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature;
import com.huawei.multimedia.liteav.audiokit.config.ResultCode;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: loaded from: classes7.dex */
public class HwAudioKaraokeFeatureKit extends AudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService";
    private static final String TAG = "HwAudioKit.HwAudioKaraokeFeatureKit";
    private Context mContext;
    private FeatureKitManager mFeatureKitManager;
    private IHwAudioKaraokeFeature mIHwAudioKaraokeFeatureAidl;
    private boolean mIsServiceConnected = false;
    private IBinder mService = null;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKaraokeFeatureKit.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TXCLog.m82969i(HwAudioKaraokeFeatureKit.TAG, "onServiceConnected");
            HwAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl = IHwAudioKaraokeFeature.Stub.asInterface(iBinder);
            if (HwAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl != null) {
                HwAudioKaraokeFeatureKit.this.mIsServiceConnected = true;
                HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1000);
                HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = HwAudioKaraokeFeatureKit.this;
                hwAudioKaraokeFeatureKit.serviceInit(hwAudioKaraokeFeatureKit.mContext.getPackageName());
                HwAudioKaraokeFeatureKit.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TXCLog.m82969i(HwAudioKaraokeFeatureKit.TAG, "onServiceDisconnected");
            HwAudioKaraokeFeatureKit.this.mIsServiceConnected = false;
            if (HwAudioKaraokeFeatureKit.this.mFeatureKitManager != null) {
                HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKaraokeFeatureKit.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            TXCLog.m82966e(HwAudioKaraokeFeatureKit.TAG, "binderDied");
            HwAudioKaraokeFeatureKit.this.mService.unlinkToDeath(HwAudioKaraokeFeatureKit.this.mDeathRecipient, 0);
            HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1003);
            HwAudioKaraokeFeatureKit.this.mService = null;
        }
    };

    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");

        private String mParameName;

        ParameName(String str) {
            this.mParameName = str;
        }

        public String getParameName() {
            return this.mParameName;
        }
    }

    public HwAudioKaraokeFeatureKit(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = FeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(Context context) {
        TXCLog.m82969i(TAG, "bindService");
        FeatureKitManager featureKitManager = this.mFeatureKitManager;
        if (featureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        featureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        try {
            IHwAudioKaraokeFeature iHwAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iHwAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return;
            }
            iHwAudioKaraokeFeature.init(str);
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
                this.mFeatureKitManager.onCallBack(1002);
                TXCLog.m82966e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public void destroy() {
        TXCLog.m82970i(TAG, "destroy, mIsServiceConnected = %b", Boolean.valueOf(this.mIsServiceConnected));
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public int enableKaraokeFeature(boolean z) {
        TXCLog.m82970i(TAG, "enableKaraokeFeature, enable = %b", Boolean.valueOf(z));
        try {
            IHwAudioKaraokeFeature iHwAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iHwAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHwAudioKaraokeFeature.enableKaraokeFeature(z);
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "enableKaraokeFeature,RemoteException ex : %s", e.getMessage());
            return -2;
        }
    }

    public int getKaraokeLatency() {
        TXCLog.m82969i(TAG, "getKaraokeLatency");
        try {
            IHwAudioKaraokeFeature iHwAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iHwAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iHwAudioKaraokeFeature.getKaraokeLatency();
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "getKaraokeLatency,RemoteException ex : %s", e.getMessage());
            return -1;
        }
    }

    public void initialize(Context context) {
        TXCLog.m82969i(TAG, "initialize");
        if (context == null) {
            TXCLog.m82969i(TAG, "initialize, context is null");
        } else if (this.mFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            TXCLog.m82969i(TAG, "initialize, not install AudioEngine");
        }
    }

    public boolean isKaraokeFeatureSupport() {
        TXCLog.m82969i(TAG, "isKaraokeFeatureSupport");
        try {
            IHwAudioKaraokeFeature iHwAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iHwAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHwAudioKaraokeFeature.isKaraokeFeatureSupport();
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "isFeatureSupported,RemoteException ex : %s", e.getMessage());
            return false;
        }
    }

    public int setParameter(ParameName parameName, int i) {
        if (parameName == null) {
            return ResultCode.PARAME_VALUE_ERROR;
        }
        try {
            TXCLog.m82970i(TAG, "parame.getParameName() = %s, parameValue = %d", parameName.getParameName(), Integer.valueOf(i));
            IHwAudioKaraokeFeature iHwAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iHwAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHwAudioKaraokeFeature.setParameter(parameName.getParameName(), i);
        } catch (RemoteException e) {
            TXCLog.m82968e(TAG, "setParameter,RemoteException ex : %s", e.getMessage());
            return -2;
        }
    }
}
