package com.heytap.mcssdk.p034a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3456b extends AbstractC3457c {
    @Override // com.heytap.mcssdk.p034a.AbstractC3457c
    /* JADX INFO: renamed from: a */
    public final Message mo17461a(Intent intent) {
        try {
            CommandMessage commandMessage = new CommandMessage();
            commandMessage.setCommand(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(CommandMessage.COMMAND))));
            commandMessage.setResponseCode(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra("code"))));
            commandMessage.setContent(CryptoUtil.desDecrypt(intent.getStringExtra("content")));
            commandMessage.setAppKey(CryptoUtil.desDecrypt(intent.getStringExtra("appKey")));
            commandMessage.setAppSecret(CryptoUtil.desDecrypt(intent.getStringExtra(CommandMessage.APP_SECRET)));
            commandMessage.setAppPackage(CryptoUtil.desDecrypt(intent.getStringExtra(Message.APP_PACKAGE)));
            LogUtil.m17465d("OnHandleIntent-message:" + commandMessage.toString());
            return commandMessage;
        } catch (Exception e) {
            LogUtil.m17465d("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.p034a.InterfaceC3458d
    /* JADX INFO: renamed from: a */
    public final Message mo17460a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return mo17461a(intent);
        }
        return null;
    }
}
