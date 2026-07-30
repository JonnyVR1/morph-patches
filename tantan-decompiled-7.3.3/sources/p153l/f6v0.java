package p153l;

import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzecf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f6v0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f97449a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f97450b;

    /* JADX INFO: renamed from: c */
    public final x6v0 f97451c;

    public f6v0(xvw0 xvw0Var, xvw0 xvw0Var2, x6v0 x6v0Var) {
        this.f97449a = xvw0Var;
        this.f97450b = xvw0Var2;
        this.f97451c = x6v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m124322a(zzbyi zzbyiVar) throws Exception {
        return this.f97451c.m209558c(zzbyiVar, ((Long) jas0.m144075c().m176505a(sgs0.f168190Wa)).longValue());
    }

    /* JADX INFO: renamed from: b */
    public final hpr m124323b(final zzbyi zzbyiVar) {
        hpr hprVarM173979f;
        String str = zzbyiVar.zzb;
        bxy0.m106934r();
        if (C2098b.m12362b(str)) {
            hprVarM173979f = pvw0.m173980g(new zzecf(1, "Ads signal service force local"));
        } else {
            hprVarM173979f = pvw0.m173979f(pvw0.m173984k(new wuw0() { // from class: l.w5v0
                @Override // p153l.wuw0
                public final hpr zza() {
                    return this.f187562a.m124322a(zzbyiVar);
                }
            }, this.f97449a), ExecutionException.class, new xuw0() { // from class: l.x5v0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return pvw0.m173980g(cause);
                }
            }, this.f97450b);
        }
        return pvw0.m173987n(pvw0.m173979f(gvw0.m132580C(hprVarM173979f), zzecf.class, new xuw0() { // from class: l.y5v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(null);
            }
        }, this.f97450b), new xuw0() { // from class: l.e6v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return pvw0.m173981h(jSONObject);
                }
                try {
                    bxy0.m106934r();
                    jSONObject = new JSONObject(C2098b.m12374m(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    bxy0.m106933q().m120275w(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return pvw0.m173981h(jSONObject);
            }
        }, this.f97450b);
    }
}
