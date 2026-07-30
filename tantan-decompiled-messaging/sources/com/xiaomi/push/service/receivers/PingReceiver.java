package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.AbstractC14843an;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;
import p149l.ilq0;
import p149l.uqq0;

/* JADX INFO: loaded from: classes2.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ilq0.m137053z(intent.getPackage() + " is the package name");
        if (XMPushService.m86328e()) {
            return;
        }
        if (!AbstractC14843an.f62952q.equals(intent.getAction())) {
            ilq0.m137040m("cancel the old ping timer");
            uqq0.m194994a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            ilq0.m137053z("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                ServiceClient.getInstance(context).startServiceSafely(intent2);
            } catch (Exception e) {
                ilq0.m137044q(e);
            }
        }
    }
}
