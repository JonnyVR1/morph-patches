package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class p3l0 {

    /* JADX INFO: renamed from: a */
    public l7m f146994a = null;

    /* JADX INFO: renamed from: b */
    public l7m f146995b = null;

    /* JADX INFO: renamed from: c */
    public l7m f146996c = null;

    /* JADX INFO: renamed from: d */
    public es5 f146997d = new es5();

    /* JADX INFO: renamed from: e */
    public ds5 f146998e = new ds5();

    /* JADX INFO: renamed from: f */
    public l7m.InterfaceC18162e f146999f = null;

    /* JADX INFO: renamed from: g */
    public String f147000g;

    /* JADX INFO: renamed from: h */
    public String f147001h;

    /* JADX INFO: renamed from: c */
    public static p3l0 m167256c() {
        return new p3l0();
    }

    /* JADX INFO: renamed from: a */
    public final void m167257a() {
        if (TextUtils.isEmpty(this.f147000g)) {
            ig3.m135964a("You should invoke method 'withOrigin()' before this");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m167258b() {
        if (this.f146996c != null) {
            return;
        }
        ig3.m135964a("You should invoke method 'withCompress(boolean soft)' before this");
    }

    /* JADX INFO: renamed from: d */
    public boolean m167259d() {
        m167258b();
        l7m.InterfaceC18162e interfaceC18162e = this.f146999f;
        l7m l7mVar = this.f146996c;
        return interfaceC18162e != null ? l7mVar.mo136482b(this.f147001h, this.f146998e, this.f146997d, interfaceC18162e) : l7mVar.mo136481a(this.f147001h, this.f146998e, this.f146997d, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public p3l0 m167260e(l7m.InterfaceC18162e interfaceC18162e) {
        this.f146999f = interfaceC18162e;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public p3l0 m167261f(boolean z) {
        m167257a();
        String str = this.f147000g;
        if (z) {
            this.f146996c = new rsf(str);
            return this;
        }
        this.f146996c = new iix(str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public p3l0 m167262g(String str) {
        this.f147001h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public p3l0 m167263h(ds5 ds5Var) {
        if (ds5Var != null) {
            this.f146998e = ds5Var;
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public p3l0 m167264i(String str) {
        this.f147000g = str;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public p3l0 m167265j(es5 es5Var) {
        if (es5Var != null) {
            this.f146997d = es5Var;
        }
        return this;
    }
}
