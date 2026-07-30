package p153l;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class hus0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ avs0 f111693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ots0 f111694b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f111695c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f111696d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bvs0 f111697e;

    public hus0(bvs0 bvs0Var, avs0 avs0Var, ots0 ots0Var, ArrayList arrayList, long j) {
        this.f111693a = avs0Var;
        this.f111694b = ots0Var;
        this.f111695c = arrayList;
        this.f111696d = j;
        this.f111697e = bvs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2v0.m113737k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f111697e.f78623a) {
            try {
                d2v0.m113737k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f111693a.m149266a() != -1 && this.f111693a.m149266a() != 1) {
                    this.f111693a.m149267c();
                    xvw0 xvw0Var = oct0.f146737e;
                    final ots0 ots0Var = this.f111694b;
                    Objects.requireNonNull(ots0Var);
                    xvw0Var.execute(new Runnable() { // from class: l.gus0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ots0Var.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(jas0.m144075c().m176505a(sgs0.f168266d));
                    int iM149266a = this.f111693a.m149266a();
                    int i = this.f111697e.f78631i;
                    String strConcat = this.f111695c.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f111695c.get(0)));
                    d2v0.m113737k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iM149266a + ". Update status(fullLoadTimeout) is " + i + strConcat + " ms. Total latency(fullLoadTimeout) is " + (bxy0.m106918b().currentTimeMillis() - this.f111696d) + " ms at timeout. Rejecting.");
                    d2v0.m113737k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                d2v0.m113737k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
