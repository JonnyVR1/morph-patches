package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzeml;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bhu0 {

    /* JADX INFO: renamed from: a */
    public final iyv0 f75664a;

    /* JADX INFO: renamed from: b */
    public final Executor f75665b;

    /* JADX INFO: renamed from: c */
    public final fku0 f75666c;

    /* JADX INFO: renamed from: d */
    public final viu0 f75667d;

    /* JADX INFO: renamed from: e */
    public final Context f75668e;

    /* JADX INFO: renamed from: f */
    public final rnu0 f75669f;

    /* JADX INFO: renamed from: g */
    public final p3w0 f75670g;

    /* JADX INFO: renamed from: h */
    public final s5w0 f75671h;

    /* JADX INFO: renamed from: i */
    public final z1v0 f75672i;

    public bhu0(iyv0 iyv0Var, Executor executor, fku0 fku0Var, Context context, rnu0 rnu0Var, p3w0 p3w0Var, s5w0 s5w0Var, z1v0 z1v0Var, viu0 viu0Var) {
        this.f75664a = iyv0Var;
        this.f75665b = executor;
        this.f75666c = fku0Var;
        this.f75668e = context;
        this.f75669f = rnu0Var;
        this.f75670g = p3w0Var;
        this.f75671h = s5w0Var;
        this.f75672i = z1v0Var;
        this.f75667d = viu0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final void m101925j(q9t0 q9t0Var) {
        q9t0Var.mo13693j0("/videoClicked", ugs0.f176432h);
        q9t0Var.zzN().zzG(true);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131908F3)).booleanValue()) {
            q9t0Var.mo13693j0("/getNativeAdViewSignals", ugs0.f176443s);
        }
        q9t0Var.mo13693j0("/getNativeClickMeta", ugs0.f176444t);
    }

    /* JADX INFO: renamed from: a */
    public final gnr m101926a(final JSONObject jSONObject) {
        return jmw0.m142241n(jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.sgu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f164485a.m101930e(obj);
            }
        }, this.f75665b), new rlw0() { // from class: l.rgu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f159291a.m101928c(jSONObject, (q9t0) obj);
            }
        }, this.f75665b);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m101927b(final String str, final String str2, final kxv0 kxv0Var, final nxv0 nxv0Var, final zzq zzqVar) {
        return jmw0.m142241n(jmw0.m142235h(null), new rlw0() { // from class: l.qgu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f154377a.m101929d(zzqVar, kxv0Var, nxv0Var, str, str2, obj);
            }
        }, this.f75665b);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m101928c(JSONObject jSONObject, final q9t0 q9t0Var) throws Exception {
        final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0Var);
        if (this.f75664a.f115492b != null) {
            q9t0Var.mo13656G(rbt0.m178695d());
        } else {
            q9t0Var.mo13656G(rbt0.m178696e());
        }
        q9t0Var.zzN().zzB(new fbt0() { // from class: l.tgu0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str, String str2) {
                this.f170132a.m101931f(q9t0Var, m3t0VarM152951d, z, i, str, str2);
            }
        });
        q9t0Var.mo13723z0("google.afma.nativeAds.renderVideo", jSONObject);
        return m3t0VarM152951d;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m101929d(zzq zzqVar, kxv0 kxv0Var, nxv0 nxv0Var, String str, String str2, Object obj) throws Exception {
        final q9t0 q9t0VarM121894a = this.f75666c.m121894a(zzqVar, kxv0Var, nxv0Var);
        final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0VarM121894a);
        if (this.f75664a.f115492b != null) {
            m101933h(q9t0VarM121894a);
            q9t0VarM121894a.mo13656G(rbt0.m178695d());
        } else {
            siu0 siu0VarM198608b = this.f75667d.m198608b();
            q9t0VarM121894a.zzN().zzN(siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, siu0VarM198608b, false, null, new q0s0(this.f75668e, null, null), null, null, this.f75672i, this.f75671h, this.f75669f, this.f75670g, null, siu0VarM198608b, null, null, null);
            m101925j(q9t0VarM121894a);
        }
        q9t0VarM121894a.zzN().zzB(new fbt0() { // from class: l.ugu0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str3, String str4) {
                this.f176454a.m101932g(q9t0VarM121894a, m3t0VarM152951d, z, i, str3, str4);
            }
        });
        q9t0VarM121894a.mo13719x0(str, str2, null);
        return m3t0VarM152951d;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gnr m101930e(Object obj) throws Exception {
        q9t0 q9t0VarM121894a = this.f75666c.m121894a(zzq.m12253H(), null, null);
        final m3t0 m3t0VarM152951d = m3t0.m152951d(q9t0VarM121894a);
        m101933h(q9t0VarM121894a);
        q9t0VarM121894a.zzN().zzH(new gbt0() { // from class: l.vgu0
            @Override // p149l.gbt0
            public final void zza() {
                m3t0VarM152951d.m152952e();
            }
        });
        q9t0VarM121894a.loadUrl((String) d1s0.m109677c().m144697a(m7s0.f131896E3));
        return m3t0VarM152951d;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m101931f(q9t0 q9t0Var, m3t0 m3t0Var, boolean z, int i, String str, String str2) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132028P3)).booleanValue()) {
            m101934i(q9t0Var, m3t0Var);
            return;
        }
        if (z) {
            m101934i(q9t0Var, m3t0Var);
            return;
        }
        m3t0Var.m157775c(new zzeml(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m101932g(q9t0 q9t0Var, m3t0 m3t0Var, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.f75664a.f115491a != null && q9t0Var.mo13675a() != null) {
                q9t0Var.mo13675a().m183094s8(this.f75664a.f115491a);
            }
            m3t0Var.m152952e();
            return;
        }
        m3t0Var.m157775c(new zzeml(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m101933h(q9t0 q9t0Var) {
        m101925j(q9t0Var);
        q9t0Var.mo13693j0("/video", ugs0.f176436l);
        q9t0Var.mo13693j0("/videoMeta", ugs0.f176437m);
        q9t0Var.mo13693j0("/precache", new p7t0());
        q9t0Var.mo13693j0("/delayPageLoaded", ugs0.f176440p);
        q9t0Var.mo13693j0("/instrument", ugs0.f176438n);
        q9t0Var.mo13693j0("/log", ugs0.f176431g);
        q9t0Var.mo13693j0("/click", new jfs0(null, 0 == true ? 1 : 0));
        if (this.f75664a.f115492b != null) {
            q9t0Var.zzN().zzE(true);
            q9t0Var.mo13693j0("/open", new ghs0(null, null, null, null, null, null));
        } else {
            q9t0Var.zzN().zzE(false);
        }
        if (vny0.m199078p().m152537p(q9t0Var.getContext())) {
            q9t0Var.mo13693j0("/logScionEvent", new ahs0(q9t0Var.getContext()));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m101934i(q9t0 q9t0Var, m3t0 m3t0Var) {
        if (this.f75664a.f115491a != null && q9t0Var.mo13675a() != null) {
            q9t0Var.mo13675a().m183094s8(this.f75664a.f115491a);
        }
        m3t0Var.m152952e();
    }
}
