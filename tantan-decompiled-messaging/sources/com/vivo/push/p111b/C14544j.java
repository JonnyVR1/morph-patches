package com.vivo.push.p111b;

import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C14544j extends C14553s {

    /* JADX INFO: renamed from: a */
    private int f60920a;

    /* JADX INFO: renamed from: b */
    private int f60921b;

    public C14544j() {
        super(12);
        this.f60920a = -1;
        this.f60921b = -1;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84713a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f60920a);
        c14532a.m84713a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f60921b);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60920a = c14532a.m84720b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f60920a);
        this.f60921b = c14532a.m84720b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f60921b);
    }

    /* JADX INFO: renamed from: e */
    public final int m84757e() {
        return this.f60921b;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    /* JADX INFO: renamed from: d */
    public final int m84756d() {
        return this.f60920a;
    }
}
