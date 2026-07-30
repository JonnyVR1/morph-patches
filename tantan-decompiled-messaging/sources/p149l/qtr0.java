package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class qtr0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public Long f156382a;

    /* JADX INFO: renamed from: b */
    public Long f156383b;

    /* JADX INFO: renamed from: c */
    public Long f156384c;

    public qtr0(String str) {
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f156382a = (Long) mapM132716a.get(0);
            this.f156383b = (Long) mapM132716a.get(1);
            this.f156384c = (Long) mapM132716a.get(2);
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, this.f156382a);
        map.put(1, this.f156383b);
        map.put(2, this.f156384c);
        return map;
    }

    public qtr0() {
    }
}
