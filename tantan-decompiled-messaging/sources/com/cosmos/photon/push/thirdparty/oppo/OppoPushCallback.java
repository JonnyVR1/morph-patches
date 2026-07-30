package com.cosmos.photon.push.thirdparty.oppo;

import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.heytap.mcssdk.callback.PushCallback;
import com.heytap.mcssdk.mode.SubscribeResult;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OppoPushCallback implements PushCallback {
    OppoPushEngine mPushEngine;

    public OppoPushCallback(OppoPushEngine oppoPushEngine) {
        this.mPushEngine = oppoPushEngine;
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onGetAliases(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onGetNotificationStatus(int i, int i2) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onGetPushStatus(int i, int i2) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onGetTags(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onGetUserAccounts(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onRegister(int i, String str) {
        ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_OPPO, i, str);
        if (i != 0) {
            PushLogger.m7404i("OPush register 失败:" + i + " message:" + str);
            OppoPushEngine oppoPushEngine = this.mPushEngine;
            oppoPushEngine.isUnregisterFail = false;
            oppoPushEngine.pushBridge.onPushRegisterResult(10, 1002, null);
            return;
        }
        PushLogger.m7404i("OPush register 成功");
        PushLogger.m7404i("RegistrationId:" + str);
        OppoPushEngine oppoPushEngine2 = this.mPushEngine;
        if (oppoPushEngine2.isUnregisterFail) {
            oppoPushEngine2.unregister();
        } else {
            oppoPushEngine2.pushBridge.onPushRegisterResult(10, 1001, str);
        }
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onSetAliases(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onSetPushTime(int i, String str) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onSetTags(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onSetUserAccounts(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onUnRegister(int i) {
        if (i == 0) {
            PushLogger.m7404i("OPush 注销 成功");
            this.mPushEngine.pushBridge.onUnRegisterResult(11, 3001);
        } else {
            PushLogger.m7404i("OPush 注销 失败:" + i);
            this.mPushEngine.pushBridge.onUnRegisterResult(11, 3002);
        }
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onUnsetAliases(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onUnsetTags(int i, List<SubscribeResult> list) {
    }

    @Override // com.heytap.mcssdk.callback.PushCallback
    public void onUnsetUserAccounts(int i, List<SubscribeResult> list) {
    }
}
