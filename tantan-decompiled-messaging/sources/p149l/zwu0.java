package p149l;

import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzecf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zwu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f205264a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f205265b;

    /* JADX INFO: renamed from: c */
    public final rxu0 f205266c;

    public zwu0(rmw0 rmw0Var, rmw0 rmw0Var2, rxu0 rxu0Var) {
        this.f205264a = rmw0Var;
        this.f205265b = rmw0Var2;
        this.f205266c = rxu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m220701a(zzbyi zzbyiVar) throws Exception {
        return this.f205266c.m181647c(zzbyiVar, ((Long) d1s0.m109677c().m144697a(m7s0.f132119Wa)).longValue());
    }

    /* JADX INFO: renamed from: b */
    public final gnr m220702b(final zzbyi zzbyiVar) {
        gnr gnrVarM142233f;
        String str = zzbyiVar.zzb;
        vny0.m199080r();
        if (C2075b.m12308b(str)) {
            gnrVarM142233f = jmw0.m142234g(new zzecf(1, "Ads signal service force local"));
        } else {
            gnrVarM142233f = jmw0.m142233f(jmw0.m142238k(new qlw0() { // from class: l.qwu0
                @Override // p149l.qlw0
                public final gnr zza() {
                    return this.f156777a.m220701a(zzbyiVar);
                }
            }, this.f205264a), ExecutionException.class, new rlw0() { // from class: l.rwu0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return jmw0.m142234g(cause);
                }
            }, this.f205265b);
        }
        return jmw0.m142241n(jmw0.m142233f(amw0.m97696C(gnrVarM142233f), zzecf.class, new rlw0() { // from class: l.swu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(null);
            }
        }, this.f205265b), new rlw0() { // from class: l.ywu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return jmw0.m142235h(jSONObject);
                }
                try {
                    vny0.m199080r();
                    jSONObject = new JSONObject(C2075b.m12320m(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e) {
                    vny0.m199079q().m212290w(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return jmw0.m142235h(jSONObject);
            }
        }, this.f205265b);
    }
}
