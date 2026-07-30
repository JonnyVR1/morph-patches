package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class f4s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public Long f97135a;

    /* JADX INFO: renamed from: b */
    public Long f97136b;

    /* JADX INFO: renamed from: c */
    public Long f97137c;

    /* JADX INFO: renamed from: d */
    public Long f97138d;

    /* JADX INFO: renamed from: e */
    public Long f97139e;

    public f4s0(String str) {
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f97135a = (Long) mapM161036a.get(0);
            this.f97136b = (Long) mapM161036a.get(1);
            this.f97137c = (Long) mapM161036a.get(2);
            this.f97138d = (Long) mapM161036a.get(3);
            this.f97139e = (Long) mapM161036a.get(4);
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, this.f97135a);
        map.put(1, this.f97136b);
        map.put(2, this.f97137c);
        map.put(3, this.f97138d);
        map.put(4, this.f97139e);
        return map;
    }

    public f4s0() {
    }
}
