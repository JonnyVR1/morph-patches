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
public class C4116a implements IPushEngine {

    /* JADX INFO: renamed from: b */
    protected static IPushBridge f14773b;

    /* JADX INFO: renamed from: a */
    private final Context f14774a;

    /* JADX INFO: renamed from: com.immomo.push.thirdparty.honor.a$a */
    public class a implements HonorPushCallback<String> {
        public a() {
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            C4116a.f14773b.onPushRegisterResult(10, 1001, str);
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_HONOR, 0, "");
            PushLogger.m7458i("荣耀push注册，获取token：" + str);
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
            C4116a.f14773b.onUnRegisterResult(11, 3001);
            PushLogger.m7456e("荣耀push注销结果：success");
        }

        @Override // com.hihonor.push.sdk.HonorPushCallback
        public void onFailure(int i, String str) {
            C4116a.f14773b.onUnRegisterResult(11, 3002);
            PushLogger.m7456e("荣耀push注销结果：fail");
        }
    }

    public C4116a(IPushBridge iPushBridge) {
        this.f14774a = iPushBridge.getContext();
        f14773b = iPushBridge;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20455a(Context context) {
        return HonorPushClient.getInstance().checkSupportHonorPush(context);
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void clearNotify() {
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void register() {
        ThirdPartyEventReporter.logReg(HardwareEarMonitorUtils.MANUFACTURER_HONOR);
        HonorPushClient.getInstance().init(this.f14774a, true);
        try {
            HonorPushClient.getInstance().getPushToken(new a());
        } catch (Exception e) {
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_HONOR, -1, "");
            e.printStackTrace();
        }
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void unregister() {
        if (TextUtils.isEmpty(f14773b.getRegisteredToken())) {
            f14773b.onUnRegisterResult(11, 3002);
            PushLogger.m7456e("荣耀push注销失败，token为空");
            return;
        }
        try {
            HonorPushClient.getInstance().deletePushToken(new b());
        } catch (Exception e) {
            f14773b.onUnRegisterResult(11, 3002);
            PushLogger.m7456e("荣耀push注销结果：fail");
            e.printStackTrace();
        }
    }
}
