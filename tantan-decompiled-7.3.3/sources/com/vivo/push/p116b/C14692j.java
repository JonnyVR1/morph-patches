package com.vivo.push.p116b;

import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C14692j extends C14701s {

    /* JADX INFO: renamed from: a */
    private int f61767a;

    /* JADX INFO: renamed from: b */
    private int f61768b;

    public C14692j() {
        super(12);
        this.f61767a = -1;
        this.f61768b = -1;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85884a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f61767a);
        c14680a.m85884a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f61768b);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61767a = c14680a.m85891b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f61767a);
        this.f61768b = c14680a.m85891b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f61768b);
    }

    /* JADX INFO: renamed from: e */
    public final int m85928e() {
        return this.f61768b;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    /* JADX INFO: renamed from: d */
    public final int m85927d() {
        return this.f61767a;
    }
}
