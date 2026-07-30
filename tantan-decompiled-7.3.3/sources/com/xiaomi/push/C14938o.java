package com.xiaomi.push;

import p153l.d4r0;
import p153l.w3r0;

/* JADX INFO: renamed from: com.xiaomi.push.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14938o {

    /* JADX INFO: renamed from: a */
    private final w3r0 f63576a;

    /* JADX INFO: renamed from: b */
    private final d4r0 f63577b;

    public C14938o(InterfaceC14930ic interfaceC14930ic) {
        d4r0 d4r0Var = new d4r0();
        this.f63577b = d4r0Var;
        this.f63576a = interfaceC14930ic.mo87413a(d4r0Var);
    }

    /* JADX INFO: renamed from: a */
    public void m87449a(InterfaceC14925hq interfaceC14925hq, byte[] bArr) {
        try {
            this.f63577b.m114233h(bArr);
            interfaceC14925hq.mo86705a(this.f63576a);
        } finally {
            this.f63576a.m204789I();
        }
    }

    public C14938o() {
        this(new C14927hw.a());
    }
}
