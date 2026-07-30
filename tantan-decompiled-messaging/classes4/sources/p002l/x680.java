package p002l;

import l.cul;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x680 {

    /* JADX INFO: renamed from: c */
    public static x680 f22138c;

    /* JADX INFO: renamed from: a */
    public lv00 f22139a;

    /* JADX INFO: renamed from: b */
    public lv00 f22140b;

    /* JADX INFO: renamed from: a */
    public static x680 m25692a() {
        if (f22138c == null) {
            f22138c = new x680();
        }
        return f22138c;
    }

    /* JADX INFO: renamed from: b */
    public cul m25693b(boolean z) {
        if (!z) {
            if (this.f22140b == null) {
                this.f22140b = new lv00(ypv.e).m17479j0();
            }
            this.f22139a.m16323g(false);
            return this.f22140b;
        }
        if (this.f22139a == null) {
            this.f22139a = new lv00(ypv.e).m17479j0();
        }
        this.f22139a.m16323g(false);
        m25695d();
        return this.f22139a;
    }

    /* JADX INFO: renamed from: c */
    public final void m25694c() {
        this.f22139a = new lv00(ypv.e).m17479j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m25695d() {
        this.f22140b = new lv00(ypv.e).m17479j0();
    }

    /* JADX INFO: renamed from: e */
    public void m25696e(boolean z) {
        lv00 lv00Var = this.f22139a;
        if (lv00Var != null) {
            lv00Var.m16313b(z);
            this.f22139a = null;
        }
        lv00 lv00Var2 = this.f22140b;
        if (lv00Var2 != null) {
            lv00Var2.m16313b(z);
            this.f22140b = null;
        }
        m25694c();
    }
}
