package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzeml;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hqu0 {

    /* JADX INFO: renamed from: a */
    public final o7w0 f111181a;

    /* JADX INFO: renamed from: b */
    public final Executor f111182b;

    /* JADX INFO: renamed from: c */
    public final ltu0 f111183c;

    /* JADX INFO: renamed from: d */
    public final bsu0 f111184d;

    /* JADX INFO: renamed from: e */
    public final Context f111185e;

    /* JADX INFO: renamed from: f */
    public final xwu0 f111186f;

    /* JADX INFO: renamed from: g */
    public final vcw0 f111187g;

    /* JADX INFO: renamed from: h */
    public final yew0 f111188h;

    /* JADX INFO: renamed from: i */
    public final fbv0 f111189i;

    public hqu0(o7w0 o7w0Var, Executor executor, ltu0 ltu0Var, Context context, xwu0 xwu0Var, vcw0 vcw0Var, yew0 yew0Var, fbv0 fbv0Var, bsu0 bsu0Var) {
        this.f111181a = o7w0Var;
        this.f111182b = executor;
        this.f111183c = ltu0Var;
        this.f111185e = context;
        this.f111186f = xwu0Var;
        this.f111187g = vcw0Var;
        this.f111188h = yew0Var;
        this.f111189i = fbv0Var;
        this.f111184d = bsu0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final void m136693j(wit0 wit0Var) {
        wit0Var.mo13747j0("/videoClicked", aqs0.f72859h);
        wit0Var.zzN().zzG(true);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167979F3)).booleanValue()) {
            wit0Var.mo13747j0("/getNativeAdViewSignals", aqs0.f72870s);
        }
        wit0Var.mo13747j0("/getNativeClickMeta", aqs0.f72871t);
    }

    /* JADX INFO: renamed from: a */
    public final hpr m136694a(final JSONObject jSONObject) {
        return pvw0.m173987n(pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.ypu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f201130a.m136698e(obj);
            }
        }, this.f111182b), new xuw0() { // from class: l.xpu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f195744a.m136696c(jSONObject, (wit0) obj);
            }
        }, this.f111182b);
    }

    /* JADX INFO: renamed from: b */
    public final hpr m136695b(final String str, final String str2, final q6w0 q6w0Var, final t6w0 t6w0Var, final zzq zzqVar) {
        return pvw0.m173987n(pvw0.m173981h(null), new xuw0() { // from class: l.wpu0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f190349a.m136697d(zzqVar, q6w0Var, t6w0Var, str, str2, obj);
            }
        }, this.f111182b);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m136696c(JSONObject jSONObject, final wit0 wit0Var) throws Exception {
        final sct0 sct0VarM185388d = sct0.m185388d(wit0Var);
        if (this.f111181a.f145316b != null) {
            wit0Var.mo13710G(xkt0.m211418d());
        } else {
            wit0Var.mo13710G(xkt0.m211419e());
        }
        wit0Var.zzN().zzB(new lkt0() { // from class: l.zpu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str, String str2) {
                this.f205535a.m136699f(wit0Var, sct0VarM185388d, z, i, str, str2);
            }
        });
        wit0Var.mo13777z0("google.afma.nativeAds.renderVideo", jSONObject);
        return sct0VarM185388d;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m136697d(zzq zzqVar, q6w0 q6w0Var, t6w0 t6w0Var, String str, String str2, Object obj) throws Exception {
        final wit0 wit0VarM155812a = this.f111183c.m155812a(zzqVar, q6w0Var, t6w0Var);
        final sct0 sct0VarM185388d = sct0.m185388d(wit0VarM155812a);
        if (this.f111181a.f145316b != null) {
            m136701h(wit0VarM155812a);
            wit0VarM155812a.mo13710G(xkt0.m211418d());
        } else {
            yru0 yru0VarM106314b = this.f111184d.m106314b();
            wit0VarM155812a.zzN().zzN(yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, yru0VarM106314b, false, null, new w9s0(this.f111185e, null, null), null, null, this.f111189i, this.f111188h, this.f111186f, this.f111187g, null, yru0VarM106314b, null, null, null);
            m136693j(wit0VarM155812a);
        }
        wit0VarM155812a.zzN().zzB(new lkt0() { // from class: l.aqu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str3, String str4) {
                this.f72880a.m136700g(wit0VarM155812a, sct0VarM185388d, z, i, str3, str4);
            }
        });
        wit0VarM155812a.mo13773x0(str, str2, null);
        return sct0VarM185388d;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hpr m136698e(Object obj) throws Exception {
        wit0 wit0VarM155812a = this.f111183c.m155812a(zzq.m12307H(), null, null);
        final sct0 sct0VarM185388d = sct0.m185388d(wit0VarM155812a);
        m136701h(wit0VarM155812a);
        wit0VarM155812a.zzN().zzH(new mkt0() { // from class: l.bqu0
            @Override // p153l.mkt0
            public final void zza() {
                sct0VarM185388d.m185389e();
            }
        });
        wit0VarM155812a.loadUrl((String) jas0.m144075c().m176505a(sgs0.f167967E3));
        return sct0VarM185388d;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m136699f(wit0 wit0Var, sct0 sct0Var, boolean z, int i, String str, String str2) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168099P3)).booleanValue()) {
            m136702i(wit0Var, sct0Var);
            return;
        }
        if (z) {
            m136702i(wit0Var, sct0Var);
            return;
        }
        sct0Var.m190495c(new zzeml(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m136700g(wit0 wit0Var, sct0 sct0Var, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.f111181a.f145315a != null && wit0Var.mo13729a() != null) {
                wit0Var.mo13729a().m216432s8(this.f111181a.f145315a);
            }
            sct0Var.m185389e();
            return;
        }
        sct0Var.m190495c(new zzeml(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m136701h(wit0 wit0Var) {
        m136693j(wit0Var);
        wit0Var.mo13747j0("/video", aqs0.f72863l);
        wit0Var.mo13747j0("/videoMeta", aqs0.f72864m);
        wit0Var.mo13747j0("/precache", new vgt0());
        wit0Var.mo13747j0("/delayPageLoaded", aqs0.f72867p);
        wit0Var.mo13747j0("/instrument", aqs0.f72865n);
        wit0Var.mo13747j0("/log", aqs0.f72858g);
        wit0Var.mo13747j0("/click", new pos0(null, 0 == true ? 1 : 0));
        if (this.f111181a.f145316b != null) {
            wit0Var.zzN().zzE(true);
            wit0Var.mo13747j0("/open", new mqs0(null, null, null, null, null, null));
        } else {
            wit0Var.zzN().zzE(false);
        }
        if (bxy0.m106932p().m185241p(wit0Var.getContext())) {
            wit0Var.mo13747j0("/logScionEvent", new gqs0(wit0Var.getContext()));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m136702i(wit0 wit0Var, sct0 sct0Var) {
        if (this.f111181a.f145315a != null && wit0Var.mo13729a() != null) {
            wit0Var.mo13729a().m216432s8(this.f111181a.f145315a);
        }
        sct0Var.m185389e();
    }
}
