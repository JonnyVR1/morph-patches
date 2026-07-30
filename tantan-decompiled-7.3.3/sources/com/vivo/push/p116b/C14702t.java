package com.vivo.push.p116b;

import com.vivo.push.C14680a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.b.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C14702t extends C14701s {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f61785a;

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f61786b;

    public C14702t(int i) {
        super(i);
        this.f61785a = null;
        this.f61786b = null;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85888a("content", this.f61785a);
        c14680a.m85888a("error_msg", this.f61786b);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61785a = c14680a.m85895c("content");
        this.f61786b = c14680a.m85895c("error_msg");
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m85948e() {
        return this.f61786b;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnSetTagsCommand";
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> m85947d() {
        return this.f61785a;
    }
}
