package p007l;

import android.text.TextUtils;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class p3l0 {

    /* JADX INFO: renamed from: a */
    public l7m f3595a = null;

    /* JADX INFO: renamed from: b */
    public l7m f3596b = null;

    /* JADX INFO: renamed from: c */
    public l7m f3597c = null;

    /* JADX INFO: renamed from: d */
    public es5 f3598d = new es5();

    /* JADX INFO: renamed from: e */
    public ds5 f3599e = new ds5();

    /* JADX INFO: renamed from: f */
    public l7m.InterfaceC0600e f3600f = null;

    /* JADX INFO: renamed from: g */
    public String f3601g;

    /* JADX INFO: renamed from: h */
    public String f3602h;

    /* JADX INFO: renamed from: c */
    public static p3l0 m10241c() {
        return new p3l0();
    }

    /* JADX INFO: renamed from: a */
    public final void m10242a() {
        if (TextUtils.isEmpty(this.f3601g)) {
            ig3.a("You should invoke method 'withOrigin()' before this");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10243b() {
        if (this.f3597c != null) {
            return;
        }
        ig3.a("You should invoke method 'withCompress(boolean soft)' before this");
    }

    /* JADX INFO: renamed from: d */
    public boolean m10244d() {
        m10243b();
        l7m.InterfaceC0600e interfaceC0600e = this.f3600f;
        l7m l7mVar = this.f3597c;
        return interfaceC0600e != null ? l7mVar.mo9406b(this.f3602h, this.f3599e, this.f3598d, interfaceC0600e) : l7mVar.mo9405a(this.f3602h, this.f3599e, this.f3598d, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public p3l0 m10245e(l7m.InterfaceC0600e interfaceC0600e) {
        this.f3600f = interfaceC0600e;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public p3l0 m10246f(boolean z) {
        m10242a();
        String str = this.f3601g;
        if (z) {
            this.f3597c = new rsf(str);
            return this;
        }
        this.f3597c = new iix(str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public p3l0 m10247g(String str) {
        this.f3602h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public p3l0 m10248h(ds5 ds5Var) {
        if (ds5Var != null) {
            this.f3599e = ds5Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public p3l0 m10249i(String str) {
        this.f3601g = str;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public p3l0 m10250j(es5 es5Var) {
        if (es5Var != null) {
            this.f3598d = es5Var;
        }
        return this;
    }
}
