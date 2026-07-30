package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14768hg;
import com.xiaomi.push.C14774hm;
import com.xiaomi.push.EnumC14732ed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p149l.meb0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14717a {

    /* JADX INFO: renamed from: a */
    private static Map<String, C14719c.a> f61551a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map<String, Long> f61552b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static a f61553c;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public void m85307a(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        /* JADX INFO: renamed from: b */
        public void m85308b(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85305a(Context context, C14768hg c14768hg) {
        ArrayList arrayList;
        C14719c.a aVar;
        String strM86045c = c14768hg.m86045c();
        if (c14768hg.m86035a() == 0 && (aVar = f61551a.get(strM86045c)) != null) {
            aVar.m85356e(c14768hg.f62487e, c14768hg.f62488f);
            C14719c.m85328c(context).m85335h(strM86045c, aVar);
        }
        if (TextUtils.isEmpty(c14768hg.f62487e)) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(c14768hg.f62487e);
        }
        MiPushCommandMessage miPushCommandMessageM154170a = meb0.m154170a(EnumC14732ed.COMMAND_REGISTER.f61667a, arrayList, c14768hg.f62475a, c14768hg.f62486d, null, null);
        a aVar2 = f61553c;
        if (aVar2 != null) {
            aVar2.m85307a(strM86045c, miPushCommandMessageM154170a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85306b(Context context, C14774hm c14774hm) {
        MiPushCommandMessage miPushCommandMessageM154170a = meb0.m154170a(EnumC14732ed.COMMAND_UNREGISTER.f61667a, null, c14774hm.f62610a, c14774hm.f62618d, null, null);
        String strM86157a = c14774hm.m86157a();
        a aVar = f61553c;
        if (aVar != null) {
            aVar.m85308b(strM86157a, miPushCommandMessageM154170a);
        }
    }
}
