package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.C14867c;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.mipush.sdk.EnumC14874v;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.service.ServiceClient;
import p153l.b5r0;
import p153l.bu3;
import p153l.gxk;
import p153l.luf;
import p153l.m5r0;
import p153l.mtq0;
import p153l.ouq0;
import p153l.p2r0;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static boolean f63951a = false;

    /* JADX INFO: renamed from: b */
    private boolean f63952b = true;

    public NetworkStatusReceiver(Object obj) {
        f63951a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m87956a(Context context) {
        if (!C14870f.m86573h(context).m86587J() && C14867c.m86499c(context).m86516s() && !C14867c.m86499c(context).m86522y()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e) {
                ouq0.m169397q(e);
            }
        }
        p2r0.m170390h(context);
        if (mtq0.m160044t(context) && C14870f.m86573h(context).m86591Q()) {
            C14870f.m86573h(context).m86592S();
        }
        if (mtq0.m160044t(context)) {
            if ("syncing".equals(m5r0.m157115c(context).m157117b(EnumC14874v.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(m5r0.m157115c(context).m157117b(EnumC14874v.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            m5r0 m5r0VarM157115c = m5r0.m157115c(context);
            EnumC14874v enumC14874v = EnumC14874v.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(m5r0VarM157115c.m157117b(enumC14874v))) {
                C14870f.m86573h(context).m86583E(null, enumC14874v, EnumC14868d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            if ("syncing".equals(m5r0.m157115c(context).m157117b(EnumC14874v.UPLOAD_FCM_TOKEN))) {
                C14870f.m86573h(context).m86583E(null, enumC14874v, EnumC14868d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            m5r0 m5r0VarM157115c2 = m5r0.m157115c(context);
            EnumC14874v enumC14874v2 = EnumC14874v.UPLOAD_COS_TOKEN;
            if ("syncing".equals(m5r0VarM157115c2.m157117b(enumC14874v2))) {
                C14870f.m86573h(context).m86583E(null, enumC14874v2, EnumC14868d.ASSEMBLE_PUSH_COS, "net");
            }
            m5r0 m5r0VarM157115c3 = m5r0.m157115c(context);
            EnumC14874v enumC14874v3 = EnumC14874v.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(m5r0VarM157115c3.m157117b(enumC14874v3))) {
                C14870f.m86573h(context).m86583E(null, enumC14874v3, EnumC14868d.ASSEMBLE_PUSH_FTOS, "net");
            }
            if (gxk.m132872a() && gxk.m132875d(context)) {
                gxk.m132874c(context);
                gxk.m132873b(context);
            }
            bu3.m106422a(context);
            luf.m155924b(context);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        if (this.f63952b) {
            return;
        }
        mtq0.m160042r();
        b5r0.m102625e().post(new Runnable() { // from class: com.xiaomi.push.service.receivers.NetworkStatusReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                NetworkStatusReceiver.this.m87956a(context);
            }
        });
    }

    public NetworkStatusReceiver() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87958a() {
        return f63951a;
    }
}
