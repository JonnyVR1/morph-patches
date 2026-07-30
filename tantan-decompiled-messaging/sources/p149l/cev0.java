package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class cev0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Clock f80503a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f80504b;

    public cev0(Clock clock, iyv0 iyv0Var) {
        this.f80503a = clock;
        this.f80504b = iyv0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 4;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142235h(new dev0(this.f80504b, this.f80503a.currentTimeMillis()));
    }
}
