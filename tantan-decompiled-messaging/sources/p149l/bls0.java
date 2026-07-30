package p149l;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class bls0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uls0 f76209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iks0 f76210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f76211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f76212d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vls0 f76213e;

    public bls0(vls0 vls0Var, uls0 uls0Var, iks0 iks0Var, ArrayList arrayList, long j) {
        this.f76209a = uls0Var;
        this.f76210b = iks0Var;
        this.f76211c = arrayList;
        this.f76212d = j;
        this.f76213e = vls0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xsu0.m210834k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f76213e.f181980a) {
            try {
                xsu0.m210834k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f76209a.m114705a() != -1 && this.f76209a.m114705a() != 1) {
                    this.f76209a.m114706c();
                    rmw0 rmw0Var = i3t0.f111376e;
                    final iks0 iks0Var = this.f76210b;
                    Objects.requireNonNull(iks0Var);
                    rmw0Var.execute(new Runnable() { // from class: l.als0
                        @Override // java.lang.Runnable
                        public final void run() {
                            iks0Var.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(d1s0.m109677c().m144697a(m7s0.f132195d));
                    int iM114705a = this.f76209a.m114705a();
                    int i = this.f76213e.f181988i;
                    String strConcat = this.f76211c.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f76211c.get(0)));
                    xsu0.m210834k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iM114705a + ". Update status(fullLoadTimeout) is " + i + strConcat + " ms. Total latency(fullLoadTimeout) is " + (vny0.m199064b().currentTimeMillis() - this.f76212d) + " ms at timeout. Rejecting.");
                    xsu0.m210834k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                xsu0.m210834k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
