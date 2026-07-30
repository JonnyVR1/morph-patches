package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class t3s0 extends n0s0 {

    /* JADX INFO: renamed from: a */
    public Long f171951a;

    /* JADX INFO: renamed from: b */
    public Boolean f171952b;

    /* JADX INFO: renamed from: c */
    public Boolean f171953c;

    public t3s0(String str) {
        HashMap mapM161036a = n0s0.m161036a(str);
        if (mapM161036a != null) {
            this.f171951a = (Long) mapM161036a.get(0);
            this.f171952b = (Boolean) mapM161036a.get(1);
            this.f171953c = (Boolean) mapM161036a.get(2);
        }
    }

    @Override // p153l.n0s0
    /* JADX INFO: renamed from: b */
    public final HashMap mo95868b() {
        HashMap map = new HashMap();
        map.put(0, this.f171951a);
        map.put(1, this.f171952b);
        map.put(2, this.f171953c);
        return map;
    }

    public t3s0() {
    }
}
