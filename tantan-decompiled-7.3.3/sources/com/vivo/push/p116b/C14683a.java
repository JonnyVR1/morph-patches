package com.vivo.push.p116b;

import com.vivo.push.C14680a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14683a extends C14685c {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f61750a;

    public C14683a(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? 2002 : 2003, str);
        this.f61750a = arrayList;
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85888a("tags", this.f61750a);
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61750a = c14680a.m85895c("tags");
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "AliasCommand:" + m86104b();
    }
}
