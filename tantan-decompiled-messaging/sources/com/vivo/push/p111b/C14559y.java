package com.vivo.push.p111b;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C14559y extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private String f60947a;

    public C14559y(String str) {
        super(2008);
        this.f60947a = str;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        c14532a.m84716a("package_name", this.f60947a);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        this.f60947a = c14532a.m84712a("package_name");
    }

    @Override // com.vivo.push.AbstractC14621o
    public final String toString() {
        return "StopServiceCommand";
    }

    public C14559y() {
        super(2008);
    }
}
