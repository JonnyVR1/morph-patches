package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class z23 implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final wk90<fb5<db5>> f202622a;

    /* JADX INFO: renamed from: b */
    public final int f202623b;

    /* JADX INFO: renamed from: c */
    public final int f202624c;

    /* JADX INFO: renamed from: d */
    public final boolean f202625d;

    /* JADX INFO: renamed from: l.z23$a */
    public static class C21746a extends pud<fb5<db5>, fb5<db5>> {

        /* JADX INFO: renamed from: c */
        public final int f202626c;

        /* JADX INFO: renamed from: d */
        public final int f202627d;

        public C21746a(z06<fb5<db5>> z06Var, int i, int i2) {
            super(z06Var);
            this.f202626c = i;
            this.f202627d = i2;
        }

        /* JADX INFO: renamed from: p */
        public final void m218387p(fb5<db5> fb5Var) {
            db5 db5VarM124875B;
            Bitmap bitmapMo96697b0;
            int rowBytes;
            if (fb5Var == null || !fb5Var.mo124877N() || (db5VarM124875B = fb5Var.m124875B()) == null || db5VarM124875B.isClosed() || !(db5VarM124875B instanceof ib5) || (bitmapMo96697b0 = ((ib5) db5VarM124875B).mo96697b0()) == null || (rowBytes = bitmapMo96697b0.getRowBytes() * bitmapMo96697b0.getHeight()) < this.f202626c || rowBytes > this.f202627d) {
                return;
            }
            bitmapMo96697b0.prepareToDraw();
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            m218387p(fb5Var);
            m173861o().mo144954b(fb5Var, i);
        }
    }

    public z23(wk90<fb5<db5>> wk90Var, int i, int i2, boolean z) {
        wn80.m207177b(Boolean.valueOf(i <= i2));
        this.f202622a = (wk90) wn80.m207182g(wk90Var);
        this.f202623b = i;
        this.f202624c = i2;
        this.f202625d = z;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        if (!yk90Var.mo117666H() || this.f202625d) {
            this.f202622a.mo8539b(new C21746a(z06Var, this.f202623b, this.f202624c), yk90Var);
        } else {
            this.f202622a.mo8539b(z06Var, yk90Var);
        }
    }
}
