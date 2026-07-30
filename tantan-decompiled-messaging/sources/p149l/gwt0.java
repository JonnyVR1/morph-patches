package p149l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzflg;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class gwt0 {

    /* JADX INFO: renamed from: a */
    public final f3w0 f104779a;

    /* JADX INFO: renamed from: b */
    public final zzcei f104780b;

    /* JADX INFO: renamed from: c */
    public final ApplicationInfo f104781c;

    /* JADX INFO: renamed from: d */
    public final String f104782d;

    /* JADX INFO: renamed from: e */
    public final List f104783e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f104784f;

    /* JADX INFO: renamed from: g */
    public final egx0 f104785g;

    /* JADX INFO: renamed from: h */
    public final String f104786h;

    /* JADX INFO: renamed from: i */
    public final tlv0 f104787i;

    /* JADX INFO: renamed from: j */
    public final aiw0 f104788j;

    /* JADX INFO: renamed from: k */
    public final iyv0 f104789k;

    /* JADX INFO: renamed from: l */
    public final z3u0 f104790l;

    public gwt0(f3w0 f3w0Var, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, egx0 egx0Var, aiw0 aiw0Var, String str2, tlv0 tlv0Var, iyv0 iyv0Var, z3u0 z3u0Var) {
        this.f104779a = f3w0Var;
        this.f104780b = zzceiVar;
        this.f104781c = applicationInfo;
        this.f104782d = str;
        this.f104783e = list;
        this.f104784f = packageInfo;
        this.f104785g = egx0Var;
        this.f104786h = str2;
        this.f104787i = tlv0Var;
        this.f104788j = aiw0Var;
        this.f104789k = iyv0Var;
        this.f104790l = z3u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbze m128512a(gnr gnrVar) throws Exception {
        Bundle bundle = (Bundle) gnrVar.get();
        String str = (String) ((gnr) this.f104785g.zzb()).get();
        boolean z = false;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132255h7)).booleanValue() && this.f104788j.mo96947f()) {
            z = true;
        }
        boolean z2 = z;
        String str2 = this.f104786h;
        PackageInfo packageInfo = this.f104784f;
        List list = this.f104783e;
        String str3 = this.f104782d;
        return new zzbze(bundle, this.f104780b, this.f104781c, str3, list, packageInfo, str, str2, null, null, z2, this.f104789k.m139022b());
    }

    /* JADX INFO: renamed from: b */
    public final gnr m128513b() {
        this.f104790l.zza();
        return l2w0.m148323c(this.f104787i.m189627a(new Bundle()), zzflg.SIGNALS, this.f104779a).m206873a();
    }

    /* JADX INFO: renamed from: c */
    public final gnr m128514c() {
        final gnr gnrVarM128513b = m128513b();
        return this.f104779a.m212752a(zzflg.REQUEST_PARCEL, gnrVarM128513b, (gnr) this.f104785g.zzb()).m139497a(new Callable() { // from class: l.fwt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f99684a.m128512a(gnrVarM128513b);
            }
        }).m206873a();
    }
}
