package p153l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzflg;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r6v0 {

    /* JADX INFO: renamed from: a */
    public final v9u0 f161497a;

    /* JADX INFO: renamed from: b */
    public final u5v0 f161498b;

    /* JADX INFO: renamed from: c */
    public final lcw0 f161499c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f161500d;

    /* JADX INFO: renamed from: e */
    public final zzcei f161501e;

    /* JADX INFO: renamed from: f */
    public final hew0 f161502f;

    /* JADX INFO: renamed from: g */
    public final cew0 f161503g;

    /* JADX INFO: renamed from: h */
    public final Context f161504h;

    /* JADX INFO: renamed from: i */
    public final xvw0 f161505i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public hpr f161506j;

    public r6v0(v9u0 v9u0Var, u5v0 u5v0Var, lcw0 lcw0Var, o7w0 o7w0Var, zzcei zzceiVar, hew0 hew0Var, cew0 cew0Var, Context context, xvw0 xvw0Var) {
        this.f161497a = v9u0Var;
        this.f161498b = u5v0Var;
        this.f161499c = lcw0Var;
        this.f161500d = o7w0Var;
        this.f161501e = zzceiVar;
        this.f161502f = hew0Var;
        this.f161503g = cew0Var;
        this.f161504h = context;
        this.f161505i = xvw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbym m180052a(zzbze zzbzeVar, g8v0 g8v0Var) {
        g8v0Var.f102717c.put("Content-Type", g8v0Var.f102719e);
        g8v0Var.f102717c.put("User-Agent", bxy0.m106934r().m12389E(this.f161504h, zzbzeVar.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : g8v0Var.f102717c.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbym(g8v0Var.f102715a, g8v0Var.f102716b, bundle, g8v0Var.f102718d, g8v0Var.f102720f, zzbzeVar.zzd, zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: c */
    public final hpr m180053c(final zzbze zzbzeVar, final JSONObject jSONObject, final s4t0 s4t0Var) {
        this.f161497a.mo107088x(zzbzeVar);
        dcw0 dcw0VarM120409b = this.f161499c.m120409b(zzflg.PROXY, pvw0.m173986m(this.f161499c.m120409b(zzflg.PREPARE_HTTP_REQUEST, pvw0.m173981h(new p8v0(jSONObject, s4t0Var))).m115307e(new q8v0(zzbzeVar.zzg, this.f161503g, qdw0.m176209a(this.f161504h, 9))).m115303a(), new eow0() { // from class: l.n6v0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return this.f140489a.m180052a(zzbzeVar, (g8v0) obj);
            }
        }, this.f161505i));
        final u5v0 u5v0Var = this.f161498b;
        Objects.requireNonNull(u5v0Var);
        mbw0 mbw0VarM115303a = dcw0VarM120409b.m115308f(new xuw0() { // from class: l.o6v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return u5v0Var.m194629c((zzbym) obj);
            }
        }).m115303a();
        this.f161506j = mbw0VarM115303a;
        hpr hprVarM173987n = pvw0.m173987n(this.f161499c.m120409b(zzflg.PRE_PROCESS, mbw0VarM115303a).m115307e(new kbw0() { // from class: l.m6v0
            @Override // p153l.kbw0
            public final Object zza(Object obj) {
                return new t7v0(h8v0.m133991a(new InputStreamReader((InputStream) obj)), jSONObject, s4t0Var);
            }
        }).m115308f(bxy0.m106924h().m127699a(this.f161504h, this.f161501e, this.f161502f).m169486a("google.afma.response.normalize", t7v0.f172471d, lvs0.f133730c)).m115303a(), new xuw0() { // from class: l.p6v0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f150877a.m180054d((InputStream) obj);
            }
        }, this.f161505i);
        pvw0.m173991r(hprVarM173987n, new q6v0(this), this.f161505i);
        return hprVarM173987n;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m180054d(InputStream inputStream) throws Exception {
        return pvw0.m173981h(new b7w0(new y6w0(this.f161500d), a7w0.m96387a(new InputStreamReader(inputStream))));
    }
}
