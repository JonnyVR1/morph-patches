package p153l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class rvt0 implements y6s0 {

    /* JADX INFO: renamed from: a */
    public wit0 f165055a;

    /* JADX INFO: renamed from: b */
    public final Executor f165056b;

    /* JADX INFO: renamed from: c */
    public final wut0 f165057c;

    /* JADX INFO: renamed from: d */
    public final Clock f165058d;

    /* JADX INFO: renamed from: e */
    public boolean f165059e = false;

    /* JADX INFO: renamed from: f */
    public boolean f165060f = false;

    /* JADX INFO: renamed from: g */
    public final gvt0 f165061g = new gvt0();

    public rvt0(Executor executor, wut0 wut0Var, Clock clock) {
        this.f165056b = executor;
        this.f165057c = wut0Var;
        this.f165058d = clock;
    }

    /* JADX INFO: renamed from: x */
    private final void m183312x() {
        try {
            final JSONObject jSONObjectZzb = this.f165057c.zzb(this.f165061g);
            if (this.f165055a != null) {
                this.f165056b.execute(new Runnable() { // from class: l.qvt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f159807a.m183315k(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            d2v0.m113738l("Failed to call video active view js", e);
        }
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        boolean z = this.f165060f ? false : x6s0Var.f192630j;
        gvt0 gvt0Var = this.f165061g;
        gvt0Var.f106681a = z;
        gvt0Var.f106684d = this.f165058d.elapsedRealtime();
        this.f165061g.f106686f = x6s0Var;
        if (this.f165059e) {
            m183312x();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m183313b() {
        this.f165059e = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m183314i() {
        this.f165059e = true;
        m183312x();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m183315k(JSONObject jSONObject) {
        this.f165055a.mo13777z0("AFMA_updateActiveView", jSONObject);
    }

    /* JADX INFO: renamed from: q */
    public final void m183316q(boolean z) {
        this.f165060f = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m183317u(wit0 wit0Var) {
        this.f165055a = wit0Var;
    }
}
