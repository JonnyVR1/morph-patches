package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class i7z0 {

    /* JADX INFO: renamed from: a */
    public final Context f113311a;

    /* JADX INFO: renamed from: b */
    public gku0 f113312b;

    /* JADX INFO: renamed from: c */
    public upt0 f113313c;

    /* JADX INFO: renamed from: d */
    public nbr0 f113314d;

    /* JADX INFO: renamed from: e */
    public boolean f113315e;

    public i7z0(Context context) {
        this.f113311a = context;
    }

    /* JADX INFO: renamed from: c */
    public final i7z0 m138989c(nbr0 nbr0Var) {
        this.f113314d = nbr0Var;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final cbr0 m138990d() {
        lev0.m153958f(!this.f113315e);
        bbr0 bbr0Var = null;
        if (this.f113313c == null) {
            if (this.f113312b == null) {
                this.f113312b = new n7z0(null);
            }
            this.f113313c = new o7z0(this.f113312b);
        }
        if (this.f113314d == null) {
            this.f113314d = new nbr0(this.f113311a, new k7z0(null), 0L);
        }
        cbr0 cbr0Var = new cbr0(this, bbr0Var);
        this.f113315e = true;
        return cbr0Var;
    }
}
