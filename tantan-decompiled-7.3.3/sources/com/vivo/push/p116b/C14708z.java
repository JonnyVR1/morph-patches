package com.vivo.push.p116b;

import com.vivo.push.C14680a;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C14708z extends C14685c {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f61795a;

    public C14708z(boolean z, String str, ArrayList<String> arrayList) {
        super(z ? 2004 : 2005, str);
        this.f61795a = arrayList;
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85886a("tags", (Serializable) this.f61795a);
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61795a = c14680a.m85895c("tags");
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "TagCommand";
    }
}
