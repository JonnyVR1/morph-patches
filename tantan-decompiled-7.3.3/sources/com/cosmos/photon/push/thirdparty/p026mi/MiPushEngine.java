package com.cosmos.photon.push.thirdparty.p026mi;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.IPushEngine;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.xiaomi.mipush.sdk.MiPushClient;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes.dex */
public class MiPushEngine implements IPushEngine {
    static IPushBridge pushBridge;

    public MiPushEngine(IPushBridge iPushBridge) {
        pushBridge = iPushBridge;
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void clearNotify() {
        MiPushClient.clearNotification(pushBridge.getContext());
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void register() {
        try {
            ThirdPartyEventReporter.logReg(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI);
            Bundle bundle = pushBridge.getContext().getPackageManager().getApplicationInfo(pushBridge.getContext().getPackageName(), 128).metaData;
            String strValueOf = String.valueOf(bundle.get("MI_PUSH_APPID"));
            String strValueOf2 = String.valueOf(bundle.get("MI_PUSH_APPKEY"));
            PushLogger.m7458i("mipush register " + strValueOf + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strValueOf2);
            MiPushClient.registerPush(pushBridge.getContext(), strValueOf, strValueOf2);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void unregister() {
        MiPushClient.unregisterPush(pushBridge.getContext());
        PushLogger.m7456e("小米push 注销成功");
        pushBridge.onUnRegisterResult(11, 3001);
    }
}
