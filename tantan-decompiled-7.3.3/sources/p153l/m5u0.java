package p153l;

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
public final class m5u0 {

    /* JADX INFO: renamed from: a */
    public final lcw0 f134933a;

    /* JADX INFO: renamed from: b */
    public final zzcei f134934b;

    /* JADX INFO: renamed from: c */
    public final ApplicationInfo f134935c;

    /* JADX INFO: renamed from: d */
    public final String f134936d;

    /* JADX INFO: renamed from: e */
    public final List f134937e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f134938f;

    /* JADX INFO: renamed from: g */
    public final kpx0 f134939g;

    /* JADX INFO: renamed from: h */
    public final String f134940h;

    /* JADX INFO: renamed from: i */
    public final zuv0 f134941i;

    /* JADX INFO: renamed from: j */
    public final grw0 f134942j;

    /* JADX INFO: renamed from: k */
    public final o7w0 f134943k;

    /* JADX INFO: renamed from: l */
    public final fdu0 f134944l;

    public m5u0(lcw0 lcw0Var, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, kpx0 kpx0Var, grw0 grw0Var, String str2, zuv0 zuv0Var, o7w0 o7w0Var, fdu0 fdu0Var) {
        this.f134933a = lcw0Var;
        this.f134934b = zzceiVar;
        this.f134935c = applicationInfo;
        this.f134936d = str;
        this.f134937e = list;
        this.f134938f = packageInfo;
        this.f134939g = kpx0Var;
        this.f134940h = str2;
        this.f134941i = zuv0Var;
        this.f134942j = grw0Var;
        this.f134943k = o7w0Var;
        this.f134944l = fdu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbze m157124a(hpr hprVar) throws Exception {
        Bundle bundle = (Bundle) hprVar.get();
        String str = (String) ((hpr) this.f134939g.zzb()).get();
        boolean z = false;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168326h7)).booleanValue() && this.f134942j.mo131896f()) {
            z = true;
        }
        boolean z2 = z;
        String str2 = this.f134940h;
        PackageInfo packageInfo = this.f134938f;
        List list = this.f134937e;
        String str3 = this.f134936d;
        return new zzbze(bundle, this.f134934b, this.f134935c, str3, list, packageInfo, str, str2, null, null, z2, this.f134943k.m166386b());
    }

    /* JADX INFO: renamed from: b */
    public final hpr m157125b() {
        this.f134944l.zza();
        return rbw0.m180767c(this.f134941i.m221730a(new Bundle()), zzflg.SIGNALS, this.f134933a).m115303a();
    }

    /* JADX INFO: renamed from: c */
    public final hpr m157126c() {
        final hpr hprVarM157125b = m157125b();
        return this.f134933a.m120408a(zzflg.REQUEST_PARCEL, hprVarM157125b, (hpr) this.f134939g.zzb()).m171533a(new Callable() { // from class: l.l5u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f130168a.m157124a(hprVarM157125b);
            }
        }).m115303a();
    }
}
