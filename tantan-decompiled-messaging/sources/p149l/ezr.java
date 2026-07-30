package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ezr {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> f93937a;

    public ezr() {
        HashMap<String, Object> map = new HashMap<>();
        this.f93937a = map;
        map.put(gld0.f103314d.m126747a(), new jj3());
        map.put(gld0.f103315e.m126747a(), new gl3());
        map.put(gld0.f103312b.m126747a(), new nj3());
        map.put(gld0.f103313c.m126747a(), new hl3());
    }

    /* JADX INFO: renamed from: a */
    public <V> V m119009a(gld0<V> gld0Var) {
        return (V) this.f93937a.get(gld0Var.m126747a());
    }
}
