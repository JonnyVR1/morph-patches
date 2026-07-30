package com.cmic.sso.sdk.p016c.p017a;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p016c.C1341b;
import com.cmic.sso.sdk.p016c.p019c.C1353c;
import com.cmic.sso.sdk.p016c.p020d.C1356a;
import com.cmic.sso.sdk.p016c.p020d.C1357b;
import com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c;
import com.cmic.sso.sdk.p022e.C1363c;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C1339c implements InterfaceC1338b {

    /* JADX INFO: renamed from: a */
    private InterfaceC1338b f5562a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1358c f5563b;

    /* JADX INFO: renamed from: c */
    private final C1341b f5564c = new C1341b();

    @Override // com.cmic.sso.sdk.p016c.p017a.InterfaceC1338b
    /* JADX INFO: renamed from: a */
    public void mo7089a(C1353c c1353c, InterfaceC1358c interfaceC1358c, C1316a c1316a) {
        m7092b(c1353c, interfaceC1358c, c1316a);
    }

    /* JADX INFO: renamed from: b */
    public void m7092b(final C1353c c1353c, final InterfaceC1358c interfaceC1358c, final C1316a c1316a) {
        if (this.f5562a != null) {
            InterfaceC1358c interfaceC1358c2 = new InterfaceC1358c() { // from class: com.cmic.sso.sdk.c.a.c.1
                @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
                /* JADX INFO: renamed from: a */
                public void mo7094a(C1357b c1357b) {
                    boolean zM7188d = c1357b.m7188d();
                    C1339c c1339c = C1339c.this;
                    if (zM7188d) {
                        C1339c.this.m7092b(c1339c.f5564c.m7099a(c1353c, c1357b, c1316a), interfaceC1358c, c1316a);
                    } else if (TextUtils.isEmpty(c1339c.f5564c.m7100a())) {
                        interfaceC1358c.mo7094a(c1357b);
                    } else {
                        C1339c.this.m7092b(C1339c.this.f5564c.m7101b(c1353c, c1357b, c1316a), interfaceC1358c, c1316a);
                    }
                }

                @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
                /* JADX INFO: renamed from: a */
                public void mo7093a(C1356a c1356a) {
                    if (c1353c.m7180i()) {
                        C1363c.m7232a("RetryAndRedirectInterceptor", "retry: " + c1353c.m7168a());
                        C1339c.this.m7092b(c1353c, interfaceC1358c, c1316a);
                        return;
                    }
                    interfaceC1358c.mo7093a(c1356a);
                }
            };
            this.f5563b = interfaceC1358c2;
            this.f5562a.mo7089a(c1353c, interfaceC1358c2, c1316a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7091a(InterfaceC1338b interfaceC1338b) {
        this.f5562a = interfaceC1338b;
    }
}
