package com.cmic.sso.sdk.p017c.p018a;

import android.content.Context;
import android.net.Network;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p017c.p020c.C1376c;
import com.cmic.sso.sdk.p017c.p021d.C1379a;
import com.cmic.sso.sdk.p017c.p021d.C1380b;
import com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1397n;
import com.cmic.sso.sdk.p023e.C1401r;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C1363d implements InterfaceC1361b {

    /* JADX INFO: renamed from: a */
    private InterfaceC1361b f5606a;

    @Override // com.cmic.sso.sdk.p017c.p018a.InterfaceC1361b
    /* JADX INFO: renamed from: a */
    public void mo7143a(final C1376c c1376c, final InterfaceC1381c interfaceC1381c, final C1339a c1339a) {
        if (c1376c.m7227b()) {
            C1401r.m7368a((Context) null).m7371a(new C1401r.a() { // from class: com.cmic.sso.sdk.c.a.d.1

                /* JADX INFO: renamed from: e */
                private final AtomicBoolean f5611e = new AtomicBoolean(false);

                @Override // com.cmic.sso.sdk.p023e.C1401r.a
                /* JADX INFO: renamed from: a */
                public void mo7151a(final Network network) {
                    if (this.f5611e.getAndSet(true)) {
                        return;
                    }
                    C1397n.m7353a(new C1397n.a(null, c1339a) { // from class: com.cmic.sso.sdk.c.a.d.1.1
                        @Override // com.cmic.sso.sdk.p023e.C1397n.a
                        /* JADX INFO: renamed from: a */
                        public void mo7083a() {
                            if (network == null) {
                                interfaceC1381c.mo7147a(C1379a.m7236a(102508));
                            } else {
                                C1386c.m7288b("WifiChangeInterceptor", "onAvailable");
                                c1376c.m7224a(network);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C1363d.this.m7150b(c1376c, interfaceC1381c, c1339a);
                            }
                        }
                    });
                }
            });
        } else {
            m7150b(c1376c, interfaceC1381c, c1339a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7150b(C1376c c1376c, final InterfaceC1381c interfaceC1381c, C1339a c1339a) {
        InterfaceC1361b interfaceC1361b = this.f5606a;
        if (interfaceC1361b != null) {
            interfaceC1361b.mo7143a(c1376c, new InterfaceC1381c() { // from class: com.cmic.sso.sdk.c.a.d.2
                @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
                /* JADX INFO: renamed from: a */
                public void mo7148a(C1380b c1380b) {
                    interfaceC1381c.mo7148a(c1380b);
                }

                @Override // com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c
                /* JADX INFO: renamed from: a */
                public void mo7147a(C1379a c1379a) {
                    interfaceC1381c.mo7147a(c1379a);
                }
            }, c1339a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7149a(InterfaceC1361b interfaceC1361b) {
        this.f5606a = interfaceC1361b;
    }
}
