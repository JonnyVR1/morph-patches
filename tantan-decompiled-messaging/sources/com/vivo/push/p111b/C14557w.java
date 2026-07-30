package com.vivo.push.p111b;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C14557w extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private int f60944a;

    public C14557w() {
        super(2011);
        this.f60944a = 0;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        c14532a.m84713a("com.bbk.push.ikey.MODE_TYPE", this.f60944a);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        this.f60944a = c14532a.m84720b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.AbstractC14621o
    public final String toString() {
        return "PushModeCommand";
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final boolean mo84782c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m84783d() {
        return this.f60944a;
    }
}
