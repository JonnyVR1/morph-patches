package com.vivo.push.p116b;

import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C14703u extends AbstractC14704v {

    /* JADX INFO: renamed from: a */
    private long f61787a;

    /* JADX INFO: renamed from: b */
    private int f61788b;

    public C14703u() {
        super(20);
        this.f61787a = -1L;
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85885a("undo_msg_v1", this.f61787a);
        c14680a.m85884a("undo_msg_type_v1", this.f61788b);
    }

    @Override // com.vivo.push.p116b.AbstractC14704v, com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61787a = c14680a.m85892b("undo_msg_v1", this.f61787a);
        this.f61788b = c14680a.m85891b("undo_msg_type_v1", 0);
    }

    /* JADX INFO: renamed from: e */
    public final String m85950e() {
        long j = this.f61787a;
        if (j != -1) {
            return String.valueOf(j);
        }
        return null;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    /* JADX INFO: renamed from: d */
    public final long m85949d() {
        return this.f61787a;
    }
}
