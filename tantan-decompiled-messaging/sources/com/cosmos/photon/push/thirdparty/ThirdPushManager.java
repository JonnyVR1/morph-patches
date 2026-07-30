package com.cosmos.photon.push.thirdparty;

import android.app.Application;
import android.content.Context;
import com.cosmos.photon.push.thirdparty.fcm.FcmPushEngine;
import com.cosmos.photon.push.thirdparty.huawei.HWPushEngine;
import com.cosmos.photon.push.thirdparty.meizu.MeizuPushEngine;
import com.cosmos.photon.push.thirdparty.oppo.OppoPushEngine;
import com.cosmos.photon.push.thirdparty.p025mi.MiPushEngine;
import com.cosmos.photon.push.thirdparty.vivo.VivoPushEngine;
import com.immomo.push.thirdparty.honor.C3965a;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPushManager {
    public static final int TYPE_PUSH_FCM = 105;
    public static final int TYPE_PUSH_HONOR = 10;
    public static final int TYPE_PUSH_HUAWEI = 3;
    public static final int TYPE_PUSH_MEIZU = 6;
    public static final int TYPE_PUSH_MI = 1;
    public static final int TYPE_PUSH_MI_OVERSEA = 7;
    public static final int TYPE_PUSH_NONE = 0;
    public static final int TYPE_PUSH_OPPO = 4;
    public static final int TYPE_PUSH_VIVO = 5;
    public static final String VENDOR_TYPE_FCM = "Google";
    public static final String VENDOR_TYPE_HONOR = "HONOR";
    public static final String VENDOR_TYPE_HUAWEI = "Huawei";
    public static final String VENDOR_TYPE_MEIZU = "MEIZU";
    public static final String VENDOR_TYPE_OPPO = "Oppo";
    public static final String VENDOR_TYPE_VIVO = "Vivo";
    public static final String VENDOR_TYPE_XIAOMI = "Xiaomi";
    public static final String XIAOMI_OVERSEA_PREFIX = "QiangGe_666_888_999";
    private static IPushEngine fcmEngine;
    private static Application mContext;
    public static volatile boolean mEnableFcmPush;
    private static volatile boolean mEnableHWPush;
    private static volatile boolean mEnableHonorPush;
    private static volatile boolean mEnableMeizuPush;
    private static volatile boolean mEnableMiPush;
    private static volatile boolean mEnableOPPOPush;
    private static volatile boolean mEnableVIVOPush;
    private static IPushEngine pushEngine;

    public class DefaultBridge extends PushBridge {
        private String registerToken;

        public DefaultBridge() {
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public String getRegisteredToken() {
            return this.registerToken;
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onGetTokenResult(boolean z, String str) {
            PushLogger.m7404i("DefaultBridge onGetTokenResult ----> " + z + " - " + str);
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onPushRegisterResult(int i, int i2, String str) {
            PushLogger.m7404i("DefaultBridge onPushRegisterResult ----> " + i + " - " + i2 + " - " + str);
            this.registerToken = str;
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onReceiveAssistThirdNotification(int i, NotificationWrapper notificationWrapper) {
            PushLogger.m7404i("DefaultBridge onReceiveAssistThirdNotification ----> " + i + " - " + notificationWrapper);
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onReceiveAssistThirdToken(int i, String str) {
            PushLogger.m7404i("DefaultBridge onReceiveAssistThirdToken ----> " + i + " - " + str);
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onReceivePassThroughMessage(int i, String str) {
            PushLogger.m7404i("DefaultBridge onReceivePassThroughMessage ----> " + i + " - " + str);
        }

        @Override // com.cosmos.photon.push.thirdparty.IPushBridge
        public void onUnRegisterResult(int i, int i2) {
            PushLogger.m7404i("DefaultBridge onUnRegisterResult ----> " + i + " - " + i2);
        }
    }

    public static class SingletonHolder {
        private static final ThirdPushManager manager = new ThirdPushManager();

        private SingletonHolder() {
        }
    }

    public static ThirdPushManager getInstance() {
        return SingletonHolder.manager;
    }

    public static int getPushSdk() {
        if (mEnableMiPush && RomUtil.isMiui()) {
            return mEnableFcmPush ? 7 : 1;
        }
        if (mEnableHWPush && RomUtil.isEmui() && HWPushEngine.isSupport(mContext)) {
            return 3;
        }
        if (mEnableOPPOPush && RomUtil.isOppoSupport() && OppoPushEngine.isSupport(mContext)) {
            return 4;
        }
        if (mEnableVIVOPush && RomUtil.isVivo() && VivoPushEngine.isSupport(mContext)) {
            return 5;
        }
        if (mEnableMeizuPush && RomUtil.isFlyme()) {
            return 6;
        }
        return (mEnableHonorPush && RomUtil.isHonor()) ? 10 : 0;
    }

    public static boolean useThirdPush() {
        return getPushSdk() != 0;
    }

    public void clearNotify() {
        IPushEngine iPushEngine = pushEngine;
        if (iPushEngine != null) {
            iPushEngine.clearNotify();
        }
        IPushEngine iPushEngine2 = fcmEngine;
        if (iPushEngine2 != null) {
            iPushEngine2.clearNotify();
        }
    }

    public Context getContext() {
        return mContext;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    public void init(Application application, PushBridge pushBridge, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        mContext = application;
        mEnableMiPush = z;
        mEnableHWPush = z2;
        mEnableOPPOPush = z3;
        mEnableVIVOPush = z4;
        mEnableMeizuPush = z5;
        mEnableFcmPush = z6;
        mEnableHonorPush = z7;
        ThirdPartyEventReporter.setBridge(pushBridge);
        int pushSdk = getPushSdk();
        if (pushSdk == 1) {
            pushEngine = new MiPushEngine(pushBridge);
        } else if (pushSdk == 10) {
            pushEngine = new C3965a(pushBridge);
        } else if (pushSdk == 3) {
            pushEngine = new HWPushEngine(pushBridge);
        } else if (pushSdk == 4) {
            pushEngine = new OppoPushEngine(pushBridge);
        } else if (pushSdk == 5) {
            pushEngine = new VivoPushEngine(pushBridge);
        } else if (pushSdk == 6) {
            pushEngine = new MeizuPushEngine(pushBridge);
        } else if (pushSdk != 7) {
            PushLogger.m7402e("this device not support vendor push");
        } else {
            pushEngine = new MiPushEngine(pushBridge);
        }
        if (mEnableFcmPush) {
            fcmEngine = new FcmPushEngine(pushBridge);
        }
    }

    public void register() {
        PushLogger.m7404i("ThirdPushManager register");
        IPushEngine iPushEngine = pushEngine;
        if (iPushEngine != null) {
            iPushEngine.register();
        }
        IPushEngine iPushEngine2 = fcmEngine;
        if (iPushEngine2 != null) {
            iPushEngine2.register();
        }
    }

    public void unregister() {
        PushLogger.m7404i("ThirdPushManager unregisterregister");
        IPushEngine iPushEngine = pushEngine;
        if (iPushEngine != null) {
            iPushEngine.unregister();
        }
        IPushEngine iPushEngine2 = fcmEngine;
        if (iPushEngine2 != null) {
            iPushEngine2.unregister();
        }
    }

    public void init(Application application, PushBridge pushBridge) {
        init(application, pushBridge, false, false, false, false, false);
    }

    public void init(Application application, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        init(application, new DefaultBridge(), z, z2, z3, z4, z5);
    }

    public void init(Application application, PushBridge pushBridge, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        init(application, pushBridge, z, z2, z3, z4, z5, false);
    }

    public void init(Application application, PushBridge pushBridge, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        init(application, pushBridge, z, z2, z3, z4, z5, z6, false);
    }

    public void init(Application application) {
        init(application, false, false, false, false, false);
    }
}
