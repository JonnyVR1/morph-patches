package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.C14909h;
import com.xiaomi.push.C14928i;
import com.xiaomi.push.EnumC14881ei;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.ezq0;
import p153l.gzq0;
import p153l.mtq0;
import p153l.n2r0;
import p153l.ouq0;
import p153l.swq0;
import p153l.t5r0;
import p153l.u1r0;
import p153l.vwq0;
import p153l.xwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ao */
/* JADX INFO: loaded from: classes2.dex */
public class C14992ao extends C15001ax.a implements xwq0.InterfaceC21466c {

    /* JADX INFO: renamed from: a */
    private long f63809a;

    /* JADX INFO: renamed from: a */
    private XMPushService f63810a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ao$a */
    public static class a implements xwq0.InterfaceC21467d {
        @Override // p153l.xwq0.InterfaceC21467d
        /* JADX INFO: renamed from: a */
        public String mo87711a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter("os", n2r0.m161249b(Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(t5r0.m189417a()));
            String string = builderBuildUpon.toString();
            ouq0.m169406z("fetch bucket from : " + string);
            URL url = new URL(string);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strM160030f = mtq0.m160030f(t5r0.m189418b(), url);
                C14928i.m87420g(url.getHost() + ":" + port, (int) (System.currentTimeMillis() - jCurrentTimeMillis), null);
                return strM160030f;
            } catch (IOException e) {
                C14928i.m87420g(url.getHost() + ":" + port, -1, e);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ao$b */
    public static class b extends xwq0 {
        public b(Context context, vwq0 vwq0Var, xwq0.InterfaceC21467d interfaceC21467d, String str) {
            super(context, vwq0Var, interfaceC21467d, str);
        }

        @Override // p153l.xwq0
        /* JADX INFO: renamed from: a */
        public String mo87712a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
            try {
                if (C14909h.m87046f().m87053k()) {
                    str2 = C15001ax.m87743a();
                }
                return super.mo87712a(arrayList, str, str2, z);
            } catch (IOException e) {
                C14928i.m87417d(0, EnumC14881ei.GSLB_ERR.m86699a(), 1, null, mtq0.m160046v(xwq0.f196521a) ? 1 : 0);
                throw e;
            }
        }
    }

    public C14992ao(XMPushService xMPushService) {
        this.f63810a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C15001ax.a
    /* JADX INFO: renamed from: a */
    public void mo87055a(gzq0 gzq0Var) {
        swq0 swq0VarM213410b;
        if (gzq0Var.m133114p() && gzq0Var.m133112n() && System.currentTimeMillis() - this.f63809a > 3600000) {
            ouq0.m169393m("fetch bucket :" + gzq0Var.m133112n());
            this.f63809a = System.currentTimeMillis();
            xwq0 xwq0VarM213395a = xwq0.m213395a();
            xwq0VarM213395a.m213405a();
            xwq0VarM213395a.m213411b();
            u1r0 u1r0VarM87512a = this.f63810a.m87512a();
            if (u1r0VarM87512a == null || (swq0VarM213410b = xwq0VarM213395a.m213410b(u1r0VarM87512a.m194098f().m199059c())) == null) {
                return;
            }
            ArrayList<String> arrayListM188335b = swq0VarM213410b.m188335b();
            Iterator<String> it = arrayListM188335b.iterator();
            while (it.hasNext()) {
                if (it.next().equals(u1r0VarM87512a.mo102237c())) {
                    return;
                }
            }
            if (arrayListM188335b.isEmpty()) {
                return;
            }
            ouq0.m169393m("bucket changed, force reconnect");
            this.f63810a.m87515a(0, (Exception) null);
            this.f63810a.m87523a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87708a(XMPushService xMPushService) {
        C14992ao c14992ao = new C14992ao(xMPushService);
        C15001ax.m87742a().m87756a(c14992ao);
        synchronized (xwq0.class) {
            xwq0.m213398a(c14992ao);
            xwq0.m213396a(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.push.service.C15001ax.a
    /* JADX INFO: renamed from: a */
    public void mo87710a(ezq0 ezq0Var) {
    }

    @Override // p153l.xwq0.InterfaceC21466c
    /* JADX INFO: renamed from: a */
    public xwq0 mo87709a(Context context, vwq0 vwq0Var, xwq0.InterfaceC21467d interfaceC21467d, String str) {
        return new b(context, vwq0Var, interfaceC21467d, str);
    }
}
