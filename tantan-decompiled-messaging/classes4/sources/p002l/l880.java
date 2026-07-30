package p002l;

import l.cul;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l880 {

    /* JADX INFO: renamed from: c */
    public static l880 f14712c;

    /* JADX INFO: renamed from: a */
    public lv00 f14713a;

    /* JADX INFO: renamed from: b */
    public lv00 f14714b;

    /* JADX INFO: renamed from: a */
    public static l880 m17037a() {
        if (f14712c == null) {
            f14712c = new l880();
        }
        return f14712c;
    }

    /* JADX INFO: renamed from: b */
    public cul m17038b(boolean z) {
        if (!z) {
            if (this.f14714b == null) {
                this.f14714b = new lv00(ypv.e).m17479j0();
            }
            this.f14713a.m16323g(false);
            return this.f14714b;
        }
        if (this.f14713a == null) {
            this.f14713a = new lv00(ypv.e).m17479j0();
        }
        this.f14713a.m16323g(false);
        m17040d();
        return this.f14713a;
    }

    /* JADX INFO: renamed from: c */
    public final void m17039c() {
        this.f14713a = new lv00(ypv.e).m17479j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m17040d() {
        this.f14714b = new lv00(ypv.e).m17479j0();
    }

    /* JADX INFO: renamed from: e */
    public void m17041e(boolean z) {
        lv00 lv00Var = this.f14713a;
        if (lv00Var != null) {
            lv00Var.m16313b(z);
            this.f14713a = null;
        }
        lv00 lv00Var2 = this.f14714b;
        if (lv00Var2 != null) {
            lv00Var2.m16313b(z);
            this.f14714b = null;
        }
        m17039c();
    }
}
