package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class eus0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f95956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ avs0 f95957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ots0 f95958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bvs0 f95959d;

    public eus0(bvs0 bvs0Var, long j, avs0 avs0Var, ots0 ots0Var) {
        this.f95956a = j;
        this.f95957b = avs0Var;
        this.f95958c = ots0Var;
        this.f95959d = bvs0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        d2v0.m113737k("onGmsg /jsLoaded. JsLoaded latency is " + (bxy0.m106918b().currentTimeMillis() - this.f95956a) + " ms.");
        d2v0.m113737k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f95959d.f78623a) {
            d2v0.m113737k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f95957b.m149266a() != -1 && this.f95957b.m149266a() != 1) {
                this.f95959d.f78631i = 0;
                ots0 ots0Var = this.f95958c;
                ots0Var.mo112872q0("/log", aqs0.f72858g);
                ots0Var.mo112872q0("/result", aqs0.f72866o);
                this.f95957b.m149268d(this.f95958c);
                this.f95959d.f78630h = this.f95957b;
                d2v0.m113737k("Successfully loaded JS Engine.");
                d2v0.m113737k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            d2v0.m113737k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
