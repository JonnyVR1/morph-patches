package com.cosmos.photon.push.thirdparty.vivo;

import android.content.Context;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.IPushEngine;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.util.VivoPushException;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;

/* JADX INFO: loaded from: classes.dex */
public class VivoPushEngine implements IPushEngine {
    static IPushBridge pushBridge;

    public VivoPushEngine(IPushBridge iPushBridge) {
        pushBridge = iPushBridge;
    }

    public static boolean isSupport(Context context) {
        if (PushClient.getInstance(context).isSupport()) {
            ThirdPartyEventReporter.logIsSupport(HardwareEarMonitorUtils.MANUFACTURER_VIVO, true);
            return true;
        }
        PushLogger.m7456e("vivo push not support");
        ThirdPartyEventReporter.logIsSupport(HardwareEarMonitorUtils.MANUFACTURER_VIVO, false);
        return false;
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void clearNotify() {
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void register() {
        try {
            PushClient.getInstance(pushBridge.getContext()).initialize();
        } catch (VivoPushException e) {
            e.printStackTrace();
        }
        ThirdPartyEventReporter.logReg(HardwareEarMonitorUtils.MANUFACTURER_VIVO);
        PushClient.getInstance(pushBridge.getContext()).turnOnPush(new IPushActionListener() { // from class: com.cosmos.photon.push.thirdparty.vivo.VivoPushEngine.1
            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                IPushBridge iPushBridge = VivoPushEngine.pushBridge;
                iPushBridge.onPushRegisterResult(10, 1001, i == 0 ? PushClient.getInstance(iPushBridge.getContext()).getRegId() : "");
                ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_VIVO, i, "");
            }
        });
    }

    @Override // com.cosmos.photon.push.thirdparty.IPushEngine
    public void unregister() {
        PushClient.getInstance(pushBridge.getContext()).turnOffPush(new IPushActionListener() { // from class: com.cosmos.photon.push.thirdparty.vivo.VivoPushEngine.2
            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                VivoPushEngine.pushBridge.onPushRegisterResult(11, i == 0 ? 3001 : 3002, null);
            }
        });
    }
}
