package com.cosmos.photon.push.thirdparty.oppo;

import android.content.Context;
import android.os.Bundle;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.IPushEngine;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.PushManager;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes.dex */
public class OppoPushEngine implements IPushEngine {
    IPushBridge pushBridge;
    boolean isUnregisterFail = false;
    private int unregisterFailRetryNumber = 0;

    public OppoPushEngine(IPushBridge iPushBridge) {
        this.pushBridge = iPushBridge;
    }

    public static boolean isSupport(Context context) {
        boolean zIsSupportPush = PushManager.isSupportPush(context);
        if (!zIsSupportPush) {
            PushLogger.m7456e("OppoPush not support");
        }
        ThirdPartyEventReporter.logIsSupport(HardwareEarMonitorUtils.MANUFACTURER_OPPO, zIsSupportPush);
        return zIsSupportPush;
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void clearNotify() {
        if (PushManager.isSupportPush(this.pushBridge.getContext())) {
            try {
                PushManager.getInstance().clearNotifications();
            } catch (Exception e) {
                PushLogger.printStack(e);
            }
        }
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void register() {
        try {
            if (!this.isUnregisterFail) {
                this.unregisterFailRetryNumber = 0;
            }
            Bundle bundle = this.pushBridge.getContext().getPackageManager().getApplicationInfo(this.pushBridge.getContext().getPackageName(), 128).metaData;
            String string = bundle.getString("OPPO_PUSH_APPKEY");
            String string2 = bundle.getString("OPPO_PUSH_SECRET");
            ThirdPartyEventReporter.logReg(HardwareEarMonitorUtils.MANUFACTURER_OPPO);
            PushLogger.m7458i("oppopush register " + string2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string);
            PushManager.getInstance().register(this.pushBridge.getContext(), string, string2, new OppoPushCallback(this));
        } catch (Exception e) {
            this.isUnregisterFail = false;
            PushLogger.m7458i("OPush register 失败:" + e.getMessage());
        }
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void unregister() {
        this.isUnregisterFail = false;
        try {
            PushManager.getInstance().unRegister();
        } catch (Exception e) {
            PushLogger.m7458i("OPush unregister 失败:" + e.getMessage());
            int i = this.unregisterFailRetryNumber;
            if (i == 0) {
                this.unregisterFailRetryNumber = i + 1;
                this.isUnregisterFail = true;
                register();
            }
        }
    }
}
