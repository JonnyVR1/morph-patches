package com.xiaomi.push;

import java.io.ByteArrayOutputStream;
import p149l.quq0;
import p149l.vuq0;

/* JADX INFO: renamed from: com.xiaomi.push.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14791p {

    /* JADX INFO: renamed from: a */
    private final ByteArrayOutputStream f62731a;

    /* JADX INFO: renamed from: b */
    private final vuq0 f62732b;

    /* JADX INFO: renamed from: c */
    private quq0 f62733c;

    public C14791p(InterfaceC14782ic interfaceC14782ic) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f62731a = byteArrayOutputStream;
        vuq0 vuq0Var = new vuq0(byteArrayOutputStream);
        this.f62732b = vuq0Var;
        this.f62733c = interfaceC14782ic.mo86242a(vuq0Var);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m86279a(InterfaceC14777hq interfaceC14777hq) {
        this.f62731a.reset();
        interfaceC14777hq.mo85540b(this.f62733c);
        return this.f62731a.toByteArray();
    }

    public C14791p() {
        this(new C14779hw.a());
    }
}
