package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class p0s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public String f150091a;

    /* JADX INFO: renamed from: b */
    public long f150092b;

    /* JADX INFO: renamed from: c */
    public String f150093c;

    /* JADX INFO: renamed from: d */
    public String f150094d;

    /* JADX INFO: renamed from: e */
    public String f150095e;

    public p0s0(String str) {
        this.f150091a = "E";
        this.f150092b = -1L;
        this.f150093c = "E";
        this.f150094d = "E";
        this.f150095e = "E";
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f150091a = mapM161036a.get(0) == null ? "E" : (String) mapM161036a.get(0);
            this.f150092b = mapM161036a.get(1) != null ? ((Long) mapM161036a.get(1)).longValue() : -1L;
            this.f150093c = mapM161036a.get(2) == null ? "E" : (String) mapM161036a.get(2);
            this.f150094d = mapM161036a.get(3) == null ? "E" : (String) mapM161036a.get(3);
            this.f150095e = mapM161036a.get(4) != null ? (String) mapM161036a.get(4) : "E";
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, this.f150091a);
        map.put(4, this.f150095e);
        map.put(3, this.f150094d);
        map.put(2, this.f150093c);
        map.put(1, Long.valueOf(this.f150092b));
        return map;
    }

    public p0s0() {
        this.f150091a = "E";
        this.f150092b = -1L;
        this.f150093c = "E";
        this.f150094d = "E";
        this.f150095e = "E";
    }
}
