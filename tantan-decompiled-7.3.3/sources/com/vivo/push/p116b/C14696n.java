package com.vivo.push.p116b;

import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C14696n extends C14701s {

    /* JADX INFO: renamed from: a */
    private String f61772a;

    /* JADX INFO: renamed from: b */
    private int f61773b;

    /* JADX INFO: renamed from: c */
    private boolean f61774c;

    public C14696n() {
        super(7);
        this.f61773b = 0;
        this.f61774c = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m85932a(int i) {
        this.f61773b = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m85934b(String str) {
        this.f61772a = str;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85887a("content", this.f61772a);
        c14680a.m85884a("log_level", this.f61773b);
        c14680a.m85889a("is_server_log", this.f61774c);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61772a = c14680a.m85883a("content");
        this.f61773b = c14680a.m85891b("log_level", 0);
        this.f61774c = c14680a.m85897e("is_server_log");
    }

    /* JADX INFO: renamed from: e */
    public final int m85936e() {
        return this.f61773b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m85937f() {
        return this.f61774c;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnLogCommand";
    }

    /* JADX INFO: renamed from: a */
    public final void m85933a(boolean z) {
        this.f61774c = z;
    }

    /* JADX INFO: renamed from: d */
    public final String m85935d() {
        return this.f61772a;
    }
}
