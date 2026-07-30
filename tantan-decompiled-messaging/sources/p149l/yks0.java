package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yks0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f198831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uls0 f198832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iks0 f198833c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vls0 f198834d;

    public yks0(vls0 vls0Var, long j, uls0 uls0Var, iks0 iks0Var) {
        this.f198831a = j;
        this.f198832b = uls0Var;
        this.f198833c = iks0Var;
        this.f198834d = vls0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        xsu0.m210834k("onGmsg /jsLoaded. JsLoaded latency is " + (vny0.m199064b().currentTimeMillis() - this.f198831a) + " ms.");
        xsu0.m210834k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f198834d.f181980a) {
            xsu0.m210834k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f198832b.m114705a() != -1 && this.f198832b.m114705a() != 1) {
                this.f198834d.f181988i = 0;
                iks0 iks0Var = this.f198833c;
                iks0Var.mo175389q0("/log", ugs0.f176431g);
                iks0Var.mo175389q0("/result", ugs0.f176439o);
                this.f198832b.m114707d(this.f198833c);
                this.f198834d.f181987h = this.f198832b;
                xsu0.m210834k("Successfully loaded JS Engine.");
                xsu0.m210834k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            xsu0.m210834k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
