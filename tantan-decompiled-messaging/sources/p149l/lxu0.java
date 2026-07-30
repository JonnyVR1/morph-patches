package p149l;

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
public final class lxu0 {

    /* JADX INFO: renamed from: a */
    public final p0u0 f130434a;

    /* JADX INFO: renamed from: b */
    public final owu0 f130435b;

    /* JADX INFO: renamed from: c */
    public final f3w0 f130436c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f130437d;

    /* JADX INFO: renamed from: e */
    public final zzcei f130438e;

    /* JADX INFO: renamed from: f */
    public final b5w0 f130439f;

    /* JADX INFO: renamed from: g */
    public final w4w0 f130440g;

    /* JADX INFO: renamed from: h */
    public final Context f130441h;

    /* JADX INFO: renamed from: i */
    public final rmw0 f130442i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public gnr f130443j;

    public lxu0(p0u0 p0u0Var, owu0 owu0Var, f3w0 f3w0Var, iyv0 iyv0Var, zzcei zzceiVar, b5w0 b5w0Var, w4w0 w4w0Var, Context context, rmw0 rmw0Var) {
        this.f130434a = p0u0Var;
        this.f130435b = owu0Var;
        this.f130436c = f3w0Var;
        this.f130437d = iyv0Var;
        this.f130438e = zzceiVar;
        this.f130439f = b5w0Var;
        this.f130440g = w4w0Var;
        this.f130441h = context;
        this.f130442i = rmw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbym m152092a(zzbze zzbzeVar, azu0 azu0Var) {
        azu0Var.f72383c.put("Content-Type", azu0Var.f72385e);
        azu0Var.f72383c.put("User-Agent", vny0.m199080r().m12335E(this.f130441h, zzbzeVar.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : azu0Var.f72383c.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbym(azu0Var.f72381a, azu0Var.f72382b, bundle, azu0Var.f72384d, azu0Var.f72386f, zzbzeVar.zzd, zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: c */
    public final gnr m152093c(final zzbze zzbzeVar, final JSONObject jSONObject, final mvs0 mvs0Var) {
        this.f130434a.mo97694x(zzbzeVar);
        x2w0 x2w0VarM212753b = this.f130436c.m212753b(zzflg.PROXY, jmw0.m142240m(this.f130436c.m212753b(zzflg.PREPARE_HTTP_REQUEST, jmw0.m142235h(new jzu0(jSONObject, mvs0Var))).m206877e(new kzu0(zzbzeVar.zzg, this.f130440g, k4w0.m144514a(this.f130441h, 9))).m206873a(), new yew0() { // from class: l.hxu0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return this.f109925a.m152092a(zzbzeVar, (azu0) obj);
            }
        }, this.f130442i));
        final owu0 owu0Var = this.f130435b;
        Objects.requireNonNull(owu0Var);
        g2w0 g2w0VarM206873a = x2w0VarM212753b.m206878f(new rlw0() { // from class: l.ixu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return owu0Var.m166437c((zzbym) obj);
            }
        }).m206873a();
        this.f130443j = g2w0VarM206873a;
        gnr gnrVarM142241n = jmw0.m142241n(this.f130436c.m212753b(zzflg.PRE_PROCESS, g2w0VarM206873a).m206877e(new e2w0() { // from class: l.gxu0
            @Override // p149l.e2w0
            public final Object zza(Object obj) {
                return new nyu0(bzu0.m104645a(new InputStreamReader((InputStream) obj)), jSONObject, mvs0Var);
            }
        }).m206878f(vny0.m199070h().m219291a(this.f130441h, this.f130438e, this.f130439f).m137088a("google.afma.response.normalize", nyu0.f141162d, fms0.f98371c)).m206873a(), new rlw0() { // from class: l.jxu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f120248a.m152094d((InputStream) obj);
            }
        }, this.f130442i);
        jmw0.m142245r(gnrVarM142241n, new kxu0(this), this.f130442i);
        return gnrVarM142241n;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m152094d(InputStream inputStream) throws Exception {
        return jmw0.m142235h(new vxv0(new sxv0(this.f130437d), uxv0.m196212a(new InputStreamReader(inputStream))));
    }
}
