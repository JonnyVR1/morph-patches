package com.vivo.push.p116b;

import com.tencent.liteav.TXLiteAVCode;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C14694l extends C14701s {

    /* JADX INFO: renamed from: a */
    private int f61769a;

    /* JADX INFO: renamed from: b */
    private int f61770b;

    public C14694l() {
        super(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC);
        this.f61769a = -1;
        this.f61770b = -1;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85884a("key_dispatch_environment", this.f61769a);
        c14680a.m85884a("key_dispatch_area", this.f61770b);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61769a = c14680a.m85891b("key_dispatch_environment", 1);
        this.f61770b = c14680a.m85891b("key_dispatch_area", 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m85930e() {
        return this.f61770b;
    }

    /* JADX INFO: renamed from: d */
    public final int m85929d() {
        return this.f61769a;
    }
}
