package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class cyy0 {

    /* JADX INFO: renamed from: a */
    public final Context f83045a;

    /* JADX INFO: renamed from: b */
    public abu0 f83046b;

    /* JADX INFO: renamed from: c */
    public ogt0 f83047c;

    /* JADX INFO: renamed from: d */
    public h2r0 f83048d;

    /* JADX INFO: renamed from: e */
    public boolean f83049e;

    public cyy0(Context context) {
        this.f83045a = context;
    }

    /* JADX INFO: renamed from: c */
    public final cyy0 m109397c(h2r0 h2r0Var) {
        this.f83048d = h2r0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final w1r0 m109398d() {
        f5v0.m119535f(!this.f83049e);
        v1r0 v1r0Var = null;
        if (this.f83047c == null) {
            if (this.f83046b == null) {
                this.f83046b = new hyy0(null);
            }
            this.f83047c = new iyy0(this.f83046b);
        }
        if (this.f83048d == null) {
            this.f83048d = new h2r0(this.f83045a, new eyy0(null), 0L);
        }
        w1r0 w1r0Var = new w1r0(this, v1r0Var);
        this.f83049e = true;
        return w1r0Var;
    }
}
