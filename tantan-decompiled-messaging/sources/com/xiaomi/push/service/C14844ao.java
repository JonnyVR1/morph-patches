package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.C14761h;
import com.xiaomi.push.C14780i;
import com.xiaomi.push.EnumC14733ei;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.aqq0;
import p149l.gkq0;
import p149l.htq0;
import p149l.ilq0;
import p149l.mnq0;
import p149l.nwq0;
import p149l.osq0;
import p149l.pnq0;
import p149l.rnq0;
import p149l.ypq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ao */
/* JADX INFO: loaded from: classes2.dex */
public class C14844ao extends C14853ax.a implements rnq0.InterfaceC19742c {

    /* JADX INFO: renamed from: a */
    private long f62962a;

    /* JADX INFO: renamed from: a */
    private XMPushService f62963a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ao$a */
    public static class a implements rnq0.InterfaceC19743d {
        @Override // p149l.rnq0.InterfaceC19743d
        /* JADX INFO: renamed from: a */
        public String mo86540a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter("os", htq0.m132933b(Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(nwq0.m161878a()));
            String string = builderBuildUpon.toString();
            ilq0.m137053z("fetch bucket from : " + string);
            URL url = new URL(string);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM126677f = gkq0.m126677f(nwq0.m161879b(), url);
                C14780i.m86249g(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - jCurrentTimeMillis), null);
                return strM126677f;
            } catch (IOException e) {
                C14780i.m86249g(url.getHost() + ":" + port, -1, e);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ao$b */
    public static class b extends rnq0 {
        public b(Context context, pnq0 pnq0Var, rnq0.InterfaceC19743d interfaceC19743d, String str) {
            super(context, pnq0Var, interfaceC19743d, str);
        }

        @Override // p149l.rnq0
        /* JADX INFO: renamed from: a */
        public String mo86541a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
            try {
                if (C14761h.m85875f().m85882k()) {
                    str2 = C14853ax.m86572a();
                }
                return super.mo86541a(arrayList, str, str2, z);
            } catch (IOException e) {
                C14780i.m86246d(0, EnumC14733ei.GSLB_ERR.m85528a(), 1, null, gkq0.m126693v(rnq0.f160290a) ? 1 : 0);
                throw e;
            }
        }
    }

    public C14844ao(XMPushService xMPushService) {
        this.f62963a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C14853ax.a
    /* JADX INFO: renamed from: a */
    public void mo85884a(aqq0 aqq0Var) {
        mnq0 mnq0VarM180141b;
        if (aqq0Var.m98335p() && aqq0Var.m98333n() && System.currentTimeMillis() - this.f62962a > 3600000) {
            ilq0.m137040m("fetch bucket :" + aqq0Var.m98333n());
            this.f62962a = System.currentTimeMillis();
            rnq0 rnq0VarM180126a = rnq0.m180126a();
            rnq0VarM180126a.m180136a();
            rnq0VarM180126a.m180142b();
            osq0 osq0VarM86341a = this.f62963a.m86341a();
            if (osq0VarM86341a == null || (mnq0VarM180141b = rnq0VarM180126a.m180141b(osq0VarM86341a.m165886f().m171246c())) == null) {
                return;
            }
            ArrayList<String> arrayListM155535b = mnq0VarM180141b.m155535b();
            Iterator<String> it = arrayListM155535b.iterator();
            while (it.hasNext()) {
                if (it.next().equals(osq0VarM86341a.mo165884c())) {
                    return;
                }
            }
            if (arrayListM155535b.isEmpty()) {
                return;
            }
            ilq0.m137040m("bucket changed, force reconnect");
            this.f62963a.m86344a(0, (Exception) null);
            this.f62963a.m86352a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86537a(XMPushService xMPushService) {
        C14844ao c14844ao = new C14844ao(xMPushService);
        C14853ax.m86571a().m86585a(c14844ao);
        synchronized (rnq0.class) {
            rnq0.m180129a(c14844ao);
            rnq0.m180127a(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.push.service.C14853ax.a
    /* JADX INFO: renamed from: a */
    public void mo86539a(ypq0 ypq0Var) {
    }

    @Override // p149l.rnq0.InterfaceC19742c
    /* JADX INFO: renamed from: a */
    public rnq0 mo86538a(Context context, pnq0 pnq0Var, rnq0.InterfaceC19743d interfaceC19743d, String str) {
        return new b(context, pnq0Var, interfaceC19743d, str);
    }
}
