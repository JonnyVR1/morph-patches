package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.ouq0;
import p153l.tsq0;
import p153l.w5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.bd */
/* JADX INFO: loaded from: classes2.dex */
public class C15008bd implements XMPushService.InterfaceC14970n {

    /* JADX INFO: renamed from: a */
    private static Context f63875a;

    /* JADX INFO: renamed from: a */
    private static final boolean f63877a = Log.isLoggable("UNDatas", 3);

    /* JADX INFO: renamed from: a */
    private static final Map<Integer, Map<String, List<String>>> f63876a = new HashMap();

    public C15008bd(Context context) {
        f63875a = context;
    }

    /* JADX INFO: renamed from: a */
    private static void m87803a(Context context, final C14914he c14914he) {
        if (f63877a) {
            ouq0.m169403w("UNDatas upload message notification:" + c14914he);
        }
        tsq0.m192627f(context).m192628g(new Runnable() { // from class: com.xiaomi.push.service.bd.1
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArrM87448e = C14936m.m87448e(C15030w.m88006a(c14914he.m87136d(), c14914he.m87128b(), c14914he, EnumC14888gf.Notification));
                if (C15008bd.f63875a instanceof XMPushService) {
                    ((XMPushService) C15008bd.f63875a).m87521a(c14914he.m87136d(), bArrM87448e, true);
                } else {
                    ouq0.m169393m("UNDatas UploadNotificationDatas failed because not xmsf");
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static void m87804b() {
        HashMap map = new HashMap();
        map.putAll(f63876a);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map2.get(str);
                        if (!w5r0.m204985d(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(Constants.SEPARATOR_COMMA);
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(com.meituan.robust.Constants.PACKNAME_END);
                    }
                    C14914he c14914heM87802a = m87802a(null, C14987aj.m87666a(), EnumC14898gp.NotificationRemoved.f62957a, null);
                    c14914heM87802a.m87122a("removed_reason", String.valueOf(num));
                    c14914heM87802a.m87122a("all_delete_msgId_appId", sb.toString());
                    ouq0.m169403w("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    m87803a(f63875a, c14914heM87802a);
                }
                f63876a.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.InterfaceC14970n
    /* JADX INFO: renamed from: a */
    public void mo87537a() {
        Map<Integer, Map<String, List<String>>> map = f63876a;
        if (map.size() > 0) {
            synchronized (map) {
                m87804b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C14914he m87802a(String str, String str2, String str3, String str4) {
        C14914he c14914he = new C14914he();
        if (str3 != null) {
            c14914he.m87131c(str3);
        }
        if (str != null) {
            c14914he.m87127b(str);
        }
        if (str2 != null) {
            c14914he.m87114a(str2);
        }
        if (str4 != null) {
            c14914he.m87135d(str4);
        }
        c14914he.m87117a(false);
        return c14914he;
    }
}
