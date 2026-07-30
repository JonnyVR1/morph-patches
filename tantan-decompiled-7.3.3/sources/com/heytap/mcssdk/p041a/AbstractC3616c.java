package com.heytap.mcssdk.p041a;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.Message;
import com.heytap.mcssdk.utils.CryptoUtil;
import com.heytap.mcssdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.heytap.mcssdk.a.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3616c implements InterfaceC3617d {
    /* JADX INFO: renamed from: a */
    public static List<Message> m18539a(Context context, Intent intent) {
        int i;
        Message messageMo18537a;
        if (intent == null) {
            return null;
        }
        try {
            i = Integer.parseInt(CryptoUtil.desDecrypt(intent.getStringExtra("type")));
        } catch (Exception e) {
            LogUtil.m18545e("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
            i = 4096;
        }
        LogUtil.m18542d("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3617d interfaceC3617d : PushManager.getInstance().getParsers()) {
            if (interfaceC3617d != null && (messageMo18537a = interfaceC3617d.mo18537a(context, i, intent)) != null) {
                arrayList.add(messageMo18537a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public abstract Message mo18538a(Intent intent);
}
