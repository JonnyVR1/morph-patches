package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.AbstractC14991an;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;
import p153l.a0r0;
import p153l.ouq0;

/* JADX INFO: loaded from: classes2.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ouq0.m169406z(intent.getPackage() + " is the package name");
        if (XMPushService.m87499e()) {
            return;
        }
        if (!AbstractC14991an.f63799q.equals(intent.getAction())) {
            ouq0.m169393m("cancel the old ping timer");
            a0r0.m95409a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            ouq0.m169406z("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                ServiceClient.getInstance(context).startServiceSafely(intent2);
            } catch (Exception e) {
                ouq0.m169397q(e);
            }
        }
    }
}
