package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xcu0 {

    /* JADX INFO: renamed from: a */
    public cds0 f192267a;

    /* JADX INFO: renamed from: b */
    public zcs0 f192268b;

    /* JADX INFO: renamed from: c */
    public zds0 f192269c;

    /* JADX INFO: renamed from: d */
    public mds0 f192270d;

    /* JADX INFO: renamed from: e */
    public rjs0 f192271e;

    /* JADX INFO: renamed from: f */
    public final hgf0 f192272f = new hgf0();

    /* JADX INFO: renamed from: g */
    public final hgf0 f192273g = new hgf0();

    /* JADX INFO: renamed from: a */
    public final xcu0 m208158a(zcs0 zcs0Var) {
        this.f192268b = zcs0Var;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final xcu0 m208159b(cds0 cds0Var) {
        this.f192267a = cds0Var;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final xcu0 m208160c(String str, ids0 ids0Var, @Nullable fds0 fds0Var) {
        this.f192272f.put(str, ids0Var);
        if (fds0Var != null) {
            this.f192273g.put(str, fds0Var);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final xcu0 m208161d(rjs0 rjs0Var) {
        this.f192271e = rjs0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final xcu0 m208162e(mds0 mds0Var) {
        this.f192270d = mds0Var;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final xcu0 m208163f(zds0 zds0Var) {
        this.f192269c = zds0Var;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final zcu0 m208164g() {
        return new zcu0(this);
    }
}
