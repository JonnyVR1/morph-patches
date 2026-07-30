package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class f1s {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> f96825a;

    public f1s() {
        HashMap<String, Object> map = new HashMap<>();
        this.f96825a = map;
        map.put(itd0.f116822d.m142034a(), new bk3());
        map.put(itd0.f116823e.m142034a(), new fm3());
        map.put(itd0.f116820b.m142034a(), new fk3());
        map.put(itd0.f116821c.m142034a(), new gm3());
    }

    /* JADX INFO: renamed from: a */
    public <V> V m123583a(itd0<V> itd0Var) {
        return (V) this.f96825a.get(itd0Var.m142034a());
    }
}
