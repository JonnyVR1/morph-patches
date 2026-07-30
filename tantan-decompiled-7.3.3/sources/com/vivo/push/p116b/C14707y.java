package com.vivo.push.p116b;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C14707y extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private String f61794a;

    public C14707y(String str) {
        super(2008);
        this.f61794a = str;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        c14680a.m85887a("package_name", this.f61794a);
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        this.f61794a = c14680a.m85883a("package_name");
    }

    @Override // com.vivo.push.AbstractC14769o
    public final String toString() {
        return "StopServiceCommand";
    }

    public C14707y() {
        super(2008);
    }
}
