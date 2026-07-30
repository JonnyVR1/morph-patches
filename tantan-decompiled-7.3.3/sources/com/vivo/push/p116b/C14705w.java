package com.vivo.push.p116b;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C14705w extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private int f61791a;

    public C14705w() {
        super(2011);
        this.f61791a = 0;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        c14680a.m85884a("com.bbk.push.ikey.MODE_TYPE", this.f61791a);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        this.f61791a = c14680a.m85891b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.AbstractC14769o
    public final String toString() {
        return "PushModeCommand";
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final boolean mo85953c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m85954d() {
        return this.f61791a;
    }
}
