package com.xiaomi.push.service;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import java.util.ArrayList;
import java.util.List;
import p149l.ilq0;
import p149l.utq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14873o implements utq0 {

    /* JADX INFO: renamed from: a */
    private final XMPushService f63085a;

    public C14873o(XMPushService xMPushService) {
        this.f63085a = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m86756a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f63085a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // p149l.utq0
    /* JADX INFO: renamed from: a */
    public void mo86757a(final List<C14744gj> list, final String str, final String str2) {
        this.f63085a.m86345a(new XMPushService.AbstractC14818j(4) { // from class: com.xiaomi.push.service.o.1
            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public void mo85463a() {
                String strM86756a = C14873o.this.m86756a(str);
                ArrayList<C14766he> arrayListM86600a = C14855az.m86600a(list, str, strM86756a, 32768);
                if (arrayListM86600a == null) {
                    ilq0.m137025B("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
                    return;
                }
                for (C14766he c14766he : arrayListM86600a) {
                    c14766he.m85951a("uploadWay", "longXMPushService");
                    C14763hb c14763hbM86835a = C14882w.m86835a(str, strM86756a, c14766he, EnumC14740gf.Notification);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
                        if (c14763hbM86835a.m85906a() == null) {
                            C14753gs c14753gs = new C14753gs();
                            c14753gs.m85726a(User.ID_TEAM_ACCOUNT);
                            c14763hbM86835a.m85908a(c14753gs);
                        }
                        c14763hbM86835a.m85906a().m85740b("ext_traffic_source_pkg", str2);
                    }
                    C14873o.this.f63085a.m86350a(str, C14788m.m86277e(c14763hbM86835a), true);
                }
            }

            @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
            /* JADX INFO: renamed from: a */
            public String mo85462a() {
                return "Send tiny data.";
            }
        });
    }
}
