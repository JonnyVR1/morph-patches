package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.mipush.sdk.EnumC14726v;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.service.ServiceClient;
import p149l.ct3;
import p149l.gkq0;
import p149l.gwq0;
import p149l.ilq0;
import p149l.jtq0;
import p149l.quk;
import p149l.vvq0;
import p149l.xsf;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static boolean f63104a = false;

    /* JADX INFO: renamed from: b */
    private boolean f63105b = true;

    public NetworkStatusReceiver(Object obj) {
        f63104a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m86785a(Context context) {
        if (!C14722f.m85402h(context).m85416J() && C14719c.m85328c(context).m85345s() && !C14719c.m85328c(context).m85351y()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e) {
                ilq0.m137044q(e);
            }
        }
        jtq0.m143166h(context);
        if (gkq0.m126691t(context) && C14722f.m85402h(context).m85420Q()) {
            C14722f.m85402h(context).m85421S();
        }
        if (gkq0.m126691t(context)) {
            if ("syncing".equals(gwq0.m128497c(context).m128499b(EnumC14726v.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(gwq0.m128497c(context).m128499b(EnumC14726v.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            gwq0 gwq0VarM128497c = gwq0.m128497c(context);
            EnumC14726v enumC14726v = EnumC14726v.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(gwq0VarM128497c.m128499b(enumC14726v))) {
                C14722f.m85402h(context).m85412E(null, enumC14726v, EnumC14720d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            if ("syncing".equals(gwq0.m128497c(context).m128499b(EnumC14726v.UPLOAD_FCM_TOKEN))) {
                C14722f.m85402h(context).m85412E(null, enumC14726v, EnumC14720d.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            gwq0 gwq0VarM128497c2 = gwq0.m128497c(context);
            EnumC14726v enumC14726v2 = EnumC14726v.UPLOAD_COS_TOKEN;
            if ("syncing".equals(gwq0VarM128497c2.m128499b(enumC14726v2))) {
                C14722f.m85402h(context).m85412E(null, enumC14726v2, EnumC14720d.ASSEMBLE_PUSH_COS, "net");
            }
            gwq0 gwq0VarM128497c3 = gwq0.m128497c(context);
            EnumC14726v enumC14726v3 = EnumC14726v.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(gwq0VarM128497c3.m128499b(enumC14726v3))) {
                C14722f.m85402h(context).m85412E(null, enumC14726v3, EnumC14720d.ASSEMBLE_PUSH_FTOS, "net");
            }
            if (quk.m176620a() && quk.m176623d(context)) {
                quk.m176622c(context);
                quk.m176621b(context);
            }
            ct3.m108654a(context);
            xsf.m210740b(context);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        if (this.f63105b) {
            return;
        }
        gkq0.m126689r();
        vvq0.m200203e().post(new Runnable() { // from class: com.xiaomi.push.service.receivers.NetworkStatusReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                NetworkStatusReceiver.this.m86785a(context);
            }
        });
    }

    public NetworkStatusReceiver() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86787a() {
        return f63104a;
    }
}
