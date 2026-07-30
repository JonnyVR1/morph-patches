package com.heytap.mcssdk.p041a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C3615b extends AbstractC3616c {
    @Override // com.heytap.mcssdk.p041a.AbstractC3616c
    /* JADX INFO: renamed from: a */
    public final Message mo18538a(Intent intent) {
        try {
            CommandMessage commandMessage = new CommandMessage();
            commandMessage.setCommand(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra(CommandMessage.COMMAND))));
            commandMessage.setResponseCode(Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra("code"))));
            commandMessage.setContent(CryptoUtil.desDecrypt(intent.getStringExtra("content")));
            commandMessage.setAppKey(CryptoUtil.desDecrypt(intent.getStringExtra("appKey")));
            commandMessage.setAppSecret(CryptoUtil.desDecrypt(intent.getStringExtra(CommandMessage.APP_SECRET)));
            commandMessage.setAppPackage(CryptoUtil.desDecrypt(intent.getStringExtra(Message.APP_PACKAGE)));
            LogUtil.m18542d("OnHandleIntent-message:" + commandMessage.toString());
            return commandMessage;
        } catch (Exception e) {
            LogUtil.m18542d("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    @Override // com.heytap.mcssdk.p041a.InterfaceC3617d
    /* JADX INFO: renamed from: a */
    public final Message mo18537a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return mo18538a(intent);
        }
        return null;
    }
}
