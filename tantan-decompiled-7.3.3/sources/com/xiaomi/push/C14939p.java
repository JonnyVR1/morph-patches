package com.xiaomi.push;

import java.io.ByteArrayOutputStream;
import p153l.b4r0;
import p153l.w3r0;

/* JADX INFO: renamed from: com.xiaomi.push.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14939p {

    /* JADX INFO: renamed from: a */
    private final ByteArrayOutputStream f63578a;

    /* JADX INFO: renamed from: b */
    private final b4r0 f63579b;

    /* JADX INFO: renamed from: c */
    private w3r0 f63580c;

    public C14939p(InterfaceC14930ic interfaceC14930ic) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f63578a = byteArrayOutputStream;
        b4r0 b4r0Var = new b4r0(byteArrayOutputStream);
        this.f63579b = b4r0Var;
        this.f63580c = interfaceC14930ic.mo87413a(b4r0Var);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m87450a(InterfaceC14925hq interfaceC14925hq) {
        this.f63578a.reset();
        interfaceC14925hq.mo86711b(this.f63580c);
        return this.f63578a.toByteArray();
    }

    public C14939p() {
        this(new C14927hw.a());
    }
}
