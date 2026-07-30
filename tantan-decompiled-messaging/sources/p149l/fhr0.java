package p149l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fhr0 implements nfr0 {

    /* JADX INFO: renamed from: a */
    public final ygr0 f97542a;

    /* JADX INFO: renamed from: b */
    public final long[] f97543b;

    /* JADX INFO: renamed from: c */
    public final Map f97544c;

    /* JADX INFO: renamed from: d */
    public final Map f97545d;

    /* JADX INFO: renamed from: e */
    public final Map f97546e;

    public fhr0(ygr0 ygr0Var, Map map, Map map2, Map map3) {
        this.f97542a = ygr0Var;
        this.f97545d = map2;
        this.f97546e = map3;
        this.f97544c = Collections.unmodifiableMap(map);
        this.f97543b = ygr0Var.m214757h();
    }

    @Override // p149l.nfr0
    /* JADX INFO: renamed from: e */
    public final long mo121422e(int i) {
        return this.f97543b[i];
    }

    @Override // p149l.nfr0
    /* JADX INFO: renamed from: f */
    public final List mo121423f(long j) {
        return this.f97542a.m214754e(j, this.f97544c, this.f97545d, this.f97546e);
    }

    @Override // p149l.nfr0
    public final int zza() {
        return this.f97543b.length;
    }
}
