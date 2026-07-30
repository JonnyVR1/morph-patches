package com.vivo.push.p111b;

import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C14548n extends C14553s {

    /* JADX INFO: renamed from: a */
    private String f60925a;

    /* JADX INFO: renamed from: b */
    private int f60926b;

    /* JADX INFO: renamed from: c */
    private boolean f60927c;

    public C14548n() {
        super(7);
        this.f60926b = 0;
        this.f60927c = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m84761a(int i) {
        this.f60926b = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m84763b(String str) {
        this.f60925a = str;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84716a("content", this.f60925a);
        c14532a.m84713a("log_level", this.f60926b);
        c14532a.m84718a("is_server_log", this.f60927c);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60925a = c14532a.m84712a("content");
        this.f60926b = c14532a.m84720b("log_level", 0);
        this.f60927c = c14532a.m84726e("is_server_log");
    }

    /* JADX INFO: renamed from: e */
    public final int m84765e() {
        return this.f60926b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m84766f() {
        return this.f60927c;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnLogCommand";
    }

    /* JADX INFO: renamed from: a */
    public final void m84762a(boolean z) {
        this.f60927c = z;
    }

    /* JADX INFO: renamed from: d */
    public final String m84764d() {
        return this.f60925a;
    }
}
