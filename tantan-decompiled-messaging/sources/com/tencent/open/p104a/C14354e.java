package com.tencent.open.p104a;

import android.text.TextUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.open.log.SLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C21832a;
import p149l.axm;
import p149l.cm10;
import p149l.exc0;
import p149l.hyx;
import p149l.k850;
import p149l.l0l0;
import p149l.qyi;
import p149l.stc0;
import p149l.utc0;

/* JADX INFO: renamed from: com.tencent.open.a.e */
/* JADX INFO: loaded from: classes2.dex */
class C14354e implements InterfaceC14350a {

    /* JADX INFO: renamed from: a */
    private k850 f60183a;

    /* JADX INFO: renamed from: com.tencent.open.a.e$a */
    public static class a implements axm {

        /* JADX INFO: renamed from: a */
        private final String f60184a;

        public a(String str) {
            this.f60184a = str;
        }

        @Override // p149l.axm
        public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
            return interfaceC15754a.mo99454a(interfaceC15754a.request().m185878h().m185889h("User-Agent", this.f60184a).m185883b());
        }
    }

    public C14354e(String str) throws NoClassDefFoundError {
        m84225a(str);
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84213a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() == 0) {
            return mo84212a(str, map);
        }
        SLog.m84309i("OkHttpServiceImpl", "post data, has byte data");
        cm10.C16191a c16191a = new cm10.C16191a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    c16191a.m107595a(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c16191a.m107596b(str4, str4, utc0.create(hyx.m133627c("content/unknown"), bArr));
                SLog.m84315w("OkHttpServiceImpl", "post byte data.");
            }
        }
        cm10 cm10VarM107599e = c16191a.m107599e();
        return new C14353d(this.f60183a.mo144849a(new stc0.C20027a().m185898q(str).m185893l(cm10VarM107599e).m185883b()).execute(), (int) cm10VarM107599e.contentLength());
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public void mo84214a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f60183a.m144854f() == j && this.f60183a.m144844D() == j2) {
            return;
        }
        SLog.m84309i("OkHttpServiceImpl", "setTimeout changed.");
        k850.C17954b c17954bM144867v = this.f60183a.m144867v();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f60183a = c17954bM144867v.m144885f(j, timeUnit).m144899t(j2, timeUnit).m144903x(j2, timeUnit).m144882c();
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84211a(String str, String str2) throws IOException {
        SLog.m84309i("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat("&");
            }
            str = str.concat(str2);
        }
        return new C14353d(this.f60183a.mo144849a(new stc0.C20027a().m185898q(str).m185887f().m185883b()).execute(), str2.length());
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84212a(String str, Map<String, String> map) throws IOException {
        SLog.m84309i("OkHttpServiceImpl", "post data");
        qyi.C19606a c19606a = new qyi.C19606a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    c19606a.m177040a(str2, str3);
                }
            }
        }
        qyi qyiVarM177041b = c19606a.m177041b();
        return new C14353d(this.f60183a.mo144849a(new stc0.C20027a().m185898q(str).m185893l(qyiVarM177041b).m185883b()).execute(), (int) qyiVarM177041b.contentLength());
    }

    /* JADX INFO: renamed from: a */
    private void m84225a(String str) {
        String strM148099a = l0l0.m148099a();
        if (strM148099a != null && strM148099a.startsWith("okhttp/3")) {
            a aVar = new a(str);
            k850.C17954b c17954bM144887h = new k850.C17954b().m144887h(Arrays.asList(C21832a.f205841h, C21832a.f205842i));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k850.C17954b c17954bM144880a = c17954bM144887h.m144885f(15000L, timeUnit).m144899t(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit).m144903x(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit).m144883d(null).m144880a(aVar);
            m84226a(c17954bM144880a);
            this.f60183a = c17954bM144880a.m144882c();
            return;
        }
        throw new NoClassDefFoundError();
    }

    /* JADX INFO: renamed from: a */
    private void m84226a(k850.C17954b c17954b) {
    }
}
