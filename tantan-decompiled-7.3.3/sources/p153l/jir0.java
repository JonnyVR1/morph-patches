package p153l;

import com.google.android.gms.internal.ads.zzcc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jir0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f121117a;

    public jir0(sgr0 sgr0Var) {
        this.f121117a = sgr0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo125712a(bgw0 bgw0Var) throws zzcc;

    /* JADX INFO: renamed from: b */
    public abstract boolean mo125713b(bgw0 bgw0Var, long j) throws zzcc;

    /* JADX INFO: renamed from: c */
    public final boolean m144993c(bgw0 bgw0Var, long j) throws zzcc {
        return mo125712a(bgw0Var) && mo125713b(bgw0Var, j);
    }
}
