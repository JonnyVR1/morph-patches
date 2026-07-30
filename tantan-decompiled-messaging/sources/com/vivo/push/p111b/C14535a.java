package com.vivo.push.p111b;

import com.vivo.push.C14532a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14535a extends C14537c {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f60903a;

    public C14535a(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? 2002 : 2003, str);
        this.f60903a = arrayList;
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84717a("tags", this.f60903a);
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60903a = c14532a.m84724c("tags");
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "AliasCommand:" + m84933b();
    }
}
