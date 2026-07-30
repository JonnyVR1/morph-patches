package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class c9t0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f80523a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f80524b;

    public c9t0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f80523a = kqx0Var;
        this.f80524b = kqx0Var2;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b9t0 zzb() {
        return new b9t0((Clock) this.f80523a.zzb(), (z8t0) this.f80524b.zzb());
    }
}
