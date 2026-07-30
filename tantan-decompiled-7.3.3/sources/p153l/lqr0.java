package p153l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lqr0 implements tor0 {

    /* JADX INFO: renamed from: a */
    public final eqr0 f133243a;

    /* JADX INFO: renamed from: b */
    public final long[] f133244b;

    /* JADX INFO: renamed from: c */
    public final Map f133245c;

    /* JADX INFO: renamed from: d */
    public final Map f133246d;

    /* JADX INFO: renamed from: e */
    public final Map f133247e;

    public lqr0(eqr0 eqr0Var, Map map, Map map2, Map map3) {
        this.f133243a = eqr0Var;
        this.f133246d = map2;
        this.f133247e = map3;
        this.f133245c = Collections.unmodifiableMap(map);
        this.f133244b = eqr0Var.m122059h();
    }

    @Override // p153l.tor0
    /* JADX INFO: renamed from: e */
    public final long mo155502e(int i) {
        return this.f133244b[i];
    }

    @Override // p153l.tor0
    /* JADX INFO: renamed from: f */
    public final List mo155503f(long j) {
        return this.f133243a.m122056e(j, this.f133245c, this.f133246d, this.f133247e);
    }

    @Override // p153l.tor0
    public final int zza() {
        return this.f133244b.length;
    }
}
