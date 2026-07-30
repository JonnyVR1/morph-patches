package p149l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lmt0 implements sxr0 {

    /* JADX INFO: renamed from: a */
    public q9t0 f128822a;

    /* JADX INFO: renamed from: b */
    public final Executor f128823b;

    /* JADX INFO: renamed from: c */
    public final qlt0 f128824c;

    /* JADX INFO: renamed from: d */
    public final Clock f128825d;

    /* JADX INFO: renamed from: e */
    public boolean f128826e = false;

    /* JADX INFO: renamed from: f */
    public boolean f128827f = false;

    /* JADX INFO: renamed from: g */
    public final amt0 f128828g = new amt0();

    public lmt0(Executor executor, qlt0 qlt0Var, Clock clock) {
        this.f128823b = executor;
        this.f128824c = qlt0Var;
        this.f128825d = clock;
    }

    /* JADX INFO: renamed from: x */
    private final void m150612x() {
        try {
            final JSONObject jSONObjectZzb = this.f128824c.zzb(this.f128828g);
            if (this.f128822a != null) {
                this.f128823b.execute(new Runnable() { // from class: l.kmt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123827a.m150615k(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            xsu0.m210835l("Failed to call video active view js", e);
        }
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        boolean z = this.f128827f ? false : rxr0Var.f161504j;
        amt0 amt0Var = this.f128828g;
        amt0Var.f70678a = z;
        amt0Var.f70681d = this.f128825d.elapsedRealtime();
        this.f128828g.f70683f = rxr0Var;
        if (this.f128826e) {
            m150612x();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m150613b() {
        this.f128826e = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m150614i() {
        this.f128826e = true;
        m150612x();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m150615k(JSONObject jSONObject) {
        this.f128822a.mo13723z0("AFMA_updateActiveView", jSONObject);
    }

    /* JADX INFO: renamed from: q */
    public final void m150616q(boolean z) {
        this.f128827f = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m150617u(q9t0 q9t0Var) {
        this.f128822a = q9t0Var;
    }
}
