package p149l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kcj0 implements e5g0 {

    /* JADX INFO: renamed from: a */
    public final gcj0 f122387a;

    /* JADX INFO: renamed from: b */
    public final long[] f122388b;

    /* JADX INFO: renamed from: c */
    public final Map<String, jcj0> f122389c;

    /* JADX INFO: renamed from: d */
    public final Map<String, hcj0> f122390d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f122391e;

    public kcj0(gcj0 gcj0Var, Map<String, jcj0> map, Map<String, hcj0> map2, Map<String, String> map3) {
        this.f122387a = gcj0Var;
        this.f122390d = map2;
        this.f122391e = map3;
        this.f122389c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f122388b = gcj0Var.m125511j();
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: a */
    public long mo114791a(int i) {
        return this.f122388b[i];
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: b */
    public int mo114792b() {
        return this.f122388b.length;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: f */
    public int mo114793f(long j) {
        int iM197851e = vck0.m197851e(this.f122388b, j, false, false);
        if (iM197851e < this.f122388b.length) {
            return iM197851e;
        }
        return -1;
    }

    @Override // p149l.e5g0
    /* JADX INFO: renamed from: g */
    public List<ywb> mo114794g(long j) {
        return this.f122387a.m125509h(j, this.f122389c, this.f122390d, this.f122391e);
    }
}
