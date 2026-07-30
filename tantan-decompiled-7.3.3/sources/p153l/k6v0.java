package p153l;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k6v0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f124218a;

    /* JADX INFO: renamed from: b */
    public final f6v0 f124219b;

    /* JADX INFO: renamed from: c */
    public final lcw0 f124220c;

    public k6v0(xvw0 xvw0Var, f6v0 f6v0Var, lcw0 lcw0Var) {
        this.f124218a = xvw0Var;
        this.f124219b = f6v0Var;
        this.f124220c = lcw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m148578a(final zzbze zzbzeVar) {
        dcw0 dcw0VarM120409b = this.f124220c.m120409b(zzflg.GMS_SIGNALS, pvw0.m173986m(pvw0.m173981h(null), new eow0() { // from class: l.h6v0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                zzbze zzbzeVar2 = zzbzeVar;
                return new zzbyi(zzbzeVar2.zzc, zzbzeVar2.zzd, zzbzeVar2.zzf, epw0.m121874c(zzbzeVar2.zza.getString("ms")), -1, zzbzeVar2.zzh, zzbzeVar2.zze, zzbzeVar2.zzk, zzbzeVar2.zzl);
            }
        }, this.f124218a));
        final f6v0 f6v0Var = this.f124219b;
        Objects.requireNonNull(f6v0Var);
        return pvw0.m173986m(dcw0VarM120409b.m115308f(new xuw0() { // from class: l.i6v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return f6v0Var.m124323b((zzbyi) obj);
            }
        }).m115303a(), new eow0() { // from class: l.j6v0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbzeVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectM167055j = k6s0.m148569b().m167055j(bundle);
                    try {
                        k6s0.m148569b().m167058m(jSONObject, jSONObjectM167055j);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectM167055j;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.f124218a);
    }
}
