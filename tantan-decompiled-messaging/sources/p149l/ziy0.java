package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ziy0 {

    /* JADX INFO: renamed from: b */
    public boolean f203359b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public bjy0 f203361d;

    /* JADX INFO: renamed from: e */
    public riy0 f203362e;

    /* JADX INFO: renamed from: a */
    public tfy0 f203358a = tfy0.f170032c;

    /* JADX INFO: renamed from: c */
    public final yiy0 f203360c = yiy0.f198565a;

    @Deprecated
    public ziy0() {
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final ziy0 m219079c(tfy0 tfy0Var) {
        this.f203358a = tfy0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ziy0 m219080d(qju0[] qju0VarArr) {
        this.f203361d = new bjy0(qju0VarArr);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final dky0 m219081e() {
        f5v0.m119535f(!this.f203359b);
        this.f203359b = true;
        if (this.f203361d == null) {
            this.f203361d = new bjy0(new qju0[0]);
        }
        cky0 cky0Var = null;
        if (this.f203362e == null) {
            this.f203362e = new riy0(null);
        }
        return new dky0(this, cky0Var);
    }
}
