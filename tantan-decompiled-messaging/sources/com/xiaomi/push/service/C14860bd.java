package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.ilq0;
import p149l.njq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.bd */
/* JADX INFO: loaded from: classes2.dex */
public class C14860bd implements XMPushService.InterfaceC14822n {

    /* JADX INFO: renamed from: a */
    private static Context f63028a;

    /* JADX INFO: renamed from: a */
    private static final boolean f63030a = Log.isLoggable("UNDatas", 3);

    /* JADX INFO: renamed from: a */
    private static final Map<Integer, Map<String, List<String>>> f63029a = new HashMap();

    public C14860bd(Context context) {
        f63028a = context;
    }

    /* JADX INFO: renamed from: a */
    private static void m86632a(Context context, final C14766he c14766he) {
        if (f63030a) {
            ilq0.m137050w("UNDatas upload message notification:" + c14766he);
        }
        njq0.m159772f(context).m159773g(new Runnable() { // from class: com.xiaomi.push.service.bd.1
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArrM86277e = C14788m.m86277e(C14882w.m86835a(c14766he.m85965d(), c14766he.m85957b(), c14766he, EnumC14740gf.Notification));
                if (C14860bd.f63028a instanceof XMPushService) {
                    ((XMPushService) C14860bd.f63028a).m86350a(c14766he.m85965d(), bArrM86277e, true);
                } else {
                    ilq0.m137040m("UNDatas UploadNotificationDatas failed because not xmsf");
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static void m86633b() {
        HashMap map = new HashMap();
        map.putAll(f63029a);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map2.get(str);
                        if (!qwq0.m176893d(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(Constants.SEPARATOR_COMMA);
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(com.meituan.robust.Constants.PACKNAME_END);
                    }
                    C14766he c14766heM86631a = m86631a(null, C14839aj.m86495a(), EnumC14750gp.NotificationRemoved.f62110a, null);
                    c14766heM86631a.m85951a("removed_reason", String.valueOf(num));
                    c14766heM86631a.m85951a("all_delete_msgId_appId", sb.toString());
                    ilq0.m137050w("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    m86632a(f63028a, c14766heM86631a);
                }
                f63029a.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14822n
    /* JADX INFO: renamed from: a */
    public void mo86366a() {
        Map<Integer, Map<String, List<String>>> map = f63029a;
        if (map.size() > 0) {
            synchronized (map) {
                m86633b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C14766he m86631a(String str, String str2, String str3, String str4) {
        C14766he c14766he = new C14766he();
        if (str3 != null) {
            c14766he.m85960c(str3);
        }
        if (str != null) {
            c14766he.m85956b(str);
        }
        if (str2 != null) {
            c14766he.m85943a(str2);
        }
        if (str4 != null) {
            c14766he.m85964d(str4);
        }
        c14766he.m85946a(false);
        return c14766he;
    }
}
