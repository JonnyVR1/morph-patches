package p153l;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zfv0 implements tfv0 {

    /* JADX INFO: renamed from: a */
    public final qju0 f204238a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f204239b;

    /* JADX INFO: renamed from: c */
    public final wou0 f204240c;

    /* JADX INFO: renamed from: d */
    public final s8w0 f204241d;

    /* JADX INFO: renamed from: e */
    public final bsu0 f204242e;

    public zfv0(qju0 qju0Var, xvw0 xvw0Var, wou0 wou0Var, s8w0 s8w0Var, bsu0 bsu0Var) {
        this.f204238a = qju0Var;
        this.f204239b = xvw0Var;
        this.f204240c = wou0Var;
        this.f204241d = s8w0Var;
        this.f204242e = bsu0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        u6w0 u6w0Var = q6w0Var.f155911t;
        return (u6w0Var == null || u6w0Var.f177811c == null) ? false : true;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(final b7w0 b7w0Var, final q6w0 q6w0Var) {
        return pvw0.m173987n(pvw0.m173987n(this.f204241d.m185112a(), new xuw0() { // from class: l.wfv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f188890a.m219582e(q6w0Var, (qru0) obj);
            }
        }, this.f204239b), new xuw0() { // from class: l.xfv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f194092a.m219583f(b7w0Var, q6w0Var, (JSONArray) obj);
            }
        }, this.f204239b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ilu0 m219580c(hpr hprVar, hpr hprVar2, b7w0 b7w0Var, q6w0 q6w0Var, JSONObject jSONObject) throws Exception {
        ulu0 ulu0Var = (ulu0) hprVar.get();
        qru0 qru0Var = (qru0) hprVar2.get();
        vlu0 vlu0VarMo176886c = this.f204238a.mo176886c(new a0u0(b7w0Var, q6w0Var, null), new gmu0(ulu0Var), new fku0(jSONObject, qru0Var));
        vlu0VarMo176886c.mo201724j().m112086b();
        vlu0VarMo176886c.mo201725k().m159713a(qru0Var);
        vlu0VarMo176886c.mo201723i().m131474a(ulu0Var.m196602f0());
        vlu0VarMo176886c.mo201726l().m99969a(this.f204242e);
        return vlu0VarMo176886c.mo159611h();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m219581d(qru0 qru0Var, JSONObject jSONObject) throws Exception {
        this.f204241d.m185113b(pvw0.m173981h(qru0Var));
        if (jSONObject.optBoolean("success")) {
            return pvw0.m173981h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbrm("process json failed");
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hpr m219582e(q6w0 q6w0Var, final qru0 qru0Var) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168518w8)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", q6w0Var.f155911t.f177811c);
        jSONObject2.put("sdk_params", jSONObject);
        return pvw0.m173987n(qru0Var.m177702d("google.afma.nativeAds.preProcessJson", jSONObject2), new xuw0() { // from class: l.vfv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f183980a.m219581d(qru0Var, (JSONObject) obj);
            }
        }, this.f204239b);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hpr m219583f(b7w0 b7w0Var, q6w0 q6w0Var, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return pvw0.m173980g(new zzead(3));
        }
        if (b7w0Var.f75342a.f197721a.f145325k <= 1) {
            return pvw0.m173986m(m219584g(b7w0Var, q6w0Var, jSONArray.getJSONObject(0)), new eow0() { // from class: l.yfv0
                @Override // p153l.eow0
                public final Object apply(Object obj) {
                    return Collections.singletonList(pvw0.m173981h((ilu0) obj));
                }
            }, this.f204239b);
        }
        int length = jSONArray.length();
        this.f204241d.m185114c(Math.min(length, b7w0Var.f75342a.f197721a.f145325k));
        ArrayList arrayList = new ArrayList(b7w0Var.f75342a.f197721a.f145325k);
        for (int i = 0; i < b7w0Var.f75342a.f197721a.f145325k; i++) {
            if (i < length) {
                arrayList.add(m219584g(b7w0Var, q6w0Var, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(pvw0.m173980g(new zzead(3)));
            }
        }
        return pvw0.m173981h(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final hpr m219584g(final b7w0 b7w0Var, final q6w0 q6w0Var, final JSONObject jSONObject) {
        wou0 wou0Var = this.f204240c;
        final hpr hprVarM185112a = this.f204241d.m185112a();
        final hpr hprVarM207360a = wou0Var.m207360a(b7w0Var, q6w0Var, jSONObject);
        return pvw0.m173976c(hprVarM185112a, hprVarM207360a).m169489a(new Callable() { // from class: l.ufv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f178808a.m219580c(hprVarM207360a, hprVarM185112a, b7w0Var, q6w0Var, jSONObject);
            }
        }, this.f204239b);
    }
}
