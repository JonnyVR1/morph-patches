package com.vivo.push.p115a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;
import com.vivo.push.ServiceConnectionC14682b;
import com.vivo.push.p117c.C14713d;
import com.vivo.push.util.C14780a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import com.vivo.push.util.C14800u;
import java.util.List;
import p153l.brq0;

/* JADX INFO: renamed from: com.vivo.push.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14681a {
    /* JADX INFO: renamed from: a */
    public static void m85899a(Context context, AbstractC14769o abstractC14769o, String str) {
        try {
            boolean zM86208d = C14799t.m86208d(context, str);
            String str2 = zM86208d ? "com.vivo.pushservice.action.RECEIVE" : "com.vivo.pushclient.action.RECEIVE";
            if (TextUtils.isEmpty(str)) {
                C14795p.m86191c(context, "消息接受者包名为空！");
                throw new Exception("消息接受者包名为空！");
            }
            if (!zM86208d && !m85901a(context, str2, str)) {
                return;
            }
            if (TextUtils.isEmpty(abstractC14769o.m86100a())) {
                abstractC14769o.m86103a(context.getPackageName());
            }
            Intent intent = new Intent();
            intent.setFlags(1048576);
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction(str2);
            }
            intent.setPackage(str);
            intent.setClassName(str, zM86208d ? "com.vivo.push.sdk.service.CommandService" : "com.vivo.push.sdk.service.CommandClientService");
            intent.putExtra("security_avoid_pull", C14780a.m86123a(context).m86126a("com.vivo.pushservice"));
            abstractC14769o.m86105b(intent);
            intent.putExtra("command_type", "reflect_receiver");
            intent.putExtra("security_avoid_pull_rsa", C14713d.m85964a(context).m85965a().mo85961a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", C14800u.m86213a(C14713d.m85964a(context).m85965a().mo85962a()));
            m85898a(context, intent);
        } catch (Exception e) {
            C14795p.m86180a("CommandBridge", "CommandBridge sendCommandToClient exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m85898a(Context context, Intent intent) throws Exception {
        if (context == null) {
            C14795p.m86192d("CommandBridge", "enter startService context is null");
            brq0.m106161a("context is null");
            return;
        }
        try {
            context.startService(intent);
        } catch (Exception e) {
            C14795p.m86180a("CommandBridge", "start service error", e);
            intent.setComponent(null);
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85900a(Context context, String str, AbstractC14769o abstractC14769o) {
        boolean zMo85953c = abstractC14769o.mo85953c();
        ServiceConnectionC14682b serviceConnectionC14682bM85902a = ServiceConnectionC14682b.m85902a(context, zMo85953c ? "com.vivo.vms.upstageservice" : "com.vivo.vms.aidlservice");
        boolean zM85912a = serviceConnectionC14682bM85902a.m85912a();
        if (TextUtils.isEmpty(abstractC14769o.m86100a())) {
            abstractC14769o.m86103a(context.getPackageName());
        }
        if (zM85912a && !"com.vivo.pushservice".equals(context.getPackageName())) {
            C14680a c14680a = new C14680a(abstractC14769o.m86100a(), str, new Bundle());
            abstractC14769o.m86102a(c14680a);
            if (serviceConnectionC14682bM85902a.m85913a(c14680a.m85893b())) {
                return;
            }
            C14795p.m86186b("CommandBridge", "send command error by aidl");
            C14795p.m86191c(context, "send command error by aidl");
        }
        Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
        intent.setPackage(str);
        intent.setClassName(str, zMo85953c ? "com.vivo.push.sdk.service.UpstageService" : "com.vivo.push.sdk.service.PushService");
        abstractC14769o.m86101a(intent);
        try {
            m85898a(context, intent);
        } catch (Exception e) {
            C14795p.m86180a("CommandBridge", "CommandBridge startService exception: ", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m85901a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage(str2);
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                return true;
            }
            C14795p.m86186b("CommandBridge", "action check error：action>>" + str + ";pkgname>>" + str2);
            return false;
        } catch (Exception unused) {
            C14795p.m86186b("CommandBridge", "queryBroadcastReceivers error");
            return false;
        }
    }
}
