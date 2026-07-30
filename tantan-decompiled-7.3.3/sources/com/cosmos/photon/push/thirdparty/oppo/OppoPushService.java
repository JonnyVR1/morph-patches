package com.cosmos.photon.push.thirdparty.oppo;

import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.SptDataMessage;

/* JADX INFO: loaded from: classes.dex */
public class OppoPushService extends PushService {
    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, AppMessage appMessage) {
        super.processMessage(context, appMessage);
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, SptDataMessage sptDataMessage) {
        super.processMessage(context, sptDataMessage);
    }

    @Override // com.heytap.mcssdk.PushService, com.heytap.mcssdk.callback.MessageCallback
    public void processMessage(Context context, CommandMessage commandMessage) {
        super.processMessage(context, commandMessage);
    }
}
