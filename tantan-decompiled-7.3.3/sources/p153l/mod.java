package p153l;

import com.google.gson.Gson;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes11.dex */
public class mod implements x2f {

    /* JADX INFO: renamed from: l.mod$a */
    public static class C18664a {
        private static mod INSTANCE = new mod();
    }

    /* JADX INFO: renamed from: c */
    public static mod m159258c() {
        return C18664a.INSTANCE;
    }

    @Override // p153l.x2f
    /* JADX INFO: renamed from: a */
    public String mo107477a() {
        return "default";
    }

    @Override // p153l.x2f
    /* JADX INFO: renamed from: b */
    public m4f mo107478b(MonitorEvent monitorEvent) {
        Gson gson = new Gson();
        m4f m4fVar = new m4f(monitorEvent.getFormat());
        m4fVar.m157006d(gson.toJson(monitorEvent));
        return m4fVar;
    }
}
