package com.vivo.push.p111b;

import com.vivo.push.C14532a;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C14560z extends C14537c {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f60948a;

    public C14560z(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? 2004 : 2005, str);
        this.f60948a = arrayList;
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84715a("tags", (Serializable) this.f60948a);
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60948a = c14532a.m84724c("tags");
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "TagCommand";
    }
}
