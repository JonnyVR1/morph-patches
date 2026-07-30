package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class w3s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public Long f187167a;

    /* JADX INFO: renamed from: b */
    public Long f187168b;

    public w3s0(String str) {
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f187167a = (Long) mapM161036a.get(0);
            this.f187168b = (Long) mapM161036a.get(1);
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, this.f187167a);
        map.put(1, this.f187168b);
        return map;
    }

    public w3s0() {
    }
}
