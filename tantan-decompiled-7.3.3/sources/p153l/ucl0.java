package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class ucl0 {

    /* JADX INFO: renamed from: a */
    public bam f178443a = null;

    /* JADX INFO: renamed from: b */
    public bam f178444b = null;

    /* JADX INFO: renamed from: c */
    public bam f178445c = null;

    /* JADX INFO: renamed from: d */
    public it5 f178446d = new it5();

    /* JADX INFO: renamed from: e */
    public ht5 f178447e = new ht5();

    /* JADX INFO: renamed from: f */
    public bam.InterfaceC15959e f178448f = null;

    /* JADX INFO: renamed from: g */
    public String f178449g;

    /* JADX INFO: renamed from: h */
    public String f178450h;

    /* JADX INFO: renamed from: c */
    public static ucl0 m195409c() {
        return new ucl0();
    }

    /* JADX INFO: renamed from: a */
    public final void m195410a() {
        if (TextUtils.isEmpty(this.f178449g)) {
            wg3.m206174a("You should invoke method 'withOrigin()' before this");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m195411b() {
        if (this.f178445c != null) {
            return;
        }
        wg3.m206174a("You should invoke method 'withCompress(boolean soft)' before this");
    }

    /* JADX INFO: renamed from: d */
    public boolean m195412d() {
        m195411b();
        bam.InterfaceC15959e interfaceC15959e = this.f178448f;
        bam bamVar = this.f178445c;
        return interfaceC15959e != null ? bamVar.mo103216b(this.f178450h, this.f178447e, this.f178446d, interfaceC15959e) : bamVar.mo103215a(this.f178450h, this.f178447e, this.f178446d, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public ucl0 m195413e(bam.InterfaceC15959e interfaceC15959e) {
        this.f178448f = interfaceC15959e;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public ucl0 m195414f(boolean z) {
        m195410a();
        String str = this.f178449g;
        if (z) {
            this.f178445c = new fuf(str);
            return this;
        }
        this.f178445c = new frx(str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ucl0 m195415g(String str) {
        this.f178450h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public ucl0 m195416h(ht5 ht5Var) {
        if (ht5Var != null) {
            this.f178447e = ht5Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public ucl0 m195417i(String str) {
        this.f178449g = str;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public ucl0 m195418j(it5 it5Var) {
        if (it5Var != null) {
            this.f178446d = it5Var;
        }
        return this;
    }
}
