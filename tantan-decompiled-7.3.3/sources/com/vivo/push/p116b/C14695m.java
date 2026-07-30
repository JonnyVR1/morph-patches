package com.vivo.push.p116b;

import com.vivo.push.C14680a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C14695m extends C14701s {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f61771a;

    public C14695m() {
        super(8);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85888a("tags_list", this.f61771a);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61771a = c14680a.m85895c("tags_list");
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnListTagCommand";
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> m85931d() {
        return this.f61771a;
    }
}
