package p149l;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jwu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f120134a;

    /* JADX INFO: renamed from: b */
    public final kvu0 f120135b;

    /* JADX INFO: renamed from: c */
    public final egx0 f120136c;

    /* JADX INFO: renamed from: d */
    public final b5w0 f120137d;

    /* JADX INFO: renamed from: e */
    public final Context f120138e;

    /* JADX INFO: renamed from: f */
    public final zzcei f120139f;

    public jwu0(rmw0 rmw0Var, kvu0 kvu0Var, egx0 egx0Var, b5w0 b5w0Var, Context context, zzcei zzceiVar) {
        this.f120134a = rmw0Var;
        this.f120135b = kvu0Var;
        this.f120136c = egx0Var;
        this.f120137d = b5w0Var;
        this.f120138e = context;
        this.f120139f = zzceiVar;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m143673a(final zzbze zzbzeVar) {
        rlw0 rlw0Var = new rlw0() { // from class: l.dwu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                String str = new String(ckw0.m107432b((InputStream) obj), wew0.f185990c);
                zzbze zzbzeVar2 = zzbzeVar;
                zzbzeVar2.zzj = str;
                return jmw0.m142235h(zzbzeVar2);
            }
        };
        final kvu0 kvu0Var = this.f120135b;
        Objects.requireNonNull(kvu0Var);
        return m143680h(zzbzeVar, new iwu0() { // from class: l.ewu0
            @Override // p149l.iwu0
            /* JADX INFO: renamed from: a */
            public final gnr mo104252a(zzbze zzbzeVar2) {
                return kvu0Var.m147392b(zzbzeVar2);
            }
        }, new iwu0() { // from class: l.fwu0
            @Override // p149l.iwu0
            /* JADX INFO: renamed from: a */
            public final gnr mo104252a(zzbze zzbzeVar2) {
                return this.f99686a.m143676d(zzbzeVar2);
            }
        }, rlw0Var);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m143674b(JSONObject jSONObject) {
        return jmw0.m142241n(amw0.m97696C(jmw0.m142235h(jSONObject)), vny0.m199070h().m219291a(this.f120138e, this.f120139f, this.f120137d).m137088a("AFMA_getAdDictionary", fms0.f98370b, new ams0() { // from class: l.zvu0
            @Override // p149l.ams0
            /* JADX INFO: renamed from: a */
            public final Object mo97686a(JSONObject jSONObject2) {
                return new mvs0(jSONObject2);
            }
        }), this.f120134a);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m143675c(iwu0 iwu0Var, zzbze zzbzeVar, rlw0 rlw0Var, zzecf zzecfVar) throws Exception {
        return jmw0.m142241n(iwu0Var.mo104252a(zzbzeVar), rlw0Var, this.f120134a);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m143676d(zzbze zzbzeVar) {
        return ((oyu0) this.f120136c.zzb()).m166702o8(zzbzeVar, Binder.getCallingUid());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gnr m143677e(zzbze zzbzeVar) {
        return this.f120135b.m147393c(zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gnr m143678f(zzbze zzbzeVar) {
        return ((oyu0) this.f120136c.zzb()).m166705r8(zzbzeVar.zzh);
    }

    /* JADX INFO: renamed from: g */
    public final gnr m143679g(zzbze zzbzeVar) {
        return m143680h(zzbzeVar, new iwu0() { // from class: l.bwu0
            @Override // p149l.iwu0
            /* JADX INFO: renamed from: a */
            public final gnr mo104252a(zzbze zzbzeVar2) {
                return this.f77710a.m143677e(zzbzeVar2);
            }
        }, new iwu0() { // from class: l.cwu0
            @Override // p149l.iwu0
            /* JADX INFO: renamed from: a */
            public final gnr mo104252a(zzbze zzbzeVar2) {
                return this.f82813a.m143678f(zzbzeVar2);
            }
        }, new rlw0() { // from class: l.awu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(null);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final gnr m143680h(final zzbze zzbzeVar, iwu0 iwu0Var, final iwu0 iwu0Var2, final rlw0 rlw0Var) {
        gnr gnrVarM142233f;
        String str = zzbzeVar.zzd;
        vny0.m199080r();
        if (C2075b.m12308b(str)) {
            gnrVarM142233f = jmw0.m142234g(new zzecf(1));
        } else {
            gnrVarM142233f = jmw0.m142233f(iwu0Var.mo104252a(zzbzeVar), ExecutionException.class, new rlw0() { // from class: l.hwu0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return jmw0.m142234g(cause);
                }
            }, this.f120134a);
        }
        return jmw0.m142233f(jmw0.m142241n(amw0.m97696C(gnrVarM142233f), rlw0Var, this.f120134a), zzecf.class, new rlw0() { // from class: l.gwu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f104791a.m143675c(iwu0Var2, zzbzeVar, rlw0Var, (zzecf) obj);
            }
        }, this.f120134a);
    }
}
