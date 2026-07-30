package com.cmic.sso.sdk.p017c.p018a;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p017c.C1364b;
import com.cmic.sso.sdk.p017c.p020c.C1376c;
import com.cmic.sso.sdk.p017c.p021d.C1379a;
import com.cmic.sso.sdk.p017c.p021d.C1380b;
import com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c;
import com.cmic.sso.sdk.p023e.C1386c;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1362c implements InterfaceC1361b {

    /* JADX INFO: renamed from: a */
    private InterfaceC1361b f5599a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1381c f5600b;

    /* JADX INFO: renamed from: c */
    private final C1364b f5601c = new C1364b();

    @Override // com.cmic.sso.sdk.p017c.p018a.InterfaceC1361b
    /* JADX INFO: renamed from: a */
    public void mo7143a(C1376c c1376c, InterfaceC1381c interfaceC1381c, C1339a c1339a) {
        m7146b(c1376c, interfaceC1381c, c1339a);
    }

    /* JADX INFO: renamed from: b */
    public void m7146b(final C1376c c1376c, final InterfaceC1381c interfaceC1381c, final C1339a c1339a) {
        if (this.f5599a != null) {
            InterfaceC1381c interfaceC1381c2 = new InterfaceC1381c() { // from class: com.cmic.sso.sdk.c.a.c.1
                @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
                /* JADX INFO: renamed from: a */
                public void mo7148a(C1380b c1380b) {
                    boolean zM7242d = c1380b.m7242d();
                    C1362c c1362c = C1362c.this;
                    if (zM7242d) {
                        C1362c.this.m7146b(c1362c.f5601c.m7153a(c1376c, c1380b, c1339a), interfaceC1381c, c1339a);
                    } else if (TextUtils.isEmpty(c1362c.f5601c.m7154a())) {
                        interfaceC1381c.mo7148a(c1380b);
                    } else {
                        C1362c.this.m7146b(C1362c.this.f5601c.m7155b(c1376c, c1380b, c1339a), interfaceC1381c, c1339a);
                    }
                }

                @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
                /* JADX INFO: renamed from: a */
                public void mo7147a(C1379a c1379a) {
                    if (c1376c.m7234i()) {
                        C1386c.m7286a("RetryAndRedirectInterceptor", "retry: " + c1376c.m7222a());
                        C1362c.this.m7146b(c1376c, interfaceC1381c, c1339a);
                        return;
                    }
                    interfaceC1381c.mo7147a(c1379a);
                }
            };
            this.f5600b = interfaceC1381c2;
            this.f5599a.mo7143a(c1376c, interfaceC1381c2, c1339a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7145a(InterfaceC1361b interfaceC1361b) {
        this.f5599a = interfaceC1361b;
    }
}
