package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class qur0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public Long f156538a;

    /* JADX INFO: renamed from: b */
    public Long f156539b;

    public qur0(String str) {
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f156538a = (Long) mapM132716a.get(0);
            this.f156539b = (Long) mapM132716a.get(1);
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, this.f156538a);
        map.put(1, this.f156539b);
        return map;
    }

    public qur0() {
    }
}
