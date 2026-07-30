package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class utr0 extends hrr0 {

    /* JADX INFO: renamed from: a */
    public long f178284a;

    /* JADX INFO: renamed from: b */
    public long f178285b;

    public utr0(String str) {
        this.f178284a = -1L;
        this.f178285b = -1L;
        HashMap mapM132716a = hrr0.m132716a(str);
        if (mapM132716a != null) {
            this.f178284a = ((Long) mapM132716a.get(0)).longValue();
            this.f178285b = ((Long) mapM132716a.get(1)).longValue();
        }
    }

    @Override // p149l.hrr0
    /* JADX INFO: renamed from: b */
    public final HashMap mo132717b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f178284a));
        map.put(1, Long.valueOf(this.f178285b));
        return map;
    }

    public utr0() {
        this.f178284a = -1L;
        this.f178285b = -1L;
    }
}
