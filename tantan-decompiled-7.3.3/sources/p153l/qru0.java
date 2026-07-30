package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qru0 {

    /* JADX INFO: renamed from: b */
    public final far0 f159207b;

    /* JADX INFO: renamed from: c */
    public final jjt0 f159208c;

    /* JADX INFO: renamed from: d */
    public final Context f159209d;

    /* JADX INFO: renamed from: e */
    public final xwu0 f159210e;

    /* JADX INFO: renamed from: f */
    public final vcw0 f159211f;

    /* JADX INFO: renamed from: g */
    public final Executor f159212g;

    /* JADX INFO: renamed from: h */
    public final v2s0 f159213h;

    /* JADX INFO: renamed from: i */
    public final zzcei f159214i;

    /* JADX INFO: renamed from: k */
    public final fbv0 f159216k;

    /* JADX INFO: renamed from: l */
    public final yew0 f159217l;

    /* JADX INFO: renamed from: m */
    public final qbv0 f159218m;

    /* JADX INFO: renamed from: n */
    public final s7w0 f159219n;

    /* JADX INFO: renamed from: o */
    public hpr f159220o;

    /* JADX INFO: renamed from: a */
    public final dru0 f159206a = new dru0();

    /* JADX INFO: renamed from: j */
    public final qqs0 f159215j = new qqs0();

    public qru0(nru0 nru0Var) {
        this.f159209d = nru0Var.f143434c;
        this.f159212g = nru0Var.f143438g;
        this.f159213h = nru0Var.f143439h;
        this.f159214i = nru0Var.f143440i;
        this.f159207b = nru0Var.f143432a;
        this.f159208c = nru0Var.f143433b;
        this.f159216k = nru0Var.f143437f;
        this.f159217l = nru0Var.f143441j;
        this.f159210e = nru0Var.f143435d;
        this.f159211f = nru0Var.f143436e;
        this.f159218m = nru0Var.f143442k;
        this.f159219n = nru0Var.f143443l;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wit0 m177700a(wit0 wit0Var) {
        wit0Var.mo13747j0("/result", this.f159215j);
        nkt0 nkt0VarZzN = wit0Var.zzN();
        w9s0 w9s0Var = new w9s0(this.f159209d, null, null);
        fbv0 fbv0Var = this.f159216k;
        yew0 yew0Var = this.f159217l;
        xwu0 xwu0Var = this.f159210e;
        vcw0 vcw0Var = this.f159211f;
        dru0 dru0Var = this.f159206a;
        nkt0VarZzN.zzN(null, dru0Var, dru0Var, dru0Var, dru0Var, false, null, w9s0Var, null, null, fbv0Var, yew0Var, xwu0Var, vcw0Var, null, null, null, null, null);
        return wit0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m177701c(String str, JSONObject jSONObject, wit0 wit0Var) throws Exception {
        return this.f159215j.m177511b(wit0Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized hpr m177702d(final String str, final JSONObject jSONObject) {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return pvw0.m173981h(null);
        }
        return pvw0.m173987n(hprVar, new xuw0() { // from class: l.eru0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f95542a.m177701c(str, jSONObject, (wit0) obj);
            }
        }, this.f159212g);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m177703e(q6w0 q6w0Var, t6w0 t6w0Var) {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return;
        }
        pvw0.m173991r(hprVar, new kru0(this, q6w0Var, t6w0Var), this.f159212g);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m177704f() {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return;
        }
        pvw0.m173991r(hprVar, new gru0(this), this.f159212g);
        this.f159220o = null;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m177705g(String str, Map map) {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return;
        }
        pvw0.m173991r(hprVar, new jru0(this, "sendMessageToNativeJs", map), this.f159212g);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m177706h() {
        final String str = (String) jas0.m144075c().m176505a(sgs0.f167955D3);
        final Context context = this.f159209d;
        final v2s0 v2s0Var = this.f159213h;
        final zzcei zzceiVar = this.f159214i;
        final far0 far0Var = this.f159207b;
        final qbv0 qbv0Var = this.f159218m;
        final s7w0 s7w0Var = this.f159219n;
        hpr hprVarM173986m = pvw0.m173986m(pvw0.m173984k(new wuw0() { // from class: l.ijt0
            @Override // p153l.wuw0
            public final hpr zza() throws zzcjw {
                bxy0.m106916B();
                Context context2 = context;
                xkt0 xkt0VarM211415a = xkt0.m211415a();
                v2s0 v2s0Var2 = v2s0Var;
                qbv0 qbv0Var2 = qbv0Var;
                far0 far0Var2 = far0Var;
                wit0 wit0VarM145141a = jjt0.m145141a(context2, xkt0VarM211415a, "", false, false, v2s0Var2, null, zzceiVar, null, null, far0Var2, fcs0.m125045a(), null, null, qbv0Var2, s7w0Var);
                final sct0 sct0VarM185388d = sct0.m185388d(wit0VarM145141a);
                wit0VarM145141a.zzN().zzB(new lkt0() { // from class: l.hjt0
                    @Override // p153l.lkt0
                    /* JADX INFO: renamed from: a */
                    public final void mo99557a(boolean z, int i, String str2, String str3) {
                        sct0VarM185388d.m185389e();
                    }
                });
                wit0VarM145141a.loadUrl(str);
                return sct0VarM185388d;
            }
        }, oct0.f146737e), new eow0() { // from class: l.fru0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                wit0 wit0Var = (wit0) obj;
                this.f100477a.m177700a(wit0Var);
                return wit0Var;
            }
        }, this.f159212g);
        this.f159220o = hprVarM173986m;
        rct0.m180821a(hprVarM173986m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m177707i(String str, bqs0 bqs0Var) {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return;
        }
        pvw0.m173991r(hprVar, new hru0(this, str, bqs0Var), this.f159212g);
    }

    /* JADX INFO: renamed from: j */
    public final void m177708j(WeakReference weakReference, String str, bqs0 bqs0Var) {
        m177707i(str, new pru0(this, weakReference, str, bqs0Var, null));
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m177709k(String str, bqs0 bqs0Var) {
        hpr hprVar = this.f159220o;
        if (hprVar == null) {
            return;
        }
        pvw0.m173991r(hprVar, new iru0(this, str, bqs0Var), this.f159212g);
    }
}
