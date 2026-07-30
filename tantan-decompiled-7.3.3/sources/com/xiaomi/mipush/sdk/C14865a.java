package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14916hg;
import com.xiaomi.push.C14922hm;
import com.xiaomi.push.EnumC14880ed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p153l.qmb0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14865a {

    /* JADX INFO: renamed from: a */
    private static Map<String, C14867c.a> f62398a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static Map<String, Long> f62399b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static a f62400c;

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public void m86478a(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        /* JADX INFO: renamed from: b */
        public void m86479b(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86476a(Context context, C14916hg c14916hg) {
        ArrayList arrayList;
        C14867c.a aVar;
        String strM87216c = c14916hg.m87216c();
        if (c14916hg.m87206a() == 0 && (aVar = f62398a.get(strM87216c)) != null) {
            aVar.m86527e(c14916hg.f63334e, c14916hg.f63335f);
            C14867c.m86499c(context).m86506h(strM87216c, aVar);
        }
        if (TextUtils.isEmpty(c14916hg.f63334e)) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(c14916hg.f63334e);
        }
        MiPushCommandMessage miPushCommandMessageM177071a = qmb0.m177071a(EnumC14880ed.COMMAND_REGISTER.f62514a, arrayList, c14916hg.f63322a, c14916hg.f63333d, null, null);
        a aVar2 = f62400c;
        if (aVar2 != null) {
            aVar2.m86478a(strM87216c, miPushCommandMessageM177071a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86477b(Context context, C14922hm c14922hm) {
        MiPushCommandMessage miPushCommandMessageM177071a = qmb0.m177071a(EnumC14880ed.COMMAND_UNREGISTER.f62514a, null, c14922hm.f63457a, c14922hm.f63465d, null, null);
        String strM87328a = c14922hm.m87328a();
        a aVar = f62400c;
        if (aVar != null) {
            aVar.m86479b(strM87328a, miPushCommandMessageM177071a);
        }
    }
}
