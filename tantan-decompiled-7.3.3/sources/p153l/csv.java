package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class csv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> f83496a;

    public csv() {
        HashMap<String, Object> map = new HashMap<>();
        this.f83496a = map;
        map.put(htd0.f111523e.m137074a(), new ifv());
        map.put(htd0.f111524f.m137074a(), new civ());
        map.put(htd0.f111520b.m137074a(), new jfv());
        map.put(htd0.f111521c.m137074a(), new hiv());
        map.put(htd0.f111522d.m137074a(), new urv());
    }

    /* JADX INFO: renamed from: a */
    public <V> V m112234a(htd0<V> htd0Var) {
        return (V) this.f83496a.get(htd0Var.m137074a());
    }
}
