package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class c8y0 {

    /* JADX INFO: renamed from: a */
    public boolean f80257a;

    /* JADX INFO: renamed from: b */
    public edy0 f80258b;

    /* JADX INFO: renamed from: c */
    public int f80259c;

    /* JADX INFO: renamed from: d */
    public boolean f80260d;

    /* JADX INFO: renamed from: e */
    public int f80261e;

    /* JADX INFO: renamed from: f */
    public boolean f80262f;

    /* JADX INFO: renamed from: g */
    public int f80263g;

    public c8y0(edy0 edy0Var) {
        this.f80258b = edy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m108392a(int i) {
        this.f80257a = 1 == ((this.f80257a ? 1 : 0) | i);
        this.f80259c += i;
    }

    /* JADX INFO: renamed from: b */
    public final void m108393b(int i) {
        this.f80257a = true;
        this.f80262f = true;
        this.f80263g = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m108394c(edy0 edy0Var) {
        this.f80257a |= this.f80258b != edy0Var;
        this.f80258b = edy0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m108395d(int i) {
        if (this.f80260d && this.f80261e != 5) {
            lev0.m153956d(i == 5);
            return;
        }
        this.f80257a = true;
        this.f80260d = true;
        this.f80261e = i;
    }
}
