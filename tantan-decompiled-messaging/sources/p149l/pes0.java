package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class pes0 {

    /* JADX INFO: renamed from: a */
    public final shw0 f148480a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final vov0 f148481b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @GuardedBy("this")
    public wcs0 f148482c;

    public pes0(shw0 shw0Var, @Nullable vov0 vov0Var) {
        this.f148480a = shw0Var;
        this.f148481b = vov0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final fds0 m168546c() {
        les0 les0Var = null;
        if (this.f148481b == null) {
            return null;
        }
        return new mes0(this, les0Var);
    }

    /* JADX INFO: renamed from: d */
    public final ids0 m168547d() {
        return new oes0(this, null);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized wcs0 m168548f(vcs0 vcs0Var) {
        wcs0 wcs0Var = this.f148482c;
        if (wcs0Var != null) {
            return wcs0Var;
        }
        wcs0 wcs0Var2 = new wcs0(vcs0Var);
        this.f148482c = wcs0Var2;
        return wcs0Var2;
    }
}
