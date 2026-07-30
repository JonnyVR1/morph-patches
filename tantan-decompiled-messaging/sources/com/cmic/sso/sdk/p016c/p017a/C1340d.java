package com.cmic.sso.sdk.p016c.p017a;

import android.content.Context;
import android.net.Network;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p016c.p019c.C1353c;
import com.cmic.sso.sdk.p016c.p020d.C1356a;
import com.cmic.sso.sdk.p016c.p020d.C1357b;
import com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1374n;
import com.cmic.sso.sdk.p022e.C1378r;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C1340d implements InterfaceC1338b {

    /* JADX INFO: renamed from: a */
    private InterfaceC1338b f5569a;

    @Override // com.cmic.sso.sdk.p016c.p017a.InterfaceC1338b
    /* JADX INFO: renamed from: a */
    public void mo7089a(final C1353c c1353c, final InterfaceC1358c interfaceC1358c, final C1316a c1316a) {
        if (c1353c.m7173b()) {
            C1378r.m7314a((Context) null).m7317a(new C1378r.a() { // from class: com.cmic.sso.sdk.c.a.d.1

                /* JADX INFO: renamed from: e */
                private final AtomicBoolean f5574e = new AtomicBoolean(false);

                @Override // com.cmic.sso.sdk.p022e.C1378r.a
                /* JADX INFO: renamed from: a */
                public void mo7097a(final Network network) {
                    if (this.f5574e.getAndSet(true)) {
                        return;
                    }
                    C1374n.m7299a(new C1374n.a(null, c1316a) { // from class: com.cmic.sso.sdk.c.a.d.1.1
                        @Override // com.cmic.sso.sdk.p022e.C1374n.a
                        /* JADX INFO: renamed from: a */
                        public void mo7029a() {
                            if (network == null) {
                                interfaceC1358c.mo7093a(C1356a.m7182a(102508));
                            } else {
                                C1363c.m7234b("WifiChangeInterceptor", "onAvailable");
                                c1353c.m7170a(network);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C1340d.this.m7096b(c1353c, interfaceC1358c, c1316a);
                            }
                        }
                    });
                }
            });
        } else {
            m7096b(c1353c, interfaceC1358c, c1316a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7096b(C1353c c1353c, final InterfaceC1358c interfaceC1358c, C1316a c1316a) {
        InterfaceC1338b interfaceC1338b = this.f5569a;
        if (interfaceC1338b != null) {
            interfaceC1338b.mo7089a(c1353c, new InterfaceC1358c() { // from class: com.cmic.sso.sdk.c.a.d.2
                @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
                /* JADX INFO: renamed from: a */
                public void mo7094a(C1357b c1357b) {
                    interfaceC1358c.mo7094a(c1357b);
                }

                @Override // com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c
                /* JADX INFO: renamed from: a */
                public void mo7093a(C1356a c1356a) {
                    interfaceC1358c.mo7093a(c1356a);
                }
            }, c1316a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7095a(InterfaceC1338b interfaceC1338b) {
        this.f5569a = interfaceC1338b;
    }
}
