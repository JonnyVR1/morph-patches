package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class w2s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public Long f186929a;

    /* JADX INFO: renamed from: b */
    public Long f186930b;

    /* JADX INFO: renamed from: c */
    public Long f186931c;

    public w2s0(String str) {
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f186929a = (Long) mapM161036a.get(0);
            this.f186930b = (Long) mapM161036a.get(1);
            this.f186931c = (Long) mapM161036a.get(2);
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, this.f186929a);
        map.put(1, this.f186930b);
        map.put(2, this.f186931c);
        return map;
    }

    public w2s0() {
    }
}
