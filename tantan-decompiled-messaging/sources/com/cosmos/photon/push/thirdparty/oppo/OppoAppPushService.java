package com.cosmos.photon.push.thirdparty.oppo;

import android.content.Context;
import com.heytap.mcssdk.AppPushService;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.SptDataMessage;

/* JADX INFO: loaded from: classes.dex */
public class OppoAppPushService extends AppPushService {
    @Override // com.heytap.mcssdk.AppPushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, SptDataMessage sptDataMessage) {
        super.processMessage(context.getApplicationContext(), sptDataMessage);
    }

    @Override // com.heytap.mcssdk.AppPushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, AppMessage appMessage) {
        super.processMessage(context, appMessage);
    }

    @Override // com.heytap.mcssdk.AppPushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, CommandMessage commandMessage) {
        super.processMessage(context, commandMessage);
    }
}
