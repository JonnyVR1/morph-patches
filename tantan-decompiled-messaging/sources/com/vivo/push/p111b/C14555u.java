package com.vivo.push.p111b;

import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C14555u extends AbstractC14556v {

    /* JADX INFO: renamed from: a */
    private long f60940a;

    /* JADX INFO: renamed from: b */
    private int f60941b;

    public C14555u() {
        super(20);
        this.f60940a = -1L;
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84714a("undo_msg_v1", this.f60940a);
        c14532a.m84713a("undo_msg_type_v1", this.f60941b);
    }

    @Override // com.vivo.push.p111b.AbstractC14556v, com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60940a = c14532a.m84721b("undo_msg_v1", this.f60940a);
        this.f60941b = c14532a.m84720b("undo_msg_type_v1", 0);
    }

    /* JADX INFO: renamed from: e */
    public final String m84779e() {
        long j = this.f60940a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    /* JADX INFO: renamed from: d */
    public final long m84778d() {
        return this.f60940a;
    }
}
