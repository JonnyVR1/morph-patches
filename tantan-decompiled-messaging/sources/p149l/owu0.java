package p149l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class owu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f146085a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f146086b;

    /* JADX INFO: renamed from: c */
    public final oxu0 f146087c;

    /* JADX INFO: renamed from: d */
    public final egx0 f146088d;

    public owu0(rmw0 rmw0Var, rmw0 rmw0Var2, oxu0 oxu0Var, egx0 egx0Var) {
        this.f146085a = rmw0Var;
        this.f146086b = rmw0Var2;
        this.f146087c = oxu0Var;
        this.f146088d = egx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m166435a(zzbym zzbymVar) throws Exception {
        return this.f146087c.m166598c(zzbymVar, ((Long) d1s0.m109677c().m144697a(m7s0.f132131Xa)).longValue());
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m166436b(zzbym zzbymVar, int i, zzecf zzecfVar) throws Exception {
        return ((yyu0) this.f146088d.zzb()).m216568o8(zzbymVar, i);
    }

    /* JADX INFO: renamed from: c */
    public final gnr m166437c(final zzbym zzbymVar) {
        gnr gnrVarM142233f;
        String str = zzbymVar.zzf;
        vny0.m199080r();
        if (C2075b.m12308b(str)) {
            gnrVarM142233f = jmw0.m142234g(new zzecf(1, "Ads service proxy force local"));
        } else {
            gnrVarM142233f = jmw0.m142233f(jmw0.m142238k(new qlw0() { // from class: l.lwu0
                @Override // p149l.qlw0
                public final gnr zza() {
                    return this.f130309a.m166435a(zzbymVar);
                }
            }, this.f146085a), ExecutionException.class, new rlw0() { // from class: l.mwu0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return jmw0.m142234g(cause);
                }
            }, this.f146086b);
        }
        final int callingUid = Binder.getCallingUid();
        return jmw0.m142233f(gnrVarM142233f, zzecf.class, new rlw0() { // from class: l.nwu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f140974a.m166436b(zzbymVar, callingUid, (zzecf) obj);
            }
        }, this.f146086b);
    }
}
