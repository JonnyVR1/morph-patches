package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class bqv {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> f76818a;

    public bqv() {
        HashMap<String, Object> map = new HashMap<>();
        this.f76818a = map;
        map.put(fld0.f98150e.m121966a(), new hdv());
        map.put(fld0.f98151f.m121966a(), new bgv());
        map.put(fld0.f98147b.m121966a(), new idv());
        map.put(fld0.f98148c.m121966a(), new ggv());
        map.put(fld0.f98149d.m121966a(), new tpv());
    }

    /* JADX INFO: renamed from: a */
    public <V> V m103423a(fld0<V> fld0Var) {
        return (V) this.f76818a.get(fld0Var.m121966a());
    }
}
