package com.immomo.push.thirdparty.honor;

import android.content.Context;
import android.text.TextUtils;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.IPushEngine;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.hihonor.push.sdk.HonorPushCallback;
import com.hihonor.push.sdk.HonorPushClient;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: renamed from: com.immomo.push.thirdparty.honor.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3965a implements IPushEngine {

    /* JADX INFO: renamed from: b */
    protected static IPushBridge f14054b;

    /* JADX INFO: renamed from: a */
    private final Context f14055a;

    /* JADX INFO: renamed from: com.immomo.push.thirdparty.honor.a$a */
    public class a implements HonorPushCallback<String> {
        public a() {
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            C3965a.f14054b.onPushRegisterResult(10, 1001, str);
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_HONOR, 0, "");
            PushLogger.m7404i("荣耀push注册，获取token：" + str);
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        public void onFailure(int i, String str) {
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_HONOR, i, str);
        }
    }

    /* JADX INFO: renamed from: com.immomo.push.thirdparty.honor.a$b */
    public class b implements HonorPushCallback<Void> {
        public b() {
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            C3965a.f14054b.onUnRegisterResult(11, 3001);
            PushLogger.m7402e("荣耀push注销结果：success");
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        public void onFailure(int i, String str) {
            C3965a.f14054b.onUnRegisterResult(11, 3002);
            PushLogger.m7402e("荣耀push注销结果：fail");
        }
    }

    public C3965a(IPushBridge iPushBridge) {
        this.f14055a = iPushBridge.getContext();
        f14054b = iPushBridge;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m19456a(Context context) {
        return HonorPushClient.getInstance().checkSupportHonorPush(context);
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void clearNotify() {
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void register() {
        ThirdPartyEventReporter.logReg(HardwareEarMonitorUtils.MANUFACTURER_HONOR);
        HonorPushClient.getInstance().init(this.f14055a, true);
        try {
            HonorPushClient.getInstance().getPushToken(new a());
        } catch (Exception e) {
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_HONOR, -1, "");
            e.printStackTrace();
        }
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void unregister() {
        if (TextUtils.isEmpty(f14054b.getRegisteredToken())) {
            f14054b.onUnRegisterResult(11, 3002);
            PushLogger.m7402e("荣耀push注销失败，token为空");
            return;
        }
        try {
            HonorPushClient.getInstance().deletePushToken(new b());
        } catch (Exception e) {
            f14054b.onUnRegisterResult(11, 3002);
            PushLogger.m7402e("荣耀push注销结果：fail");
            e.printStackTrace();
        }
    }
}
