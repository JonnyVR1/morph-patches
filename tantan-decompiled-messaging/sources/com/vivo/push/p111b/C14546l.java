package com.vivo.push.p111b;

import com.tencent.liteav.TXLiteAVCode;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C14546l extends C14553s {

    /* JADX INFO: renamed from: a */
    private int f60922a;

    /* JADX INFO: renamed from: b */
    private int f60923b;

    public C14546l() {
        super(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC);
        this.f60922a = -1;
        this.f60923b = -1;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84713a("key_dispatch_environment", this.f60922a);
        c14532a.m84713a("key_dispatch_area", this.f60923b);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60922a = c14532a.m84720b("key_dispatch_environment", 1);
        this.f60923b = c14532a.m84720b("key_dispatch_area", 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m84759e() {
        return this.f60923b;
    }

    /* JADX INFO: renamed from: d */
    public final int m84758d() {
        return this.f60922a;
    }
}
