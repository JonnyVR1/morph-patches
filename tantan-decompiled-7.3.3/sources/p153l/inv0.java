package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class inv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Clock f116003a;

    /* JADX INFO: renamed from: b */
    public final o7w0 f116004b;

    public inv0(Clock clock, o7w0 o7w0Var) {
        this.f116003a = clock;
        this.f116004b = o7w0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 4;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173981h(new jnv0(this.f116004b, this.f116003a.currentTimeMillis()));
    }
}
