package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kiu0 {

    /* JADX INFO: renamed from: b */
    public final z0r0 f123392b;

    /* JADX INFO: renamed from: c */
    public final dat0 f123393c;

    /* JADX INFO: renamed from: d */
    public final Context f123394d;

    /* JADX INFO: renamed from: e */
    public final rnu0 f123395e;

    /* JADX INFO: renamed from: f */
    public final p3w0 f123396f;

    /* JADX INFO: renamed from: g */
    public final Executor f123397g;

    /* JADX INFO: renamed from: h */
    public final ptr0 f123398h;

    /* JADX INFO: renamed from: i */
    public final zzcei f123399i;

    /* JADX INFO: renamed from: k */
    public final z1v0 f123401k;

    /* JADX INFO: renamed from: l */
    public final s5w0 f123402l;

    /* JADX INFO: renamed from: m */
    public final k2v0 f123403m;

    /* JADX INFO: renamed from: n */
    public final myv0 f123404n;

    /* JADX INFO: renamed from: o */
    public gnr f123405o;

    /* JADX INFO: renamed from: a */
    public final xhu0 f123391a = new xhu0();

    /* JADX INFO: renamed from: j */
    public final khs0 f123400j = new khs0();

    public kiu0(hiu0 hiu0Var) {
        this.f123394d = hiu0Var.f107973c;
        this.f123397g = hiu0Var.f107977g;
        this.f123398h = hiu0Var.f107978h;
        this.f123399i = hiu0Var.f107979i;
        this.f123392b = hiu0Var.f107971a;
        this.f123393c = hiu0Var.f107972b;
        this.f123401k = hiu0Var.f107976f;
        this.f123402l = hiu0Var.f107980j;
        this.f123395e = hiu0Var.f107974d;
        this.f123396f = hiu0Var.f107975e;
        this.f123403m = hiu0Var.f107981k;
        this.f123404n = hiu0Var.f107982l;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q9t0 m146137a(q9t0 q9t0Var) {
        q9t0Var.mo13693j0("/result", this.f123400j);
        hbt0 hbt0VarZzN = q9t0Var.zzN();
        q0s0 q0s0Var = new q0s0(this.f123394d, null, null);
        z1v0 z1v0Var = this.f123401k;
        s5w0 s5w0Var = this.f123402l;
        rnu0 rnu0Var = this.f123395e;
        p3w0 p3w0Var = this.f123396f;
        xhu0 xhu0Var = this.f123391a;
        hbt0VarZzN.zzN(null, xhu0Var, xhu0Var, xhu0Var, xhu0Var, false, null, q0s0Var, null, null, z1v0Var, s5w0Var, rnu0Var, p3w0Var, null, null, null, null, null);
        return q9t0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m146138c(String str, JSONObject jSONObject, q9t0 q9t0Var) throws Exception {
        return this.f123400j.m145993b(q9t0Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized gnr m146139d(final String str, final JSONObject jSONObject) {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return jmw0.m142235h(null);
        }
        return jmw0.m142241n(gnrVar, new rlw0() { // from class: l.yhu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f198397a.m146138c(str, jSONObject, (q9t0) obj);
            }
        }, this.f123397g);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m146140e(kxv0 kxv0Var, nxv0 nxv0Var) {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return;
        }
        jmw0.m142245r(gnrVar, new eiu0(this, kxv0Var, nxv0Var), this.f123397g);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m146141f() {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return;
        }
        jmw0.m142245r(gnrVar, new aiu0(this), this.f123397g);
        this.f123405o = null;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m146142g(String str, Map map) {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return;
        }
        jmw0.m142245r(gnrVar, new diu0(this, "sendMessageToNativeJs", map), this.f123397g);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m146143h() {
        final String str = (String) d1s0.m109677c().m144697a(m7s0.f131884D3);
        final Context context = this.f123394d;
        final ptr0 ptr0Var = this.f123398h;
        final zzcei zzceiVar = this.f123399i;
        final z0r0 z0r0Var = this.f123392b;
        final k2v0 k2v0Var = this.f123403m;
        final myv0 myv0Var = this.f123404n;
        gnr gnrVarM142240m = jmw0.m142240m(jmw0.m142238k(new qlw0() { // from class: l.cat0
            @Override // p149l.qlw0
            public final gnr zza() throws zzcjw {
                vny0.m199062B();
                Context context2 = context;
                rbt0 rbt0VarM178692a = rbt0.m178692a();
                ptr0 ptr0Var2 = ptr0Var;
                k2v0 k2v0Var2 = k2v0Var;
                z0r0 z0r0Var2 = z0r0Var;
                q9t0 q9t0VarM110631a = dat0.m110631a(context2, rbt0VarM178692a, "", false, false, ptr0Var2, null, zzceiVar, null, null, z0r0Var2, z2s0.m216992a(), null, null, k2v0Var2, myv0Var);
                final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0VarM110631a);
                q9t0VarM110631a.zzN().zzB(new fbt0() { // from class: l.bat0
                    @Override // p149l.fbt0
                    /* JADX INFO: renamed from: a */
                    public final void mo96131a(boolean z, int i, String str2, String str3) {
                        m3t0VarM152951d.m152952e();
                    }
                });
                q9t0VarM110631a.loadUrl(str);
                return m3t0VarM152951d;
            }
        }, i3t0.f111376e), new yew0() { // from class: l.zhu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                q9t0 q9t0Var = (q9t0) obj;
                this.f203234a.m146137a(q9t0Var);
                return q9t0Var;
            }
        }, this.f123397g);
        this.f123405o = gnrVarM142240m;
        l3t0.m148407a(gnrVarM142240m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m146144i(String str, vgs0 vgs0Var) {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return;
        }
        jmw0.m142245r(gnrVar, new biu0(this, str, vgs0Var), this.f123397g);
    }

    /* JADX INFO: renamed from: j */
    public final void m146145j(WeakReference weakReference, String str, vgs0 vgs0Var) {
        m146144i(str, new jiu0(this, weakReference, str, vgs0Var, null));
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m146146k(String str, vgs0 vgs0Var) {
        gnr gnrVar = this.f123405o;
        if (gnrVar == null) {
            return;
        }
        jmw0.m142245r(gnrVar, new ciu0(this, str, vgs0Var), this.f123397g);
    }
}
