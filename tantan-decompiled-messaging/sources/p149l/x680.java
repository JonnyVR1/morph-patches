package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class x680 {

    /* JADX INFO: renamed from: c */
    public static x680 f191220c;

    /* JADX INFO: renamed from: a */
    public lv00 f191221a;

    /* JADX INFO: renamed from: b */
    public lv00 f191222b;

    /* JADX INFO: renamed from: a */
    public static x680 m207168a() {
        if (f191220c == null) {
            f191220c = new x680();
        }
        return f191220c;
    }

    /* JADX INFO: renamed from: b */
    public cul m207169b(boolean z) {
        if (!z) {
            if (this.f191222b == null) {
                this.f191222b = new lv00(ypv.f199497e).m151831j0();
            }
            this.f191221a.mo108795g(false);
            return this.f191222b;
        }
        if (this.f191221a == null) {
            this.f191221a = new lv00(ypv.f199497e).m151831j0();
        }
        this.f191221a.mo108795g(false);
        m207171d();
        return this.f191221a;
    }

    /* JADX INFO: renamed from: c */
    public final void m207170c() {
        this.f191221a = new lv00(ypv.f199497e).m151831j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m207171d() {
        this.f191222b = new lv00(ypv.f199497e).m151831j0();
    }

    /* JADX INFO: renamed from: e */
    public void m207172e(boolean z) {
        lv00 lv00Var = this.f191221a;
        if (lv00Var != null) {
            lv00Var.mo108790b(z);
            this.f191221a = null;
        }
        lv00 lv00Var2 = this.f191222b;
        if (lv00Var2 != null) {
            lv00Var2.mo108790b(z);
            this.f191222b = null;
        }
        m207170c();
    }
}
