package com.xiaomi.push;

import p149l.quq0;
import p149l.xuq0;

/* JADX INFO: renamed from: com.xiaomi.push.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14790o {

    /* JADX INFO: renamed from: a */
    private final quq0 f62729a;

    /* JADX INFO: renamed from: b */
    private final xuq0 f62730b;

    public C14790o(InterfaceC14782ic interfaceC14782ic) {
        xuq0 xuq0Var = new xuq0();
        this.f62730b = xuq0Var;
        this.f62729a = interfaceC14782ic.mo86242a(xuq0Var);
    }

    /* JADX INFO: renamed from: a */
    public void m86278a(InterfaceC14777hq interfaceC14777hq, byte[] bArr) {
        try {
            this.f62730b.m211182h(bArr);
            interfaceC14777hq.mo85534a(this.f62729a);
        } finally {
            this.f62729a.m176636I();
        }
    }

    public C14790o() {
        this(new C14779hw.a());
    }
}
