package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class nur0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public Long f140647a;

    /* JADX INFO: renamed from: b */
    public Boolean f140648b;

    /* JADX INFO: renamed from: c */
    public Boolean f140649c;

    public nur0(String str) {
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f140647a = (Long) mapM132716a.get(0);
            this.f140648b = (Boolean) mapM132716a.get(1);
            this.f140649c = (Boolean) mapM132716a.get(2);
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, this.f140647a);
        map.put(1, this.f140648b);
        map.put(2, this.f140649c);
        return map;
    }

    public nur0() {
    }
}
