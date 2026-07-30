package p009l;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bqv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> f10239a;

    public bqv() {
        HashMap<String, Object> map = new HashMap<>();
        this.f10239a = map;
        map.put(fld0.f13079e.m14498a(), new hdv());
        map.put(fld0.f13080f.m14498a(), new bgv());
        map.put(fld0.f13076b.m14498a(), new idv());
        map.put(fld0.f13077c.m14498a(), new ggv());
        map.put(fld0.f13078d.m14498a(), new tpv());
    }

    /* JADX INFO: renamed from: a */
    public <V> V m12191a(fld0<V> fld0Var) {
        return (V) this.f10239a.get(fld0Var.m14498a());
    }
}
