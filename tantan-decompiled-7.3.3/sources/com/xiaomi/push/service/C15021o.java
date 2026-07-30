package com.xiaomi.push.service;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import java.util.ArrayList;
import java.util.List;
import p153l.a3r0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.o */
/* JADX INFO: loaded from: classes2.dex */
public class C15021o implements a3r0 {

    /* JADX INFO: renamed from: a */
    private final XMPushService f63932a;

    public C15021o(XMPushService xMPushService) {
        this.f63932a = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m87927a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f63932a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // p153l.a3r0
    /* JADX INFO: renamed from: a */
    public void mo87928a(final List<C14892gj> list, final String str, final String str2) {
        this.f63932a.m87516a(new XMPushService.AbstractC14966j(4) { // from class: com.xiaomi.push.service.o.1
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public void mo86634a() {
                String strM87927a = C15021o.this.m87927a(str);
                ArrayList<C14914he> arrayListM87771a = C15003az.m87771a(list, str, strM87927a, 32768);
                if (arrayListM87771a == null) {
                    ouq0.m169378B("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
                    return;
                }
                for (C14914he c14914he : arrayListM87771a) {
                    c14914he.m87122a("uploadWay", "longXMPushService");
                    C14911hb c14911hbM88006a = C15030w.m88006a(str, strM87927a, c14914he, EnumC14888gf.Notification);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                        if (c14911hbM88006a.m87077a() == null) {
                            C14901gs c14901gs = new C14901gs();
                            c14901gs.m86897a(User.ID_TEAM_ACCOUNT);
                            c14911hbM88006a.m87079a(c14901gs);
                        }
                        c14911hbM88006a.m87077a().m86911b("ext_traffic_source_pkg", str2);
                    }
                    C15021o.this.f63932a.m87521a(str, C14936m.m87448e(c14911hbM88006a), true);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
            /* JADX INFO: renamed from: a */
            public String mo86633a() {
                return "Send tiny data.";
            }
        });
    }
}
