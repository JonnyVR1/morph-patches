package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class fsy0 {

    /* JADX INFO: renamed from: b */
    public boolean f100698b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public hsy0 f100700d;

    /* JADX INFO: renamed from: e */
    public xry0 f100701e;

    /* JADX INFO: renamed from: a */
    public zoy0 f100697a = zoy0.f205401c;

    /* JADX INFO: renamed from: c */
    public final esy0 f100699c = esy0.f95668a;

    @Deprecated
    public fsy0() {
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final fsy0 m127277c(zoy0 zoy0Var) {
        this.f100697a = zoy0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final fsy0 m127278d(wsu0[] wsu0VarArr) {
        this.f100700d = new hsy0(wsu0VarArr);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final jty0 m127279e() {
        lev0.m153958f(!this.f100698b);
        this.f100698b = true;
        if (this.f100700d == null) {
            this.f100700d = new hsy0(new wsu0[0]);
        }
        ity0 ity0Var = null;
        if (this.f100701e == null) {
            this.f100701e = new xry0(null);
        }
        return new jty0(this, ity0Var);
    }
}
