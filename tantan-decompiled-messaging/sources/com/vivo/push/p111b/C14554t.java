package com.vivo.push.p111b;

import com.vivo.push.C14532a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.b.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C14554t extends C14553s {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f60938a;

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f60939b;

    public C14554t(int i) {
        super(i);
        this.f60938a = null;
        this.f60939b = null;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84717a("content", this.f60938a);
        c14532a.m84717a("error_msg", this.f60939b);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60938a = c14532a.m84724c("content");
        this.f60939b = c14532a.m84724c("error_msg");
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m84777e() {
        return this.f60939b;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnSetTagsCommand";
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<String> m84776d() {
        return this.f60938a;
    }
}
