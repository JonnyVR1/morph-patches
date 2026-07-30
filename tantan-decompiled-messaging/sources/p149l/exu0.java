package p149l;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class exu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f93694a;

    /* JADX INFO: renamed from: b */
    public final zwu0 f93695b;

    /* JADX INFO: renamed from: c */
    public final f3w0 f93696c;

    public exu0(rmw0 rmw0Var, zwu0 zwu0Var, f3w0 f3w0Var) {
        this.f93694a = rmw0Var;
        this.f93695b = zwu0Var;
        this.f93696c = f3w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m118707a(final zzbze zzbzeVar) {
        x2w0 x2w0VarM212753b = this.f93696c.m212753b(zzflg.GMS_SIGNALS, jmw0.m142240m(jmw0.m142235h(null), new yew0() { // from class: l.bxu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                zzbze zzbzeVar2 = zzbzeVar;
                return new zzbyi(zzbzeVar2.zzc, zzbzeVar2.zzd, zzbzeVar2.zzf, yfw0.m214595c(zzbzeVar2.zza.getString("ms")), -1, zzbzeVar2.zzh, zzbzeVar2.zze, zzbzeVar2.zzk, zzbzeVar2.zzl);
            }
        }, this.f93694a));
        final zwu0 zwu0Var = this.f93695b;
        Objects.requireNonNull(zwu0Var);
        return jmw0.m142240m(x2w0VarM212753b.m206878f(new rlw0() { // from class: l.cxu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return zwu0Var.m220702b((zzbyi) obj);
            }
        }).m206873a(), new yew0() { // from class: l.dxu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbzeVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectM134102j = exr0.m118703b().m134102j(bundle);
                    try {
                        exr0.m118703b().m134105m(jSONObject, jSONObjectM134102j);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectM134102j;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.f93694a);
    }
}
