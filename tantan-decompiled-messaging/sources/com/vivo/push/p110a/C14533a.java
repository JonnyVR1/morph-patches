package com.vivo.push.p110a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;
import com.vivo.push.ServiceConnectionC14534b;
import com.vivo.push.p112c.C14565d;
import com.vivo.push.util.C14632a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.C14652u;
import java.util.List;
import p149l.whq0;

/* JADX INFO: renamed from: com.vivo.push.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14533a {
    /* JADX INFO: renamed from: a */
    public static void m84728a(Context context, AbstractC14621o abstractC14621o, String str) {
        try {
            boolean zM85037d = C14651t.m85037d(context, str);
            String str2 = zM85037d ? "com.vivo.pushservice.action.RECEIVE" : "com.vivo.pushclient.action.RECEIVE";
            if (TextUtils.isEmpty(str)) {
                C14647p.m85020c(context, "消息接受者包名为空！");
                throw new Exception("消息接受者包名为空！");
            }
            if (!zM85037d && !m84730a(context, str2, str)) {
                return;
            }
            if (TextUtils.isEmpty(abstractC14621o.m84929a())) {
                abstractC14621o.m84932a(context.getPackageName());
            }
            Intent intent = new Intent();
            intent.setFlags(1048576);
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction(str2);
            }
            intent.setPackage(str);
            intent.setClassName(str, zM85037d ? "com.vivo.push.sdk.service.CommandService" : "com.vivo.push.sdk.service.CommandClientService");
            intent.putExtra("security_avoid_pull", C14632a.m84952a(context).m84955a("com.vivo.pushservice"));
            abstractC14621o.m84934b(intent);
            intent.putExtra("command_type", "reflect_receiver");
            intent.putExtra("security_avoid_pull_rsa", C14565d.m84793a(context).m84794a().mo84790a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", C14652u.m85042a(C14565d.m84793a(context).m84794a().mo84791a()));
            m84727a(context, intent);
        } catch (Exception e) {
            C14647p.m85009a("CommandBridge", "CommandBridge sendCommandToClient exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m84727a(Context context, Intent intent) throws Exception {
        if (context == null) {
            C14647p.m85021d("CommandBridge", "enter startService context is null");
            whq0.m203241a("context is null");
            return;
        }
        try {
            context.startService(intent);
        } catch (Exception e) {
            C14647p.m85009a("CommandBridge", "start service error", e);
            intent.setComponent(null);
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m84729a(Context context, String str, AbstractC14621o abstractC14621o) {
        boolean zMo84782c = abstractC14621o.mo84782c();
        ServiceConnectionC14534b serviceConnectionC14534bM84731a = ServiceConnectionC14534b.m84731a(context, zMo84782c ? "com.vivo.vms.upstageservice" : "com.vivo.vms.aidlservice");
        boolean zM84741a = serviceConnectionC14534bM84731a.m84741a();
        if (TextUtils.isEmpty(abstractC14621o.m84929a())) {
            abstractC14621o.m84932a(context.getPackageName());
        }
        if (zM84741a && !"com.vivo.pushservice".equals(context.getPackageName())) {
            C14532a c14532a = new C14532a(abstractC14621o.m84929a(), str, new Bundle());
            abstractC14621o.m84931a(c14532a);
            if (serviceConnectionC14534bM84731a.m84742a(c14532a.m84722b())) {
                return;
            }
            C14647p.m85015b("CommandBridge", "send command error by aidl");
            C14647p.m85020c(context, "send command error by aidl");
        }
        Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
        intent.setPackage(str);
        intent.setClassName(str, zMo84782c ? "com.vivo.push.sdk.service.UpstageService" : "com.vivo.push.sdk.service.PushService");
        abstractC14621o.m84930a(intent);
        try {
            m84727a(context, intent);
        } catch (Exception e) {
            C14647p.m85009a("CommandBridge", "CommandBridge startService exception: ", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84730a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage(str2);
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                return true;
            }
            C14647p.m85015b("CommandBridge", "action check error：action>>" + str + ";pkgname>>" + str2);
            return false;
        } catch (Exception unused) {
            C14647p.m85015b("CommandBridge", "queryBroadcastReceivers error");
            return false;
        }
    }
}
