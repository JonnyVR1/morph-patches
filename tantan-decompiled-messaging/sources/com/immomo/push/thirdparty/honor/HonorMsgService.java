package com.immomo.push.thirdparty.honor;

import com.cosmos.photon.push.thirdparty.PushLogger;
import com.hihonor.push.sdk.HonorMessageService;
import com.hihonor.push.sdk.HonorPushDataMsg;

/* JADX INFO: loaded from: classes7.dex */
public class HonorMsgService extends HonorMessageService {
    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
        try {
            C3965a.f14054b.onReceivePassThroughMessage(10, honorPushDataMsg.getData());
        } catch (Exception e) {
            PushLogger.printStack(e);
        }
    }

    @Override // com.hihonor.push.sdk.HonorMessageService
    public void onNewToken(String str) {
        C3965a.f14054b.onPushRegisterResult(10, 1001, str);
    }
}
