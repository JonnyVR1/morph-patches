package com.tencent.open.p109a;

import android.text.TextUtils;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.open.log.SLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C21953a;
import p153l.azm;
import p153l.e7y;
import p153l.i5d0;
import p153l.ku10;
import p153l.l1j;
import p153l.q9l0;
import p153l.rg50;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: renamed from: com.tencent.open.a.e */
/* JADX INFO: loaded from: classes2.dex */
class C14517e implements InterfaceC14513a {

    /* JADX INFO: renamed from: a */
    private rg50 f61031a;

    /* JADX INFO: renamed from: com.tencent.open.a.e$a */
    public static class a implements azm {

        /* JADX INFO: renamed from: a */
        private final String f61032a;

        public a(String str) {
            this.f61032a = str;
        }

        @Override // p153l.azm
        public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
            return interfaceC15867a.mo101076a(interfaceC15867a.request().m209023h().m209034h("User-Agent", this.f61032a).m209028b());
        }
    }

    public C14517e(String str) throws NoClassDefFoundError {
        m85408a(str);
    }

    @Override // com.tencent.open.p109a.InterfaceC14513a
    /* JADX INFO: renamed from: a */
    public InterfaceC14519g mo85396a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() == 0) {
            return mo85395a(str, map);
        }
        SLog.m85492i("OkHttpServiceImpl", "post data, has byte data");
        ku10.C18260a c18260a = new ku10.C18260a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    c18260a.m151427a(str2, str3);
                }
            }
        }
        for (String str4 : map2.keySet()) {
            byte[] bArr = map2.get(str4);
            if (bArr != null && bArr.length > 0) {
                c18260a.m151428b(str4, str4, z1d0.create(e7y.m119772c("content/unknown"), bArr));
                SLog.m85498w("OkHttpServiceImpl", "post byte data.");
            }
        }
        ku10 ku10VarM151431e = c18260a.m151431e();
        return new C14516d(this.f61031a.mo181341a(new x1d0.C21228a().m209043q(str).m209038l(ku10VarM151431e).m209028b()).execute(), (int) ku10VarM151431e.contentLength());
    }

    @Override // com.tencent.open.p109a.InterfaceC14513a
    /* JADX INFO: renamed from: a */
    public void mo85397a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        if (this.f61031a.m181346f() == j && this.f61031a.m181336D() == j2) {
            return;
        }
        SLog.m85492i("OkHttpServiceImpl", "setTimeout changed.");
        rg50.C19837b c19837bM181359v = this.f61031a.m181359v();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f61031a = c19837bM181359v.m181368f(j, timeUnit).m181383u(j2, timeUnit).m181387y(j2, timeUnit).m181365c();
    }

    @Override // com.tencent.open.p109a.InterfaceC14513a
    /* JADX INFO: renamed from: a */
    public InterfaceC14519g mo85394a(String str, String str2) throws IOException {
        SLog.m85492i("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat("&");
            }
            str = str.concat(str2);
        }
        return new C14516d(this.f61031a.mo181341a(new x1d0.C21228a().m209043q(str).m209032f().m209028b()).execute(), str2.length());
    }

    @Override // com.tencent.open.p109a.InterfaceC14513a
    /* JADX INFO: renamed from: a */
    public InterfaceC14519g mo85395a(String str, Map<String, String> map) throws IOException {
        SLog.m85492i("OkHttpServiceImpl", "post data");
        l1j.C18332a c18332a = new l1j.C18332a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    c18332a.m152497a(str2, str3);
                }
            }
        }
        l1j l1jVarM152498b = c18332a.m152498b();
        return new C14516d(this.f61031a.mo181341a(new x1d0.C21228a().m209043q(str).m209038l(l1jVarM152498b).m209028b()).execute(), (int) l1jVarM152498b.contentLength());
    }

    /* JADX INFO: renamed from: a */
    private void m85408a(String str) {
        String strM175842a = q9l0.m175842a();
        if (strM175842a != null && strM175842a.startsWith("okhttp/3")) {
            a aVar = new a(str);
            rg50.C19837b c19837bM181370h = new rg50.C19837b().m181370h(Arrays.asList(C21953a.f206770h, C21953a.f206771i));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            rg50.C19837b c19837bM181363a = c19837bM181370h.m181368f(15000L, timeUnit).m181383u(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit).m181387y(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, timeUnit).m181366d(null).m181363a(aVar);
            m85409a(c19837bM181363a);
            this.f61031a = c19837bM181363a.m181365c();
            return;
        }
        throw new NoClassDefFoundError();
    }

    /* JADX INFO: renamed from: a */
    private void m85409a(rg50.C19837b c19837b) {
    }
}
