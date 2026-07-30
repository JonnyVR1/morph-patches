package p149l;

import com.google.gson.Gson;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes13.dex */
public class hnd implements s1f {

    /* JADX INFO: renamed from: l.hnd$a */
    public static class C17346a {
        private static hnd INSTANCE = new hnd();
    }

    /* JADX INFO: renamed from: c */
    public static hnd m131888c() {
        return C17346a.INSTANCE;
    }

    @Override // p149l.s1f
    /* JADX INFO: renamed from: a */
    public String mo104783a() {
        return "default";
    }

    @Override // p149l.s1f
    /* JADX INFO: renamed from: b */
    public h3f mo104784b(MonitorEvent monitorEvent) {
        Gson gson = new Gson();
        h3f h3fVar = new h3f(monitorEvent.getFormat());
        h3fVar.m129168d(gson.toJson(monitorEvent));
        return h3fVar;
    }
}
