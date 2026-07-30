package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a3s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public long f68315a;

    /* JADX INFO: renamed from: b */
    public long f68316b;

    public a3s0(String str) {
        this.f68315a = -1L;
        this.f68316b = -1L;
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f68315a = ((Long) mapM161036a.get(0)).longValue();
            this.f68316b = ((Long) mapM161036a.get(1)).longValue();
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f68315a));
        map.put(1, Long.valueOf(this.f68316b));
        return map;
    }

    public a3s0() {
        this.f68315a = -1L;
        this.f68316b = -1L;
    }
}
