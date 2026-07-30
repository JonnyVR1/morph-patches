package com.vivo.push.p111b;

import com.vivo.push.C14532a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.b.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C14547m extends C14553s {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f60924a;

    public C14547m() {
        super(8);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84717a("tags_list", this.f60924a);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60924a = c14532a.m84724c("tags_list");
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnListTagCommand";
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> m84760d() {
        return this.f60924a;
    }
}
