package com.p074ss.bytertc.audio.device.hwearback.ovm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.bytedance.realx.base.RXLogging;
import com.p074ss.bytertc.audio.device.base.ManufacturerChecker;
import com.p074ss.bytertc.audio.device.hwearback.ovm.OVMClient;
import p153l.jj5;

/* JADX INFO: loaded from: classes11.dex */
public class OVMClient {
    private static final int OPEN_DELAY_TIME = 200;
    private static final String TAG = "OVMClient";
    private static final int WAIT_SERVICE_DELAY_TIME = 2500;
    private static volatile OVMClient sClient;
    private OVMAuthManager.AuthCallback mAuthCallback;
    private Context mContext;
    private OVMKaraokeMediaHelper mMediaHelper;
    private boolean mNeedDestroyWhenRelease;
    private boolean mIsSupport = false;
    private int mAuthResultCode = -2;
    private OperateStorage mStorage = new OperateStorage();
    private OVMAuthManager.AuthCallback mInitCallback = new OVMAuthManager.AuthCallback() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.1
        @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
        public void onResult(int i) {
            if (OVMClient.this.mAuthResultCode == -2) {
                OVMClient.this.mAuthResultCode = i;
                OVMAuthManager.AuthCallback authCallback = OVMClient.this.mAuthCallback;
                if (authCallback != null) {
                    authCallback.onResult(OVMClient.this.mAuthResultCode);
                }
            }
        }
    };
    private boolean mIsHeadsetConnected = false;
    private OVMAuthManager.AuthCallback mRestartAuthCallback = new OVMAuthManager.AuthCallback() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.2
        @Override // com.ss.bytertc.audio.device.hwearback.ovm.OVMAuthManager.AuthCallback
        public void onResult(int i) {
            OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper;
            RXLogging.m5744i(OVMClient.TAG, "onRestartListener result: " + i);
            OVMAuthManager.getInstance().removeCallback(this);
            OVMClient.this.postHandler.removeCallbacks(OVMClient.this.restoreParamsRunnable);
            if (OVMClient.this.mStorage.isKTVDeviceOpen && i == 1001 && (oVMKaraokeMediaHelperLockMediaHelper = OVMClient.this.lockMediaHelper()) != null) {
                RXLogging.m5744i(OVMClient.TAG, "openKTVDevice duration restart.");
                oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
                OVMClient.this.postHandler.postDelayed(OVMClient.this.restoreParamsRunnable, 200L);
            }
        }
    };
    private Handler postHandler = new Handler(Looper.getMainLooper());
    private Runnable restartRunnable = new Runnable() { // from class: l.r850
        @Override // java.lang.Runnable
        public final void run() {
            OVMClient.m82012a(this.f161668a);
        }
    };
    private Runnable restoreParamsRunnable = new Runnable() { // from class: l.s850
        @Override // java.lang.Runnable
        public final void run() {
            OVMClient.m82013b(this.f166742a);
        }
    };
    private BroadcastReceiver headsetPlugReceiver = new BroadcastReceiver() { // from class: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                RXLogging.m5742e(OVMClient.TAG, "action is null");
                return;
            }
            RXLogging.m5744i(OVMClient.TAG, "onReceive: " + intent);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    RXLogging.m5744i(OVMClient.TAG, str + ": " + extras.get(str));
                }
            }
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                boolean z = intent.getIntExtra("state", -99) == 1;
                boolean z2 = OVMClient.this.mIsHeadsetConnected != z;
                OVMClient.this.mIsHeadsetConnected = z;
                if (!z2) {
                    RXLogging.m5744i(OVMClient.TAG, "headset plug not changed, ignore");
                    return;
                }
                if (z) {
                    RXLogging.m5744i(OVMClient.TAG, "need restart media helper");
                    OVMClient.this.restartKTVDevice(ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP ? OVMClient.WAIT_SERVICE_DELAY_TIME : 200);
                    return;
                }
                OVMClient.this.clearRestartRunner();
                OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = OVMClient.this.lockMediaHelper();
                if (oVMKaraokeMediaHelperLockMediaHelper == null || !OVMClient.this.mStorage.isKTVDeviceOpen) {
                    return;
                }
                RXLogging.m5744i(OVMClient.TAG, "closeKTVDevice and feedback with unplug headset");
                oVMKaraokeMediaHelperLockMediaHelper.setPlayFeedbackParam(0);
                oVMKaraokeMediaHelperLockMediaHelper.closeKTVDevice();
            }
        }
    };

    /* JADX INFO: renamed from: com.ss.bytertc.audio.device.hwearback.ovm.OVMClient$4 */
    public static /* synthetic */ class C135094 {

        /* JADX INFO: renamed from: $SwitchMap$com$ss$bytertc$audio$device$base$ManufacturerChecker$Type */
        static final /* synthetic */ int[] f56427x4837e59;

        static {
            int[] iArr = new int[ManufacturerChecker.Type.values().length];
            f56427x4837e59 = iArr;
            try {
                iArr[ManufacturerChecker.Type.OP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56427x4837e59[ManufacturerChecker.Type.VO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class OperateStorage {
        int equalizerTypeParam;
        boolean isKTVDeviceOpen;
        int listenRecordSameParam;
        int micVolumeParam;
        int mixSoundTypeParam;
        int playFeedbackParam;

        private OperateStorage() {
        }

        public void reset() {
            this.listenRecordSameParam = 0;
            this.playFeedbackParam = 0;
            this.micVolumeParam = 6;
            this.mixSoundTypeParam = 0;
            this.equalizerTypeParam = 0;
        }

        @NonNull
        public String toString() {
            return "isKTVDeviceOpen: " + this.isKTVDeviceOpen + ", recordSame: " + this.listenRecordSameParam + ", playFeedback: " + this.playFeedbackParam + ", micVolume: " + this.micVolumeParam + ", mix: " + this.mixSoundTypeParam + ", eq: " + this.equalizerTypeParam;
        }
    }

    private OVMClient(Context context) {
        this.mNeedDestroyWhenRelease = false;
        this.mNeedDestroyWhenRelease = ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP;
        this.mContext = context.getApplicationContext();
        initClient(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82012a(OVMClient oVMClient) {
        oVMClient.getClass();
        RXLogging.m5744i(TAG, "restart media helper");
        if (!oVMClient.isSupported() || !oVMClient.mStorage.isKTVDeviceOpen) {
            RXLogging.m5742e(TAG, "restart with error, return: " + oVMClient.isSupported() + ", " + oVMClient.mStorage.isKTVDeviceOpen);
            return;
        }
        int i = C135094.f56427x4837e59[ManufacturerChecker.getManufacturerType().ordinal()];
        if (i == 1) {
            oVMClient.initMediaHelper(oVMClient.mRestartAuthCallback);
            return;
        }
        if (i != 2) {
            return;
        }
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = oVMClient.lockMediaHelper();
        if (!oVMClient.mStorage.isKTVDeviceOpen || oVMKaraokeMediaHelperLockMediaHelper == null) {
            return;
        }
        RXLogging.m5744i(TAG, "closeKTVDevice duration restart.");
        oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
        oVMClient.restoreParams(oVMKaraokeMediaHelperLockMediaHelper);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82013b(OVMClient oVMClient) {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = oVMClient.lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper == null || !oVMClient.mStorage.isKTVDeviceOpen) {
            return;
        }
        RXLogging.m5744i(TAG, "openKTVDevice duration restore params.");
        oVMClient.restoreParams(oVMKaraokeMediaHelperLockMediaHelper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestartRunner() {
        this.postHandler.removeCallbacks(this.restartRunnable);
        this.postHandler.removeCallbacks(this.restoreParamsRunnable);
    }

    private void initClient(Context context) {
        RXLogging.m5744i(TAG, "initClient");
        boolean z = false;
        this.mIsSupport = false;
        OperateStorage operateStorage = this.mStorage;
        operateStorage.isKTVDeviceOpen = false;
        operateStorage.reset();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        initMediaHelper(this.mInitCallback);
        boolean z2 = this.mMediaHelper != null;
        this.mIsSupport = z2;
        if (z2) {
            if (isDeviceSupportKaraoke() && isAppSupportKaraoke(context.getPackageName()) && getVersion() >= 10000) {
                z = true;
            }
            this.mIsSupport = z;
        }
        registerHeadsetPlugEvent();
    }

    private void initMediaHelper(OVMAuthManager.AuthCallback authCallback) {
        try {
            OVMKaraokeMediaHelper oVMKaraokeMediaHelperCreate = OVMKaraokeMediaHelper.create(this.mContext);
            this.mMediaHelper = oVMKaraokeMediaHelperCreate;
            if (oVMKaraokeMediaHelperCreate != null) {
                OVMAuthManager.getInstance().addCallback(authCallback);
                OVMAuthManager.getInstance().startAuth(this.mContext, "MEDIA_CLIENT");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            RXLogging.m5743e(TAG, "init media helper error", th);
        }
    }

    public static OVMClient initialize(Context context) {
        if (sClient == null) {
            synchronized (OVMClient.class) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (sClient == null) {
                        sClient = new OVMClient(applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OVMKaraokeMediaHelper lockMediaHelper() {
        if (this.mIsSupport) {
            return this.mMediaHelper;
        }
        return null;
    }

    private boolean needRegisterHeadsetPlug() {
        ManufacturerChecker.Type manufacturerType = ManufacturerChecker.getManufacturerType();
        return manufacturerType == ManufacturerChecker.Type.OP || manufacturerType == ManufacturerChecker.Type.VO;
    }

    private void registerHeadsetPlugEvent() {
        if (this.mIsSupport && this.mContext != null && needRegisterHeadsetPlug()) {
            RXLogging.m5744i(TAG, "registerHeadsetPlug");
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                boolean z = true;
                if (jj5.m145018l(this.mContext, this.headsetPlugReceiver, intentFilter).getIntExtra("state", -99) != 1) {
                    z = false;
                }
                this.mIsHeadsetConnected = z;
            } catch (Throwable th) {
                RXLogging.m5743e(TAG, "registerReceiver error", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartKTVDevice(int i) {
        clearRestartRunner();
        this.postHandler.postDelayed(this.restartRunnable, i);
    }

    private void restoreParams(OVMKaraokeMediaHelper oVMKaraokeMediaHelper) {
        RXLogging.m5744i(TAG, "restore params: " + this.mStorage.toString());
        oVMKaraokeMediaHelper.setPlayFeedbackParam(this.mStorage.playFeedbackParam);
        oVMKaraokeMediaHelper.setListenRecordSame(this.mStorage.listenRecordSameParam);
        oVMKaraokeMediaHelper.setMicVolParam(this.mStorage.micVolumeParam);
        oVMKaraokeMediaHelper.setEqualizerType(this.mStorage.equalizerTypeParam);
        oVMKaraokeMediaHelper.setMixerSoundType(this.mStorage.mixSoundTypeParam);
    }

    private void unRegisterHeadsetPlugEvent() {
        if (this.mContext == null || !needRegisterHeadsetPlug()) {
            return;
        }
        RXLogging.m5744i(TAG, "unregisterHeadsetPlug");
        try {
            this.mContext.unregisterReceiver(this.headsetPlugReceiver);
        } catch (Throwable th) {
            RXLogging.m5743e(TAG, "unregisterReceiver error", th);
        }
    }

    public synchronized void closeKTVDevice() {
        RXLogging.m5744i(TAG, "closeKTVDevice");
        this.mStorage.isKTVDeviceOpen = true;
        clearRestartRunner();
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.closeKTVDevice();
        }
    }

    public String getKaraokeSupportParameters() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        return oVMKaraokeMediaHelperLockMediaHelper != null ? oVMKaraokeMediaHelperLockMediaHelper.getKaraokeSupportParameters() : "";
    }

    public int getListenRecordSame() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper == null) {
            return 0;
        }
        oVMKaraokeMediaHelperLockMediaHelper.getListenRecordSame();
        return 0;
    }

    public int getMicVolParam() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getMicVolParam();
        }
        return 0;
    }

    public int getPlayFeedbackParam() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getPlayFeedbackParam();
        }
        return 0;
    }

    public int getVersion() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.getVersion();
        }
        return -1;
    }

    public boolean isAppSupportKaraoke(String str) {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.isAppSupportKaraoke(str);
        }
        return false;
    }

    public boolean isDeviceSupportKaraoke() {
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            return oVMKaraokeMediaHelperLockMediaHelper.isDeviceSupportKaraoke();
        }
        return false;
    }

    public boolean isSupported() {
        return this.mIsSupport;
    }

    public boolean isSupportedAndAuth() {
        return this.mIsSupport && this.mAuthResultCode == 1001;
    }

    public synchronized void openKTVDevice() {
        RXLogging.m5744i(TAG, "openKTVDevice");
        this.mStorage.isKTVDeviceOpen = true;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.openKTVDevice();
        }
    }

    public void release() {
        RXLogging.m5744i(TAG, "release()");
        OVMAuthManager.getInstance().removeCallback(this.mInitCallback);
        OVMAuthManager.getInstance().removeCallback(this.mRestartAuthCallback);
        unRegisterHeadsetPlugEvent();
        clearRestartRunner();
        if (this.mNeedDestroyWhenRelease) {
            synchronized (OVMClient.class) {
                try {
                    RXLogging.m5744i(TAG, "clear sClient");
                    if (sClient == this) {
                        sClient = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public synchronized void resetKTVParamsAndUpdate() {
        RXLogging.m5744i(TAG, "resetKTVParamsAndUpdate");
        this.mStorage.reset();
        this.postHandler.postDelayed(this.restoreParamsRunnable, 200L);
    }

    public synchronized void setAuthCallback(OVMAuthManager.AuthCallback authCallback) {
        this.mAuthCallback = authCallback;
        int i = this.mAuthResultCode;
        if (i != -2 && authCallback != null) {
            authCallback.onResult(i);
        }
    }

    public void setEqualizerType(int i) {
        RXLogging.m5744i(TAG, "setEqualizerType: " + i);
        this.mStorage.equalizerTypeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setEqualizerType(i);
        }
    }

    public void setListenRecordSame(int i) {
        RXLogging.m5744i(TAG, "setListenRecordSame: " + i);
        this.mStorage.listenRecordSameParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setListenRecordSame(i);
        }
    }

    public void setMicVolParam(int i) {
        RXLogging.m5744i(TAG, "setMicVolParam: " + i);
        this.mStorage.micVolumeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setMicVolParam(i);
        }
    }

    public void setMixerSoundType(int i) {
        RXLogging.m5744i(TAG, "setMixerSoundType: " + i);
        this.mStorage.mixSoundTypeParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setMixerSoundType(i);
        }
    }

    public void setPlayFeedbackParam(int i) {
        RXLogging.m5744i(TAG, "setPlayFeedbackParam: " + i);
        this.mStorage.playFeedbackParam = i;
        OVMKaraokeMediaHelper oVMKaraokeMediaHelperLockMediaHelper = lockMediaHelper();
        if (oVMKaraokeMediaHelperLockMediaHelper != null) {
            oVMKaraokeMediaHelperLockMediaHelper.setPlayFeedbackParam(i);
        }
    }
}
