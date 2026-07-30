package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dmu0 {

    /* JADX INFO: renamed from: a */
    public ims0 f89731a;

    /* JADX INFO: renamed from: b */
    public fms0 f89732b;

    /* JADX INFO: renamed from: c */
    public fns0 f89733c;

    /* JADX INFO: renamed from: d */
    public sms0 f89734d;

    /* JADX INFO: renamed from: e */
    public xss0 f89735e;

    /* JADX INFO: renamed from: f */
    public final oof0 f89736f = new oof0();

    /* JADX INFO: renamed from: g */
    public final oof0 f89737g = new oof0();

    /* JADX INFO: renamed from: a */
    public final dmu0 m117023a(fms0 fms0Var) {
        this.f89732b = fms0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final dmu0 m117024b(ims0 ims0Var) {
        this.f89731a = ims0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final dmu0 m117025c(String str, oms0 oms0Var, @Nullable lms0 lms0Var) {
        this.f89736f.put(str, oms0Var);
        if (lms0Var != null) {
            this.f89737g.put(str, lms0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final dmu0 m117026d(xss0 xss0Var) {
        this.f89735e = xss0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final dmu0 m117027e(sms0 sms0Var) {
        this.f89734d = sms0Var;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final dmu0 m117028f(fns0 fns0Var) {
        this.f89733c = fns0Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final fmu0 m117029g() {
        return new fmu0(this);
    }
}
