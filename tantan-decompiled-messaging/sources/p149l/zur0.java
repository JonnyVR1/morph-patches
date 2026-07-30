package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class zur0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public Long f204880a;

    /* JADX INFO: renamed from: b */
    public Long f204881b;

    /* JADX INFO: renamed from: c */
    public Long f204882c;

    /* JADX INFO: renamed from: d */
    public Long f204883d;

    /* JADX INFO: renamed from: e */
    public Long f204884e;

    public zur0(String str) {
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f204880a = (Long) mapM132716a.get(0);
            this.f204881b = (Long) mapM132716a.get(1);
            this.f204882c = (Long) mapM132716a.get(2);
            this.f204883d = (Long) mapM132716a.get(3);
            this.f204884e = (Long) mapM132716a.get(4);
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, this.f204880a);
        map.put(1, this.f204881b);
        map.put(2, this.f204882c);
        map.put(3, this.f204883d);
        map.put(4, this.f204884e);
        return map;
    }

    public zur0() {
    }
}
