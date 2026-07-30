package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class jrr0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public String f119433a;

    /* JADX INFO: renamed from: b */
    public long f119434b;

    /* JADX INFO: renamed from: c */
    public String f119435c;

    /* JADX INFO: renamed from: d */
    public String f119436d;

    /* JADX INFO: renamed from: e */
    public String f119437e;

    public jrr0(String str) {
        this.f119433a = "E";
        this.f119434b = -1L;
        this.f119435c = "E";
        this.f119436d = "E";
        this.f119437e = "E";
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f119433a = mapM132716a.get(0) == null ? "E" : (String) mapM132716a.get(0);
            this.f119434b = mapM132716a.get(1) != null ? ((Long) mapM132716a.get(1)).longValue() : -1L;
            this.f119435c = mapM132716a.get(2) == null ? "E" : (String) mapM132716a.get(2);
            this.f119436d = mapM132716a.get(3) == null ? "E" : (String) mapM132716a.get(3);
            this.f119437e = mapM132716a.get(4) != null ? (String) mapM132716a.get(4) : "E";
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, this.f119433a);
        map.put(4, this.f119437e);
        map.put(3, this.f119436d);
        map.put(2, this.f119435c);
        map.put(1, Long.valueOf(this.f119434b));
        return map;
    }

    public jrr0() {
        this.f119433a = "E";
        this.f119434b = -1L;
        this.f119435c = "E";
        this.f119436d = "E";
        this.f119437e = "E";
    }
}
