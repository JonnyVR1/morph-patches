package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class j23 implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final sc90<fa5<da5>> f115873a;

    /* JADX INFO: renamed from: b */
    public final int f115874b;

    /* JADX INFO: renamed from: c */
    public final int f115875c;

    /* JADX INFO: renamed from: d */
    public final boolean f115876d;

    /* JADX INFO: renamed from: l.j23$a */
    public static class C17672a extends btd<fa5<da5>, fa5<da5>> {

        /* JADX INFO: renamed from: c */
        public final int f115877c;

        /* JADX INFO: renamed from: d */
        public final int f115878d;

        public C17672a(uz5<fa5<da5>> uz5Var, int i, int i2) {
            super(uz5Var);
            this.f115877c = i;
            this.f115878d = i2;
        }

        /* JADX INFO: renamed from: p */
        public final void m139403p(fa5<da5> fa5Var) {
            da5 da5VarM120155B;
            Bitmap bitmapMo95529a0;
            int rowBytes;
            if (fa5Var == null || !fa5Var.mo120157N() || (da5VarM120155B = fa5Var.m120155B()) == null || da5VarM120155B.isClosed() || !(da5VarM120155B instanceof ia5) || (bitmapMo95529a0 = ((ia5) da5VarM120155B).mo95529a0()) == null || (rowBytes = bitmapMo95529a0.getRowBytes() * bitmapMo95529a0.getHeight()) < this.f115877c || rowBytes > this.f115878d) {
                return;
            }
            bitmapMo95529a0.prepareToDraw();
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            m139403p(fa5Var);
            m103812o().mo107035b(fa5Var, i);
        }
    }

    public j23(sc90<fa5<da5>> sc90Var, int i, int i2, boolean z) {
        rf80.m179111b(Boolean.valueOf(i <= i2));
        this.f115873a = (sc90) rf80.m179116g(sc90Var);
        this.f115874b = i;
        this.f115875c = i2;
        this.f115876d = z;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        if (!uc90Var.mo155859H() || this.f115876d) {
            this.f115873a.mo8485b(new C17672a(uz5Var, this.f115874b, this.f115875c), uc90Var);
        } else {
            this.f115873a.mo8485b(uz5Var, uc90Var);
        }
    }
}
