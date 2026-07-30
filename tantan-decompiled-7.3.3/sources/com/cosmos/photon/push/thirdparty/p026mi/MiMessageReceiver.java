package com.cosmos.photon.push.thirdparty.p026mi;

import android.content.Context;
import android.os.Build;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MiMessageReceiver extends PushMessageReceiver {
    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        IPushBridge iPushBridge;
        PushLogger.m7458i("MiPush onNotificationMessageArrived: " + miPushMessage);
        if (miPushMessage != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (MiPushEngine.pushBridge == null) {
                try {
                    Thread.sleep(100L);
                    if (Math.abs(System.currentTimeMillis() - jCurrentTimeMillis) > 2000) {
                        break;
                    }
                } catch (Exception unused) {
                }
            }
            Map<String, String> extra = miPushMessage.getExtra();
            if (extra == null || !"msg".equals(extra.get("photon_type")) || (iPushBridge = MiPushEngine.pushBridge) == null) {
                return;
            }
            iPushBridge.onReceivePassThroughMessage(2, miPushMessage.getContent());
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if ("register".equals(command)) {
            boolean zEqualsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI);
            PushLogger.m7458i("Xiaomi register result:" + miPushCommandMessage.getResultCode());
            if (miPushCommandMessage.getResultCode() == 0) {
                if (zEqualsIgnoreCase) {
                    MiPushEngine.pushBridge.onPushRegisterResult(10, 1001, str);
                }
                PushLogger.m7458i("MiPush ID from Xiaomi:" + str);
            } else {
                MiPushEngine.pushBridge.onPushRegisterResult(10, 1002, str);
            }
        }
        try {
            ThirdPartyEventReporter.logRegCallback(HardwareEarMonitorUtils.MANUFACTURER_XIAOMI, (int) miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason());
        } catch (Throwable unused) {
        }
    }
}
