package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class l880 {

    /* JADX INFO: renamed from: c */
    public static l880 f126793c;

    /* JADX INFO: renamed from: a */
    public lv00 f126794a;

    /* JADX INFO: renamed from: b */
    public lv00 f126795b;

    /* JADX INFO: renamed from: a */
    public static l880 m148846a() {
        if (f126793c == null) {
            f126793c = new l880();
        }
        return f126793c;
    }

    /* JADX INFO: renamed from: b */
    public cul m148847b(boolean z) {
        if (!z) {
            if (this.f126795b == null) {
                this.f126795b = new lv00(ypv.f199497e).m151831j0();
            }
            this.f126794a.mo108795g(false);
            return this.f126795b;
        }
        if (this.f126794a == null) {
            this.f126794a = new lv00(ypv.f199497e).m151831j0();
        }
        this.f126794a.mo108795g(false);
        m148849d();
        return this.f126794a;
    }

    /* JADX INFO: renamed from: c */
    public final void m148848c() {
        this.f126794a = new lv00(ypv.f199497e).m151831j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m148849d() {
        this.f126795b = new lv00(ypv.f199497e).m151831j0();
    }

    /* JADX INFO: renamed from: e */
    public void m148850e(boolean z) {
        lv00 lv00Var = this.f126794a;
        if (lv00Var != null) {
            lv00Var.mo108790b(z);
            this.f126794a = null;
        }
        lv00 lv00Var2 = this.f126795b;
        if (lv00Var2 != null) {
            lv00Var2.mo108790b(z);
            this.f126795b = null;
        }
        m148848c();
    }
}
