package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class hqv0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f111190a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f111191b;

    public hqv0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f111190a = kqx0Var;
        this.f111191b = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ypv0(((tpv0) this.f111190a).zzb(), 10000L, (Clock) this.f111191b.zzb());
    }
}
